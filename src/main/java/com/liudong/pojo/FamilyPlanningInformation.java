package com.liudong.pojo;

import java.util.Date;

public class FamilyPlanningInformation {
    private Integer id;

    private Integer husbandAndWifeGoTogether;

    private Integer proofOfMarriageAndChildbirth;

    private String marriageCertificateNo;

    private Integer numberOfChildrenBorn;

    private Integer numberOfChildrenBornFemale;

    private Integer withinPolicy;

    private Integer outOfPolic;

    private Integer certificateIssuedToACouple;

    private Integer collectionOfSocialMaintenanceFee;

    private String pregnancyContraception;

    private Date measureTime;

    private Integer havingChildrenInThoseYears;

    private Date dateOfBirth;

    private Integer outOfPolicy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHusbandAndWifeGoTogether() {
        return husbandAndWifeGoTogether;
    }

    public void setHusbandAndWifeGoTogether(Integer husbandAndWifeGoTogether) {
        this.husbandAndWifeGoTogether = husbandAndWifeGoTogether;
    }

    public Integer getProofOfMarriageAndChildbirth() {
        return proofOfMarriageAndChildbirth;
    }

    public void setProofOfMarriageAndChildbirth(Integer proofOfMarriageAndChildbirth) {
        this.proofOfMarriageAndChildbirth = proofOfMarriageAndChildbirth;
    }

    public String getMarriageCertificateNo() {
        return marriageCertificateNo;
    }

    public void setMarriageCertificateNo(String marriageCertificateNo) {
        this.marriageCertificateNo = marriageCertificateNo == null ? null : marriageCertificateNo.trim();
    }

    public Integer getNumberOfChildrenBorn() {
        return numberOfChildrenBorn;
    }

    public void setNumberOfChildrenBorn(Integer numberOfChildrenBorn) {
        this.numberOfChildrenBorn = numberOfChildrenBorn;
    }

    public Integer getNumberOfChildrenBornFemale() {
        return numberOfChildrenBornFemale;
    }

    public void setNumberOfChildrenBornFemale(Integer numberOfChildrenBornFemale) {
        this.numberOfChildrenBornFemale = numberOfChildrenBornFemale;
    }

    public Integer getWithinPolicy() {
        return withinPolicy;
    }

    public void setWithinPolicy(Integer withinPolicy) {
        this.withinPolicy = withinPolicy;
    }

    public Integer getOutOfPolic() {
        return outOfPolic;
    }

    public void setOutOfPolic(Integer outOfPolic) {
        this.outOfPolic = outOfPolic;
    }

    public Integer getCertificateIssuedToACouple() {
        return certificateIssuedToACouple;
    }

    public void setCertificateIssuedToACouple(Integer certificateIssuedToACouple) {
        this.certificateIssuedToACouple = certificateIssuedToACouple;
    }

    public Integer getCollectionOfSocialMaintenanceFee() {
        return collectionOfSocialMaintenanceFee;
    }

    public void setCollectionOfSocialMaintenanceFee(Integer collectionOfSocialMaintenanceFee) {
        this.collectionOfSocialMaintenanceFee = collectionOfSocialMaintenanceFee;
    }

    public String getPregnancyContraception() {
        return pregnancyContraception;
    }

    public void setPregnancyContraception(String pregnancyContraception) {
        this.pregnancyContraception = pregnancyContraception == null ? null : pregnancyContraception.trim();
    }

    public Date getMeasureTime() {
        return measureTime;
    }

    public void setMeasureTime(Date measureTime) {
        this.measureTime = measureTime;
    }

    public Integer getHavingChildrenInThoseYears() {
        return havingChildrenInThoseYears;
    }

    public void setHavingChildrenInThoseYears(Integer havingChildrenInThoseYears) {
        this.havingChildrenInThoseYears = havingChildrenInThoseYears;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getOutOfPolicy() {
        return outOfPolicy;
    }

    public void setOutOfPolicy(Integer outOfPolicy) {
        this.outOfPolicy = outOfPolicy;
    }
}