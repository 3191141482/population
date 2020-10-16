package com.liudong.pojo;

public class IndustryCategory {
    private Integer id;

    private String industryCategoryName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustryCategoryName() {
        return industryCategoryName;
    }

    public void setIndustryCategoryName(String industryCategoryName) {
        this.industryCategoryName = industryCategoryName == null ? null : industryCategoryName.trim();
    }
}