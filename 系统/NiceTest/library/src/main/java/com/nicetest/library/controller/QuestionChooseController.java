package com.nicetest.library.controller;

import com.nicetest.library.service.QuestionChooseService;
import com.nicetest.library.util.HttpResult;
import com.nicetest.library.vo.QuestionChooseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjm09
 */
@RestController
@RequestMapping("/choose")
public class QuestionChooseController {
    private final QuestionChooseService chooseService;

    @Autowired
    public QuestionChooseController(QuestionChooseService chooseService) {
        this.chooseService = chooseService;
    }

    @RequestMapping("/save")
    public HttpResult save(@RequestBody(required = false) QuestionChooseVO chooseVO) {
        if(chooseVO.getTopic().length()<4){
            return HttpResult.send(401, "topic cannot be null", null);
        }
        int status = chooseService.save(chooseVO);
        if(status != 0){
            return HttpResult.send(400+status, "database insert exception", null);
        }
        return HttpResult.send("insert success");
    }
}
