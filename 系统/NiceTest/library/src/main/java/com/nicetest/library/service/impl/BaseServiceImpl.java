package com.nicetest.library.service.impl;

import com.alibaba.druid.sql.ast.expr.SQLBinaryOperator;
import com.nicetest.library.mapper.BaseMapper;
import com.nicetest.library.service.BaseService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author hjm09
 */
@SuppressWarnings("unchecked")
@Service
public class BaseServiceImpl<T> implements BaseService<T> {

    protected final BaseMapper baseMapper;

    @Autowired
    public BaseServiceImpl(BaseMapper baseMapper) {
        this.baseMapper = baseMapper;
    }

    @Override
    public Page<T> findAll(T t, Pageable pageable){
        return this.findAll(t,pageable, null);
    }

    @Override
    public Page<T> findAll(T t, Pageable pageable, HashMap<String, SQLBinaryOperator> map) {
        Method[] methods = t.getClass().getMethods();
        Specification<T> specification = (Specification<T>) (root, query, criteriaBuilder) -> {
            List<Predicate> predicateList = new ArrayList<>();
            for (Method method : methods) {
                if (method.getName().startsWith("get") && !method.getName().startsWith("getClass")) {
                    try {
                        String simpleName = method.getReturnType().getSimpleName();
                        Object invoke = method.invoke(t);
                        if(invoke == null){
                            continue;
                        }
                        String name = method.getName().substring(3, 4).toLowerCase() + method.getName().substring(4);
                        String value = (String)invoke;
                        if(map.get(name) == null){
                            predicateList.add(criteriaBuilder.equal(root.get(name), invoke));
                        }else{
                            switch (map.get(name)){
                                case Like:
                                    predicateList.add(criteriaBuilder.like(root.get(name), '%'+value+'%'));
                                    break;
                                case RLike:
                                    predicateList.add(criteriaBuilder.like(root.get(name), value+'%'));
                                    break;
                                case ILike:
                                    predicateList.add(criteriaBuilder.like(root.get(name), '%'+value));
                                    break;
                                default:
                                    predicateList.add(criteriaBuilder.equal(root.get(name), invoke));
                                    break;
                            }
                        }
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
            query.where(predicateList.toArray(new Predicate[0]));
            return null;
        };
        long count = baseMapper.count(specification);
        if(count < pageable.getOffset()){
            pageable = PageRequest.of((int)(count/pageable.getPageSize()-1), pageable.getPageSize());
        }
        return baseMapper.findAll(specification, pageable);
    }

    @Override
    public <E> Page<T> findAll(E e, Pageable pageable,HashMap<String, String> columnMap,
                                      HashMap<String, SQLBinaryOperator> map) {
        Method[] methods = e.getClass().getMethods();
        Specification<T> specification = (Specification<T>) (root, query, criteriaBuilder) -> {
            List<Predicate> predicateList = new ArrayList<>();
            for (Method method : methods) {
                if (method.getName().startsWith("get") && !method.getName().startsWith("getClass")) {
                    try {
                        String simpleName = method.getReturnType().getSimpleName();
                        Object invoke = method.invoke(e);
                        if(invoke == null){
                            continue;
                        }
                        String fieldName = method.getName().substring(3, 4).toLowerCase() + method.getName().substring(4);
                        String columnName = fieldName;
                        if(columnMap!=null && columnMap.containsKey(fieldName)){
                            String name = columnMap.get(fieldName);
                            if(!Strings.isEmpty(name)){
                                columnName = name;
                            }
                        }
                        Path<String> path = root.get(columnName);
                        if(map.get(fieldName) == null){
                            predicateList.add(criteriaBuilder.equal(path, invoke));
                        }else{
                            switch (map.get(fieldName)){
                                case Like:
                                    predicateList.add(criteriaBuilder.like(path, '%'+(String)invoke+'%'));
                                    break;
                                case RLike:
                                    predicateList.add(criteriaBuilder.like(path, (String)invoke+'%'));
                                    break;
                                case ILike:
                                    predicateList.add(criteriaBuilder.like(path, '%'+(String)invoke));
                                    break;
                                case LessThanOrEqual:
                                    predicateList.add(criteriaBuilder.lessThanOrEqualTo(root.get(columnName)
                                            .as(LocalDateTime.class), (LocalDateTime)invoke));
                                    if("LocalDateTime".equals(method.getReturnType().getSimpleName())){
                                        predicateList.add(criteriaBuilder.lessThanOrEqualTo(root.get(columnName)
                                                        .as(LocalDateTime.class), (LocalDateTime)invoke));
                                    }else{
                                        predicateList.add(criteriaBuilder.lessThanOrEqualTo(path, (String)invoke));
                                    }
                                    break;
                                case GreaterThanOrEqual:
                                    if("LocalDateTime".equals(method.getReturnType().getSimpleName())){
                                        predicateList.add(criteriaBuilder.greaterThanOrEqualTo(root.get(columnName)
                                                .as(LocalDateTime.class), (LocalDateTime)invoke));
                                    }else{
                                        predicateList.add(criteriaBuilder.greaterThanOrEqualTo(path, (String)invoke));
                                    }
                                    break;
                                default:
                                    predicateList.add(criteriaBuilder.equal(path, invoke));
                                    break;
                            }
                        }
                    } catch (IllegalAccessException | InvocationTargetException ev) {
                        ev.printStackTrace();
                    }
                }
            }
            query.where(predicateList.toArray(new Predicate[0]));
            return null;
        };
        long count = baseMapper.count(specification);
        if(count < pageable.getOffset()){
            pageable = PageRequest.of((int)(count/pageable.getPageSize()-1), pageable.getPageSize());
        }
        return baseMapper.findAll(specification, pageable);
    }
}
