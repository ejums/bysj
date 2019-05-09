package com.nicetest.library.controller;

import com.nicetest.library.service.QuestionJudgeService;
import com.nicetest.library.util.HttpResult;
import com.nicetest.library.vo.QuestionJudgeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjm09
 */
@RestController
@RequestMapping("/judge")
public class QuestionJudgeController {
    private final QuestionJudgeService judgeService;

    @Autowired
    public QuestionJudgeController(QuestionJudgeService judgeService) {
        this.judgeService = judgeService;
    }

    @RequestMapping("/save")
    public HttpResult save(@RequestBody(required = false) QuestionJudgeVO vo){
        int status = judgeService.save(vo);
        String msg = status == 1 ? "insert success": "insert error";
        return HttpResult.send(200+status, msg);
    }
}
