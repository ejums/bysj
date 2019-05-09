package com.nicetest.library.mapper.view;

import com.nicetest.library.entity.view.QuestionAllShow;
import com.nicetest.library.mapper.BaseMapper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hjm09
 */
public interface QuestionAllShowMapper extends JpaRepository<QuestionAllShow, String>, BaseMapper<QuestionAllShow> {

}

