package com.liudong.pojo;

public class PoliticalOutlook {
    private Integer id;

    private String politicalOutlookName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoliticalOutlookName() {
        return politicalOutlookName;
    }

    public void setPoliticalOutlookName(String politicalOutlookName) {
        this.politicalOutlookName = politicalOutlookName == null ? null : politicalOutlookName.trim();
    }
}