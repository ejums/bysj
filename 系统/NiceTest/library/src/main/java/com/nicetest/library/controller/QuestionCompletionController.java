package com.nicetest.library.controller;

import com.nicetest.library.service.QuestionCompletionService;
import com.nicetest.library.util.HttpResult;
import com.nicetest.library.vo.QuestionCompletionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjm09
 */
@RestController
@RequestMapping("/completion")
public class QuestionCompletionController {

    private final QuestionCompletionService completionService;

    @Autowired
    public QuestionCompletionController(QuestionCompletionService completionService) {
        this.completionService = completionService;
    }

    @RequestMapping("/save")
    public HttpResult save(@RequestBody(required = false) QuestionCompletionVO vo) {
        int status = completionService.save(vo);
        String msg = status == 0 ? "insert success" : "insert error";
        return HttpResult.send(200+status, msg,null);
    }
}
