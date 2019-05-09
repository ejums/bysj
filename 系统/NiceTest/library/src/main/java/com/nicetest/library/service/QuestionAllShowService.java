package com.nicetest.library.service;

import com.alibaba.druid.sql.ast.expr.SQLBinaryOperator;
import com.nicetest.library.entity.view.QuestionAllShow;
import com.nicetest.library.vo.QuestionSelectVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.HashMap;

/**
 * @author hjm09
 */
public interface QuestionAllShowService extends BaseService<QuestionAllShow>{
    /**
     * query data
     * @param vo vo
     * @param pageable page info
     * @return page data
     */
     Page<QuestionAllShow> findAll(QuestionSelectVO vo, Pageable pageable);
}
