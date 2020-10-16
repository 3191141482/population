package com.liudong.pojo;

public class Mode0fResidencea {
    private Integer id;

    private String modeOfResidencea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModeOfResidencea() {
        return modeOfResidencea;
    }

    public void setModeOfResidencea(String modeOfResidencea) {
        this.modeOfResidencea = modeOfResidencea == null ? null : modeOfResidencea.trim();
    }
}