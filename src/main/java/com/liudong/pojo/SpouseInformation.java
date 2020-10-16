package com.liudong.pojo;

public class SpouseInformation {
    private Integer id;

    private String spouseName;

    private String spouseIdentificationNumber;

    private String addressOfCurrentResidence;

    private String 

employmentStatus;

    private String workUnit;

    private String personalContactNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName == null ? null : spouseName.trim();
    }

    public String getSpouseIdentificationNumber() {
        return spouseIdentificationNumber;
    }

    public void setSpouseIdentificationNumber(String spouseIdentificationNumber) {
        this.spouseIdentificationNumber = spouseIdentificationNumber == null ? null : spouseIdentificationNumber.trim();
    }

    public String getAddressOfCurrentResidence() {
        return addressOfCurrentResidence;
    }

    public void setAddressOfCurrentResidence(String addressOfCurrentResidence) {
        this.addressOfCurrentResidence = addressOfCurrentResidence == null ? null : addressOfCurrentResidence.trim();
    }

    public String get

employmentStatus() {
        return 

employmentStatus;
    }

    public void set

employmentStatus(String 

employmentStatus) {
        this.

employmentStatus = 

employmentStatus == null ? null : 

employmentStatus.trim();
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getPersonalContactNumber() {
        return personalContactNumber;
    }

    public void setPersonalContactNumber(String personalContactNumber) {
        this.personalContactNumber = personalContactNumber == null ? null : personalContactNumber.trim();
    }
}