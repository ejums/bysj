package com.nicetest.library.controller;

import com.alibaba.druid.sql.ast.expr.SQLBinaryOperator;
import com.nicetest.library.entity.view.QuestionAllShow;
import com.nicetest.library.service.QuestionAllShowService;
import com.nicetest.library.util.HttpResult;
import com.nicetest.library.vo.PageableVO;
import com.nicetest.library.vo.QuestionSelectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author hjm09
 */
@RestController
@RequestMapping("/all")
public class QuestionAllShowController {
    private final QuestionAllShowService showService;

    @Autowired
    public QuestionAllShowController(QuestionAllShowService showService) {
        this.showService = showService;
    }

    @RequestMapping("/get")
    public HttpResult selectAll(@RequestBody(required = false) PageableVO<QuestionAllShow> pageableVO){
        QuestionAllShow allShow = pageableVO.getData();
        Pageable pageable = pageableVO.getPageable();
        Page<QuestionAllShow> data = showService.findAll(allShow, pageable);
        return HttpResult.send(data);
    }

    @RequestMapping("/select")
    public HttpResult select(@RequestBody(required = false) PageableVO<QuestionSelectVO> pageableVO){
        QuestionSelectVO vo = pageableVO.getData();
        Pageable pageable = pageableVO.getPageable();
        HashMap<String, SQLBinaryOperator> map = new HashMap<>();
        Page<QuestionAllShow> data = showService.findAll(vo, pageable);
        return HttpResult.send(data);
    }
}
