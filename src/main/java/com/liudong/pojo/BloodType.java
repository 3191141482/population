package com.liudong.pojo;

public class BloodType {
    private Integer id;

    private String bloodTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBloodTypeName() {
        return bloodTypeName;
    }

    public void setBloodTypeName(String bloodTypeName) {
        this.bloodTypeName = bloodTypeName == null ? null : bloodTypeName.trim();
    }
}