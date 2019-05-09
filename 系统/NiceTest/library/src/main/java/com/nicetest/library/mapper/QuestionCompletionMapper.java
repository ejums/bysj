package com.nicetest.library.mapper;

import com.nicetest.library.entity.QuestionCompletion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hjm09
 */
public interface QuestionCompletionMapper  extends JpaRepository<QuestionCompletion, Integer> {
}
