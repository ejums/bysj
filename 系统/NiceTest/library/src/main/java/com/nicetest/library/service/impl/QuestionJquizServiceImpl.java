package com.nicetest.library.service.impl;

import com.nicetest.library.entity.QuestionJquiz;
import com.nicetest.library.mapper.QuestionJquizMapper;
import com.nicetest.library.service.QuestionJquizService;
import com.nicetest.library.util.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class QuestionJquizServiceImpl implements QuestionJquizService {
    private final QuestionJquizMapper mapper;

    @Autowired
    public QuestionJquizServiceImpl(QuestionJquizMapper mapper) {
        this.mapper = mapper;
    }


    @SuppressWarnings("unchecked")
    @Override
    public int save(QuestionJquiz jquiz) {
        Map map = UserManager.currentUser();
        jquiz.setCreateUser((String) map.get("nickname"));
        jquiz.setCreateUserId((Integer)map.getOrDefault("id",0));
        mapper.save(jquiz);
        return 0;
    }
}
