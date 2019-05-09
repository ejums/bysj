package com.nicetest.library.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "question_judge", schema = "nice_test")
public class QuestionJudge {
    private int id;
    private String keyword;
    private String topic;
    private Byte answer;
    private String remarks;
    private String subjectId;
    private String subject;
    private String createUser;
    private Integer createUserId;
    private String permission="[\"private\"]";
    private LocalDateTime createDate=LocalDateTime.now();
    private String dataStatus="1";

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "keyword", length = 48)
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
    @Column(name = "answer")
    public Byte getAnswer() {
        return answer;
    }

    public void setAnswer(Byte answer) {
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
    @Column(name = "subjectId", length = 128)
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
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
    @Column(name = "createUser", length = 32)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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
    @Column(name = "permission", length = 200)
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
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
    @Column(name = "dataStatus", length = 11)
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
        QuestionJudge that = (QuestionJudge) o;
        return id == that.id &&
                Objects.equals(keyword, that.keyword) &&
                Objects.equals(topic, that.topic) &&
                Objects.equals(answer, that.answer) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(subjectId, that.subjectId) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(permission, that.permission) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(dataStatus, that.dataStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, keyword, topic, answer, remarks, subjectId, subject, createUser, createUserId, permission, createDate, dataStatus);
    }
}
