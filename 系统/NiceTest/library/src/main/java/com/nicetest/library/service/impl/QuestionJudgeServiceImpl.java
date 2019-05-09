package com.nicetest.library.service.impl;

import com.nicetest.library.entity.QuestionJudge;
import com.nicetest.library.mapper.QuestionJudgeMapper;
import com.nicetest.library.service.QuestionJudgeService;
import com.nicetest.library.util.UserManager;
import com.nicetest.library.vo.QuestionJudgeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author hjm09
 */
@Service
public class QuestionJudgeServiceImpl implements QuestionJudgeService {

    private final QuestionJudgeMapper mapper;

    @Autowired
    public QuestionJudgeServiceImpl(QuestionJudgeMapper mapper) {
        this.mapper = mapper;
    }

    @SuppressWarnings("unchecked")
    @Override
    public int save(QuestionJudgeVO vo) {
        QuestionJudge judge = new QuestionJudge();
        judge.setTopic(vo.getTopic());
        judge.setAnswer(vo.getAnswer().byteValue());
        judge.setRemarks(vo.getRemark());
        judge.setKeyword(vo.getKeyword());
        Map map = UserManager.currentUser();
        judge.setCreateUser((String) map.get("nickname"));
        judge.setCreateUserId((Integer)map.getOrDefault("id",0));
        mapper.save(judge);
        return 1;
    }
}
