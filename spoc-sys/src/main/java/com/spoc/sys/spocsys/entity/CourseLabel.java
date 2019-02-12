package com.spoc.sys.spocsys.entity;

import java.util.Date;

public class CourseLabel {
    private Integer id;

    private String labelName;

    private String lableDesc;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    public String getLableDesc() {
        return lableDesc;
    }

    public void setLableDesc(String lableDesc) {
        this.lableDesc = lableDesc == null ? null : lableDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}