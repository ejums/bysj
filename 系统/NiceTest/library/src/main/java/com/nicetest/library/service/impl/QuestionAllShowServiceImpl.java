package com.nicetest.library.service.impl;

import com.alibaba.druid.sql.ast.expr.SQLBinaryOperator;
import com.nicetest.library.entity.view.QuestionAllShow;
import com.nicetest.library.mapper.BaseMapper;
import com.nicetest.library.mapper.view.QuestionAllShowMapper;
import com.nicetest.library.service.QuestionAllShowService;
import com.nicetest.library.vo.QuestionSelectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class QuestionAllShowServiceImpl extends BaseServiceImpl<QuestionAllShow> implements QuestionAllShowService {


    private final QuestionAllShowMapper mapper;

    @Autowired
    public QuestionAllShowServiceImpl(BaseMapper baseMapper, QuestionAllShowMapper mapper) {
        super(baseMapper);
        this.mapper = mapper;
    }


    @Override
    public Page<QuestionAllShow> findAll(QuestionAllShow allShow, Pageable pageable) {
        HashMap<String, SQLBinaryOperator> map = new HashMap<>();
        map.put("keyword", SQLBinaryOperator.Like);
        return findAll(allShow, pageable, map);
    }

    @Override
    public Page<QuestionAllShow> findAll(QuestionSelectVO vo, Pageable pageable) {
        HashMap<String, SQLBinaryOperator> map = new HashMap<>(10);
        map.put("keyword", SQLBinaryOperator.Like);
        map.put("startDate", SQLBinaryOperator.GreaterThanOrEqual);
        map.put("endDate", SQLBinaryOperator.LessThanOrEqual);
        HashMap<String, String> columnMapping = new HashMap<>(10);
        columnMapping.put("startDate", "createDate");
        columnMapping.put("endDate", "createDate");
        return findAll(vo, pageable,columnMapping,map);
    }
}
