package com.nicetest.user.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "term")
public class Term {
    private int id;
    private String name;
    private String avatar;
    private Integer level;
    private String memberRank;
    private String description;
    private LocalDateTime createDate;
    private Integer createUserId;
    private String createUserName;
    private LocalDateTime lastModifyTime;
    private LocalDateTime lastActiveTime;
    private String leader;
    private String leaderId;
    private Integer memberNumber;
    private LocalDateTime dueTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", length = 128)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "avatar", length = 512)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "memberRank", length = 256)
    public String getMemberRank() {
        return memberRank;
    }

    public void setMemberRank(String memberRank) {
        this.memberRank = memberRank;
    }

    @Basic
    @Column(name = "description", length = 512)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "createUserId")
    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "createUserName", length = 32)
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Basic
    @Column(name = "lastModifyTime")
    public LocalDateTime getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    @Basic
    @Column(name = "lastActiveTime")
    public LocalDateTime getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(LocalDateTime lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    @Basic
    @Column(name = "leader", length = 32)
    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    @Basic
    @Column(name = "leaderId", length = 32)
    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    @Basic
    @Column(name = "memberNumber")
    public Integer getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
    }

    @Basic
    @Column(name = "dueTime")
    public LocalDateTime getDueTime() {
        return dueTime;
    }

    public void setDueTime(LocalDateTime dueTime) {
        this.dueTime = dueTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Term term = (Term) o;
        return id == term.id &&
                Objects.equals(name, term.name) &&
                Objects.equals(avatar, term.avatar) &&
                Objects.equals(level, term.level) &&
                Objects.equals(memberRank, term.memberRank) &&
                Objects.equals(description, term.description) &&
                Objects.equals(createDate, term.createDate) &&
                Objects.equals(createUserId, term.createUserId) &&
                Objects.equals(createUserName, term.createUserName) &&
                Objects.equals(lastModifyTime, term.lastModifyTime) &&
                Objects.equals(lastActiveTime, term.lastActiveTime) &&
                Objects.equals(leader, term.leader) &&
                Objects.equals(leaderId, term.leaderId) &&
                Objects.equals(memberNumber, term.memberNumber) &&
                Objects.equals(dueTime, term.dueTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, avatar, level, memberRank, description, createDate, createUserId, createUserName, lastModifyTime, lastActiveTime, leader, leaderId, memberNumber, dueTime);
    }
}
