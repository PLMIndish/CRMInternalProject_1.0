/* DTO for basic company details
 * created by -Mounika
 */
package com.CRM.CRM.DTO;

import java.time.LocalDateTime;
import java.util.UUID;

import com.CRM.CRM.Entity.CompanyInfo;

public class BasicInfoDTO {
	private UUID basicInfo_id;
	private CompanyInfo companyInfo;
	private String contactName;
	private String designation;
	private String address;
	private String contactNumber;
	private String email;
	private String created_by;
	private LocalDateTime created_at;
	private String updated_by;
	private LocalDateTime updated_at;

	public UUID getBasicInfo_id() {
		return basicInfo_id;
	}

	public void setBasicInfo_id(UUID basicInfo_id) {
		this.basicInfo_id = basicInfo_id;
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

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
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

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}

	public CompanyInfo getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}

}
