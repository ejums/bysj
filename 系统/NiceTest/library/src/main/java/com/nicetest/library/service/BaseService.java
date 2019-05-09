package com.nicetest.library.service;

import com.alibaba.druid.sql.ast.expr.SQLBinaryOperator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.HashMap;

public interface BaseService<T> {
    /**
     * page of data query
     * @param t object
     * @param pageable pageable
     * @return data
     */
    Page<T> findAll(T t, Pageable pageable);

    Page<T> findAll(T t, Pageable pageable, HashMap<String, SQLBinaryOperator> map);

    <E> Page<T> findAll(E t, Pageable pageable,HashMap<String, String> columnMap,
                               HashMap<String, SQLBinaryOperator> map);

}
