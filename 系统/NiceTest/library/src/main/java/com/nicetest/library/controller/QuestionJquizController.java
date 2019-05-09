package com.nicetest.library.controller;

import com.nicetest.library.entity.QuestionJquiz;
import com.nicetest.library.service.QuestionJquizService;
import com.nicetest.library.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjm09
 */
@RequestMapping("/jquiz")
@RestController
public class QuestionJquizController {
    private final QuestionJquizService service;

    @Autowired
    public QuestionJquizController(QuestionJquizService service) {
        this.service = service;
    }

    @RequestMapping("/save")
    public HttpResult save(@RequestBody(required = false) QuestionJquiz jquiz){
        int status = service.save(jquiz);
        String msg = status==0?"insert error":"insert success";
        return HttpResult.send(201-status, msg);
    }
}
