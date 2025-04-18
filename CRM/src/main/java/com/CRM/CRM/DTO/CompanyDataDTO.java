/* DTO that stores list of basic info
 * created by -Mounika
 */
package com.CRM.CRM.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyDataDTO {

	@JsonProperty("companyContactInfoForm")
	private List<BasicInfoDTO> basicInfoDTO;

	public List<BasicInfoDTO> getBasicInfoDTO() {
		return basicInfoDTO;
	}

	public void setBasicInfoDTO(List<BasicInfoDTO> basicInfoDTO) {
		this.basicInfoDTO = basicInfoDTO;
	}

}
