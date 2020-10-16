package com.liudong.pojo;

public class ReligiousBelief {
    private Integer id;

    private String religiousBeliefName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReligiousBeliefName() {
        return religiousBeliefName;
    }

    public void setReligiousBeliefName(String religiousBeliefName) {
        this.religiousBeliefName = religiousBeliefName == null ? null : religiousBeliefName.trim();
    }
}