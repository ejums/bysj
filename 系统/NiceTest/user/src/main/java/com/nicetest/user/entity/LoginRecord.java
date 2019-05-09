package com.nicetest.user.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "login_record", schema = "nice_test")
public class LoginRecord {
    private int id;
    private Integer userId;
    private String username;
    private LocalDateTime loginTime;
    private String loginRegion;
    private String loginIp;
    private LocalDateTime logoutTime;
    private String logoutWay;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username", length = 32)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "login_time")
    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "login_region", length = 32)
    public String getLoginRegion() {
        return loginRegion;
    }

    public void setLoginRegion(String loginRegion) {
        this.loginRegion = loginRegion;
    }

    @Basic
    @Column(name = "login_ip", length = 128)
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Basic
    @Column(name = "logout_time")
    public LocalDateTime getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(LocalDateTime logoutTime) {
        this.logoutTime = logoutTime;
    }

    @Basic
    @Column(name = "logout_way", length = 20)
    public String getLogoutWay() {
        return logoutWay;
    }

    public void setLogoutWay(String logoutWay) {
        this.logoutWay = logoutWay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginRecord record = (LoginRecord) o;
        return id == record.id &&
                Objects.equals(userId, record.userId) &&
                Objects.equals(username, record.username) &&
                Objects.equals(loginTime, record.loginTime) &&
                Objects.equals(loginRegion, record.loginRegion) &&
                Objects.equals(loginIp, record.loginIp) &&
                Objects.equals(logoutTime, record.logoutTime) &&
                Objects.equals(logoutWay, record.logoutWay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, username, loginTime, loginRegion, loginIp, logoutTime, logoutWay);
    }
}
