package com.nicetest.library.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "question_jquiz", schema = "nice_test")
public class QuestionJquiz {
    private int id;
    private String topic;
    private String answer;
    private String answerKeyword;
    private String remarks;
    private String subject;
    private Integer subjectId;
    private String createUser;
    private Integer createUserId;
    private LocalDateTime createDate = LocalDateTime.now();
    private String permission = "[\"private\"]";
    private String keyword;
    private String dataStatus = "1";

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "topic", length = 512)
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Basic
    @Column(name = "answer", length = 512)
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "remarks", length = 512)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "subject", length = 128)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "subjectId")
    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "createUser", length = 32)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "answerKeyword", length = 32)
    public String getAnswerKeyword() {
        return answerKeyword;
    }

    public void setAnswerKeyword(String answerKeyword) {
        this.answerKeyword = answerKeyword;
    }

    @Basic
    @Column(name = "createUserId")
    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "createDate")
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "permission", length = 200)
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Basic
    @Column(name = "keyword", length = 256)
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Basic
    @Column(name = "dataStatus", length = 32)
    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuestionJquiz that = (QuestionJquiz) o;
        return id == that.id &&
                Objects.equals(topic, that.topic) &&
                Objects.equals(answer, that.answer) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(subjectId, that.subjectId) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(permission, that.permission) &&
                Objects.equals(keyword, that.keyword) &&
                Objects.equals(dataStatus, that.dataStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topic, answer, remarks, subject, subjectId, createUser, createUserId, createDate, permission, keyword, dataStatus);
    }
}
