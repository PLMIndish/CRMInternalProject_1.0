package com.CRM.CRM.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class LeadInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requirementSummary;
    private LocalDate closeDate;
    private Double buyPrice;
    private Double sellingPrice;
    private String category;

    @OneToOne
    private CompanyInfo company; // foreign key

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public CompanyInfo getCompany() {
		return company;
	}

	public void setCompany(CompanyInfo company) {
		this.company = company;
	}

}
