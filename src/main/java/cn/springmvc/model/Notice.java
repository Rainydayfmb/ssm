package cn.springmvc.model;

import java.util.Date;

public class Notice {
    private Integer id;

    private String title;

    private Date createDate;

    private Integer userId;

    private String content;

    public Notice(Integer id, String title, Date createDate, Integer userId, String content) {
        this.id = id;
        this.title = title;
        this.createDate = createDate;
        this.userId = userId;
        this.content = content;
    }

    public Notice() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}