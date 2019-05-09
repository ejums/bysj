package com.nicetest.library.vo;

/**
 * @author hjm09
 */
public class QuestionJudgeVO {
    private String topic;
    private Integer answer;
    private String remark;
    private String keyword;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
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
        return "QuestionJudgeVO{" +
                "topic='" + topic + '\'' +
                ", answer=" + answer +
                ", remark='" + remark + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
