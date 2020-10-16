package com.liudong.pojo;

import java.util.Date;

public class FamilyMembersLivingTogether {
    private Integer id;

    private String numberId;

    private String 

relationship;

    private String citizenshipNumber;

    private String fullName;

    private Integer gender;

    private Date dateOfBirth;

    private Integer haveVaccinationCertificate;

    private Integer studyingInThisCity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId == null ? null : numberId.trim();
    }

    public String get

relationship() {
        return 

relationship;
    }

    public void set

relationship(String 

relationship) {
        this.

relationship = 

relationship == null ? null : 

relationship.trim();
    }

    public String getCitizenshipNumber() {
        return citizenshipNumber;
    }

    public void setCitizenshipNumber(String citizenshipNumber) {
        this.citizenshipNumber = citizenshipNumber == null ? null : citizenshipNumber.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getHaveVaccinationCertificate() {
        return haveVaccinationCertificate;
    }

    public void setHaveVaccinationCertificate(Integer haveVaccinationCertificate) {
        this.haveVaccinationCertificate = haveVaccinationCertificate;
    }

    public Integer getStudyingInThisCity() {
        return studyingInThisCity;
    }

    public void setStudyingInThisCity(Integer studyingInThisCity) {
        this.studyingInThisCity = studyingInThisCity;
    }
}