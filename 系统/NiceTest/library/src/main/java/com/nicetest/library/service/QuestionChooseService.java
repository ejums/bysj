package com.nicetest.library.service;

import com.nicetest.library.vo.QuestionChooseVO;

/**
 * @author hjm09
 */
public interface QuestionChooseService {
    /**
     * save choose
     * @param vo choose pojo
     * @return change rows of database
     */
    int save(QuestionChooseVO vo);
}
