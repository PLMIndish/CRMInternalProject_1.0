/* Repository for Lead info
 * created by -Mounika
 */
package com.CRM.CRM.Repository;

import org.springframework.stereotype.Repository;

import com.CRM.CRM.Entity.LeadInfo;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface LeadInfoRepository extends JpaRepository<LeadInfo, Long> {}