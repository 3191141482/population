package com.liudong.pojo;

public class ResidenceInformation {
    private Integer id;

    private Integer modeOfResidence;

    private Integer reasonsForResidence;

    private Integer housingCategory;

    private String cityCountyAndDistrict;

    private String streetOffice;

    private String community;

    private String streetsAndAlleys;

    private String gateHouseBrand;

    private String detailedAddressOfGatehouse;

    private Integer roomNumber;

    private Integer situationOfLandlordAndLessor;

    private Integer agentRental;

    private Integer houseType;

    private String informationCollector;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModeOfResidence() {
        return modeOfResidence;
    }

    public void setModeOfResidence(Integer modeOfResidence) {
        this.modeOfResidence = modeOfResidence;
    }

    public Integer getReasonsForResidence() {
        return reasonsForResidence;
    }

    public void setReasonsForResidence(Integer reasonsForResidence) {
        this.reasonsForResidence = reasonsForResidence;
    }

    public Integer getHousingCategory() {
        return housingCategory;
    }

    public void setHousingCategory(Integer housingCategory) {
        this.housingCategory = housingCategory;
    }

    public String getCityCountyAndDistrict() {
        return cityCountyAndDistrict;
    }

    public void setCityCountyAndDistrict(String cityCountyAndDistrict) {
        this.cityCountyAndDistrict = cityCountyAndDistrict == null ? null : cityCountyAndDistrict.trim();
    }

    public String getStreetOffice() {
        return streetOffice;
    }

    public void setStreetOffice(String streetOffice) {
        this.streetOffice = streetOffice == null ? null : streetOffice.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public String getStreetsAndAlleys() {
        return streetsAndAlleys;
    }

    public void setStreetsAndAlleys(String streetsAndAlleys) {
        this.streetsAndAlleys = streetsAndAlleys == null ? null : streetsAndAlleys.trim();
    }

    public String getGateHouseBrand() {
        return gateHouseBrand;
    }

    public void setGateHouseBrand(String gateHouseBrand) {
        this.gateHouseBrand = gateHouseBrand == null ? null : gateHouseBrand.trim();
    }

    public String getDetailedAddressOfGatehouse() {
        return detailedAddressOfGatehouse;
    }

    public void setDetailedAddressOfGatehouse(String detailedAddressOfGatehouse) {
        this.detailedAddressOfGatehouse = detailedAddressOfGatehouse == null ? null : detailedAddressOfGatehouse.trim();
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getSituationOfLandlordAndLessor() {
        return situationOfLandlordAndLessor;
    }

    public void setSituationOfLandlordAndLessor(Integer situationOfLandlordAndLessor) {
        this.situationOfLandlordAndLessor = situationOfLandlordAndLessor;
    }

    public Integer getAgentRental() {
        return agentRental;
    }

    public void setAgentRental(Integer agentRental) {
        this.agentRental = agentRental;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public String getInformationCollector() {
        return informationCollector;
    }

    public void setInformationCollector(String informationCollector) {
        this.informationCollector = informationCollector == null ? null : informationCollector.trim();
    }
}