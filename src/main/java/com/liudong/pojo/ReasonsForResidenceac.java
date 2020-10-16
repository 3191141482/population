package com.liudong.pojo;

public class ReasonsForResidenceac {
    private Integer id;

    private String reasonsForResidence;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReasonsForResidence() {
        return reasonsForResidence;
    }

    public void setReasonsForResidence(String reasonsForResidence) {
        this.reasonsForResidence = reasonsForResidence == null ? null : reasonsForResidence.trim();
    }
}