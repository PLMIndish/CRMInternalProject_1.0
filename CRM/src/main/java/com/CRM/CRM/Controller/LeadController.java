/* controller that saves newly added compay info and basic info
 * created by -Mounika
 */
package com.CRM.CRM.Controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.CRM.DTO.BasicInfoDTO;
import com.CRM.CRM.DTO.CompanyDTO;
import com.CRM.CRM.DTO.LeadRequestDto;
import com.CRM.CRM.Entity.BasicInfo;
import com.CRM.CRM.Entity.CompanyInfo;
import com.CRM.CRM.Repository.BasicInfoRepository;
import com.CRM.CRM.Repository.CompanyInfoRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/new-projects")
public class LeadController {
	@Autowired
	private CompanyInfoRepository companyRepo;

	@Autowired
	private BasicInfoRepository basicInfoRepo;

	/*
	 * @Autowired private LeadInfoRepository leadRepo;
	 * 
	 * @Autowired private TaskAssignmentRepository taskRepo;
	 */
	@Transactional
	@PostMapping("/add")
	public ResponseEntity<String> submitLead(@RequestBody LeadRequestDto dto) {

		CompanyDTO companyDTO = dto.getCompanyDTO();

		CompanyInfo companyInfo = new CompanyInfo();
		companyInfo.setCompanyName(companyDTO.getCompanyName());
		companyInfo.setCreated_at(LocalDateTime.now());
		companyInfo.setUpdated_at(LocalDateTime.now());

		companyRepo.save(companyInfo);

		for (BasicInfoDTO basicInfoDTO : dto.getCompanyDataDTO().getBasicInfoDTO()) {

			BasicInfo basicInfo = new BasicInfo();

			basicInfo.setCompanyInfo(companyInfo);
			basicInfo.setContactName(basicInfoDTO.getContactName());
			basicInfo.setDesignation(basicInfoDTO.getDesignation());
			basicInfo.setAddress(basicInfoDTO.getAddress());
			basicInfo.setContactNumber(basicInfoDTO.getContactNumber());
			basicInfo.setEmail(basicInfoDTO.getEmail());
			basicInfo.setCreated_at(LocalDateTime.now());
			basicInfo.setUpdated_at(LocalDateTime.now());

			basicInfoRepo.save(basicInfo);
		}

		// for now just save basic info

		/*
		 * LeadInfo lead = new LeadInfo();
		 * lead.setRequirementSummary(dto.getRequirementSummary());
		 * lead.setCloseDate(dto.getCloseDate()); lead.setBuyPrice(dto.getBuyPrice());
		 * lead.setSellingPrice(dto.getSellingPrice());
		 * lead.setCategory(dto.getCategory());
		 * 
		 * LeadInfo savedLead = leadRepo.save(lead);
		 * 
		 * TaskAssignment task = new TaskAssignment();
		 * task.setTaskAssignedTo(dto.getTaskAssignedTo());
		 * task.setTaskUniqueId(dto.getTaskUniqueId());
		 * task.setEstimatedEffort(dto.getEstimatedEffort());
		 * task.setDueDate(dto.getDueDate()); task.setLead(savedLead);
		 * 
		 * taskRepo.save(task);
		 */

		return ResponseEntity.ok("Basic Info saved successfully!");
	}
}
