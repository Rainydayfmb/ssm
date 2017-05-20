package cn.springmvc.model;

import java.util.Date;

public class User {
    private Integer id;

    private String loginname;

    private String password;

    private Integer status;

    private Date createddate;

    private String username;

    public User(Integer id, String loginname, String password, Integer status, Date createddate, String username) {
        this.id = id;
        this.loginname = loginname;
        this.password = password;
        this.status = status;
        this.createddate = createddate;
        this.username = username;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", createddate=" + createddate +
                ", username='" + username + '\'' +
                '}';
    }
}