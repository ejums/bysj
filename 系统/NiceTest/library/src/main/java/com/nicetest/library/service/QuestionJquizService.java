package com.nicetest.library.service;

import com.nicetest.library.entity.QuestionJquiz;

/**
 * @author hjm09
 */
public interface QuestionJquizService {
    /**
     * insert value
     * @param jquiz object
     * @return change row
     */
    int save(QuestionJquiz jquiz);
}
