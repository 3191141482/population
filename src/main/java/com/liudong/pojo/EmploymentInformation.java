package com.liudong.pojo;

public class EmploymentInformation {
    private Integer id;

    private String workUnit;

    private String unitType;

    private String unitAddress;

    private String organizationCode;

    private String legalRepresentative;

    private String laborContract;

    private String contactPhone;

    private String insuranceCoverage;

    private Integer unitSocialSecurityNumber;

    private Integer unitNo;

    private Integer numberOfWorker;

    private String industryCategory;

    private String title;

    private String vocationalSkillsBoarding;

    private String occupation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType == null ? null : unitType.trim();
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress == null ? null : unitAddress.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative == null ? null : legalRepresentative.trim();
    }

    public String getLaborContract() {
        return laborContract;
    }

    public void setLaborContract(String laborContract) {
        this.laborContract = laborContract == null ? null : laborContract.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getInsuranceCoverage() {
        return insuranceCoverage;
    }

    public void setInsuranceCoverage(String insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage == null ? null : insuranceCoverage.trim();
    }

    public Integer getUnitSocialSecurityNumber() {
        return unitSocialSecurityNumber;
    }

    public void setUnitSocialSecurityNumber(Integer unitSocialSecurityNumber) {
        this.unitSocialSecurityNumber = unitSocialSecurityNumber;
    }

    public Integer getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(Integer unitNo) {
        this.unitNo = unitNo;
    }

    public Integer getNumberOfWorker() {
        return numberOfWorker;
    }

    public void setNumberOfWorker(Integer numberOfWorker) {
        this.numberOfWorker = numberOfWorker;
    }

    public String getIndustryCategory() {
        return industryCategory;
    }

    public void setIndustryCategory(String industryCategory) {
        this.industryCategory = industryCategory == null ? null : industryCategory.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getVocationalSkillsBoarding() {
        return vocationalSkillsBoarding;
    }

    public void setVocationalSkillsBoarding(String vocationalSkillsBoarding) {
        this.vocationalSkillsBoarding = vocationalSkillsBoarding == null ? null : vocationalSkillsBoarding.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }
}