package com.CRM.CRM.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class TaskAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskAssignedTo;
    private String taskUniqueId;
    private Integer estimatedEffort;
    private LocalDate dueDate;

    @OneToOne
    private LeadInfo lead;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LeadInfo getLead() {
		return lead;
	}

	public void setLead(LeadInfo lead) {
		this.lead = lead;
	}


}
