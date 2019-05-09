package com.nicetest.library.service;

import com.nicetest.library.vo.QuestionJudgeVO;

/**
 * @author hjm09
 */
public interface QuestionJudgeService {
    /**
     * insert value
     * @param vo object
     * @return change row
     */
    int save(QuestionJudgeVO vo);
}
