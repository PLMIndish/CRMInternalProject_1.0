/*DTO that stores company info
 * created by -Mounika
 */
package com.CRM.CRM.DTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class CompanyDTO {

	private UUID company_id;
	private String companyName;
	private String created_by;
	private LocalDateTime created_at;
	private String updated_by;
	private LocalDateTime updated_at;

	public UUID getCompany_id() {
		return company_id;
	}

	public void setCompany_id(UUID company_id) {
		this.company_id = company_id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

}
