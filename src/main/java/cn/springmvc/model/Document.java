package cn.springmvc.model;

import java.util.Date;

public class Document {
    private Integer id;

    private String title;

    private String filename;

    private String remark;

    private Date createDate;

    private Integer userId;

    public Document(Integer id, String title, String filename, String remark, Date createDate, Integer userId) {
        this.id = id;
        this.title = title;
        this.filename = filename;
        this.remark = remark;
        this.createDate = createDate;
        this.userId = userId;
    }

    public Document() {
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    @Override
    public String toString() {
        return "Document={" +
                "id=" +id+
                "title=" +title+
                "filename=" +filename+
                "remark=" +remark+
                "createDate=" +createDate+
                "userId=" +userId+
                "}";
    }
}