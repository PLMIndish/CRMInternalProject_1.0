/**
 * DTO (Data Transfer Object) class used for transferring data 
 * between the application and the database (or between layers).
 * This is the lead DTO that merges both company and basic data
 * -created by Mounika
 */
package com.CRM.CRM.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeadRequestDto {

	@JsonProperty("companyName")
	private CompanyDTO companyDTO;

	@JsonProperty("companyData")
	private CompanyDataDTO companyDataDTO;

	public CompanyDTO getCompanyDTO() {
		return companyDTO;
	}

	public void setCompanyDTO(CompanyDTO companyDTO) {
		this.companyDTO = companyDTO;
	}

	public CompanyDataDTO getCompanyDataDTO() {
		return companyDataDTO;
	}

	public void setCompanyDataDTO(CompanyDataDTO companyDataDTO) {
		this.companyDataDTO = companyDataDTO;
	}

}
