package com.CRM.CRM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.CRM.DTO.LeadRequestDto;
import com.CRM.CRM.Entity.CompanyInfo;
import com.CRM.CRM.Entity.LeadInfo;
import com.CRM.CRM.Entity.TaskAssignment;
import com.CRM.CRM.Repository.CompanyInfoRepository;
import com.CRM.CRM.Repository.LeadInfoRepository;
import com.CRM.CRM.Repository.TaskAssignmentRepository;

@RestController
@RequestMapping("/new-projects")
public class LeadController {

    @Autowired
    private CompanyInfoRepository companyRepo;

    @Autowired
    private LeadInfoRepository leadRepo;

    @Autowired
    private TaskAssignmentRepository taskRepo;

    @PostMapping("/add")
    public ResponseEntity<String> submitLead(@RequestBody LeadRequestDto dto) {
        CompanyInfo company = new CompanyInfo();
        company.setCompanyName(dto.getCompanyName());
        company.setContactName(dto.getContactName());
        company.setDesignation(dto.getDesignation());
        company.setAddress(dto.getAddress());
        company.setContactNumber(dto.getContactNumber());
        company.setEmail(dto.getEmail());

        CompanyInfo savedCompany = companyRepo.save(company);

        LeadInfo lead = new LeadInfo();
        lead.setRequirementSummary(dto.getRequirementSummary());
        lead.setCloseDate(dto.getCloseDate());
        lead.setBuyPrice(dto.getBuyPrice());
        lead.setSellingPrice(dto.getSellingPrice());
        lead.setCategory(dto.getCategory());
        lead.setCompany(savedCompany);

        LeadInfo savedLead = leadRepo.save(lead);

        TaskAssignment task = new TaskAssignment();
        task.setTaskAssignedTo(dto.getTaskAssignedTo());
        task.setTaskUniqueId(dto.getTaskUniqueId());
        task.setEstimatedEffort(dto.getEstimatedEffort());
        task.setDueDate(dto.getDueDate());
        task.setLead(savedLead);

        taskRepo.save(task);

        return ResponseEntity.ok("Lead and Task saved successfully!");
    }
}
