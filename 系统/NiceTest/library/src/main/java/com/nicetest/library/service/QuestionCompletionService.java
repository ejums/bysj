package com.nicetest.library.service;

import com.nicetest.library.vo.QuestionCompletionVO;

/**
 * @author hjm09
 */
public interface QuestionCompletionService {
    /**
     * insert value
     * @param vo object
     * @return change rows
     */
    int save(QuestionCompletionVO vo);
}
