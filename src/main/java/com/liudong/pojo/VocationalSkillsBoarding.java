package com.liudong.pojo;

public class VocationalSkillsBoarding {
    private Integer id;

    private String vocationalSkillName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVocationalSkillName() {
        return vocationalSkillName;
    }

    public void setVocationalSkillName(String vocationalSkillName) {
        this.vocationalSkillName = vocationalSkillName == null ? null : vocationalSkillName.trim();
    }
}