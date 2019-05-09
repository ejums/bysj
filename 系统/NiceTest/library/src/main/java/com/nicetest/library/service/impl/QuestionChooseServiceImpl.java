package com.nicetest.library.service.impl;

import com.nicetest.library.entity.QuestionChoose;
import com.nicetest.library.mapper.QuestionChooseMapper;
import com.nicetest.library.service.QuestionChooseService;
import com.nicetest.library.util.JSONUtil;
import com.nicetest.library.util.UserManager;
import com.nicetest.library.vo.QuestionChooseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author hjm09
 */
@Service
public class QuestionChooseServiceImpl implements QuestionChooseService {
    private final QuestionChooseMapper mapper;

    @Autowired
    public QuestionChooseServiceImpl(QuestionChooseMapper mapper) {
        this.mapper = mapper;
    }

    @SuppressWarnings("unchecked")
    @Override
    public int save(QuestionChooseVO vo) {
        QuestionChoose choose = new QuestionChoose();
        choose.setTopic(vo.getTopic());
        choose.setRemarks(vo.getRemark());
        choose.setAnswer(JSONUtil.stringify(vo.getAnswer()));
        choose.setKeyword(vo.getKeyword());
        choose.setChoices(JSONUtil.stringify(vo.getChoices()));
        choose.setType(vo.getType());
        choose.setPermission("['PRIVATE'");
        Map map = UserManager.currentUser();
        choose.setCreateUser((String) map.get("nickname"));
        choose.setCreateUserId((Integer)map.getOrDefault("id",0));
        try{
            mapper.save(choose);
        }catch (Exception e){
            return -1;
        }
        return 0;
    }
}
