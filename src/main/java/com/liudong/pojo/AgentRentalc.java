package com.liudong.pojo;

public class AgentRentalc {
    private Integer id;

    private String nameOfAgent;

    private Integer contactNumber;

    private Integer responsibilityAgreement;

    private String agentIdNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfAgent() {
        return nameOfAgent;
    }

    public void setNameOfAgent(String nameOfAgent) {
        this.nameOfAgent = nameOfAgent == null ? null : nameOfAgent.trim();
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Integer getResponsibilityAgreement() {
        return responsibilityAgreement;
    }

    public void setResponsibilityAgreement(Integer responsibilityAgreement) {
        this.responsibilityAgreement = responsibilityAgreement;
    }

    public String getAgentIdNumber() {
        return agentIdNumber;
    }

    public void setAgentIdNumber(String agentIdNumber) {
        this.agentIdNumber = agentIdNumber == null ? null : agentIdNumber.trim();
    }
}