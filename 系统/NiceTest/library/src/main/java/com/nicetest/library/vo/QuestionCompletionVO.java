package com.nicetest.library.vo;

import java.util.ArrayList;

/**
 * @author hjm09
 */
public class QuestionCompletionVO {
    private String topic;
    private ArrayList<String> answer;
    private String remark;
    private String keyword;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "QuestionCompletionVO{" +
                "topic='" + topic + '\'' +
                ", answer=" + answer +
                ", remark='" + remark + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
