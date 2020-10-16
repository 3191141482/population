package com.liudong.pojo;

public class SituationOfLandlordAndLessorc {
    private Integer id;

    private String nameOfLandlord;

    private Integer contactNumber;

    private Integer publicSecurityResponsibility;

    private String landlordIdNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfLandlord() {
        return nameOfLandlord;
    }

    public void setNameOfLandlord(String nameOfLandlord) {
        this.nameOfLandlord = nameOfLandlord == null ? null : nameOfLandlord.trim();
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Integer getPublicSecurityResponsibility() {
        return publicSecurityResponsibility;
    }

    public void setPublicSecurityResponsibility(Integer publicSecurityResponsibility) {
        this.publicSecurityResponsibility = publicSecurityResponsibility;
    }

    public String getLandlordIdNumber() {
        return landlordIdNumber;
    }

    public void setLandlordIdNumber(String landlordIdNumber) {
        this.landlordIdNumber = landlordIdNumber == null ? null : landlordIdNumber.trim();
    }
}