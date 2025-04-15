package com.CRM.CRM.DTO;

import java.time.LocalDate;

public class LeadRequestDto {
    private String companyName;
    private String contactName;
    private String designation;
    private String address;
    private String contactNumber;
    private String email;

    private String requirementSummary;
    private LocalDate closeDate;
    private Double buyPrice;
    private Double sellingPrice;
    private String category;

    private String taskAssignedTo;
    private String taskUniqueId;
    private Integer estimatedEffort;
    private LocalDate dueDate;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRequirementSummary() {
		return requirementSummary;
	}
	public void setRequirementSummary(String requirementSummary) {
		this.requirementSummary = requirementSummary;
	}
	public LocalDate getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(LocalDate closeDate) {
		this.closeDate = closeDate;
	}
	public Double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public Double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTaskAssignedTo() {
		return taskAssignedTo;
	}
	public void setTaskAssignedTo(String taskAssignedTo) {
		this.taskAssignedTo = taskAssignedTo;
	}
	public String getTaskUniqueId() {
		return taskUniqueId;
	}
	public void setTaskUniqueId(String taskUniqueId) {
		this.taskUniqueId = taskUniqueId;
	}
	public Integer getEstimatedEffort() {
		return estimatedEffort;
	}
	public void setEstimatedEffort(Integer estimatedEffort) {
		this.estimatedEffort = estimatedEffort;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

    
}
