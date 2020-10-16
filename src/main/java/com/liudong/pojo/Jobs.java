package com.liudong.pojo;

public class Jobs {
    private Integer id;

    private String jobsName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobsName() {
        return jobsName;
    }

    public void setJobsName(String jobsName) {
        this.jobsName = jobsName == null ? null : jobsName.trim();
    }
}