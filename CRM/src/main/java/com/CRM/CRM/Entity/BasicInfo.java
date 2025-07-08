/* Basic Info entity that holds Basic information of company. one company can have 
 * multiple basic info
 * created by -Mounika
 */
package com.CRM.CRM.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Basic_Info")
public class BasicInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "basicInfo_id")
	private UUID basicInfo_id;
	
	@ManyToOne
	@JoinColumn(name = "company_id", nullable = true)
	private CompanyInfo companyInfo;

	@Column(name = "contact_Name")
	private String contactName;

	@Column(name = "designation")
	private String designation;

	@Column(name = "address")
	private String address;

	@Column(name = "contact_Number")
	private String contactNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "created_by")
	private String created_by;

	@Column(name = "created_at")
	private LocalDateTime created_at;

	@Column(name = "updated_by")
	private String updated_by;

	@Column(name = "updated_at")
	private LocalDateTime updated_at;

	public UUID getBasicInfo_id() {
		return basicInfo_id;
	}

	public void setBasicInfo_id(UUID basicInfo_id) {
		this.basicInfo_id = basicInfo_id;
	}

	public CompanyInfo getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
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

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime localDateTime) {
		this.created_at = localDateTime;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime localDateTime) {
		this.updated_at = localDateTime;
	}

}
