package com.nicetest.library.vo;

import com.nicetest.library.util.JSONUtil;

import java.util.ArrayList;

/**
 * @author hjm09
 */
public class QuestionChooseVO {
    private String topic;
    private ArrayList<String> choices;
    private ArrayList<String> answer;
    private String remark;
    private String keyword;
    private Byte type;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return JSONUtil.stringify(this);
    }
}
