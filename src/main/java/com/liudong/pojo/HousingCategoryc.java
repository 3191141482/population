package com.liudong.pojo;

public class HousingCategoryc {
    private Integer id;

    private String housingCategory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHousingCategory() {
        return housingCategory;
    }

    public void setHousingCategory(String housingCategory) {
        this.housingCategory = housingCategory == null ? null : housingCategory.trim();
    }
}