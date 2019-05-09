package com.nicetest.library.service.impl;

import com.nicetest.library.entity.QuestionCompletion;
import com.nicetest.library.mapper.QuestionCompletionMapper;
import com.nicetest.library.service.QuestionCompletionService;
import com.nicetest.library.util.JSONUtil;
import com.nicetest.library.util.UserManager;
import com.nicetest.library.vo.QuestionCompletionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author hjm09
 */
@Service
public class QuestionCompletionServiceImpl implements QuestionCompletionService {
    private final QuestionCompletionMapper mapper;

    @Autowired
    public QuestionCompletionServiceImpl(QuestionCompletionMapper mapper) {
        this.mapper = mapper;
    }

    @SuppressWarnings("unchecked")
    @Override
    public int save(QuestionCompletionVO vo) {
        QuestionCompletion completion = new QuestionCompletion();
        completion.setTopic(vo.getTopic());
        completion.setAnswer(JSONUtil.stringify(vo.getAnswer()));
        completion.setRemarks(vo.getRemark());
        completion.setKeyword(vo.getKeyword());
        Map map = UserManager.currentUser();
        completion.setCreateUser((String) map.get("nickname"));
        completion.setCreateUserId((Integer)map.getOrDefault("id",0));
        mapper.save(completion);
        return 1;
    }
}
