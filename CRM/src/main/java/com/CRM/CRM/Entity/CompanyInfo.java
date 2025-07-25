/* Main entity that holds company name and its unique id 
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
import jakarta.persistence.Table;

@Entity
@Table(name = "Company_Info")
public class CompanyInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "company_id")
	private UUID company_id;

	@Column(name = "companyName")
	private String companyName;

	@Column(name = "created_by")
	private String created_by;

	@Column(name = "created_at")
	private LocalDateTime created_at;

	@Column(name = "updated_by")
	private String updated_by;

	@Column(name = "updated_at")
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
