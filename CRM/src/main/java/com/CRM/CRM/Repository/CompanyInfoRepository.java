/* Repository for Company info
 * created by -Mounika
 */
package com.CRM.CRM.Repository;

import org.springframework.stereotype.Repository;

import com.CRM.CRM.Entity.CompanyInfo;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CompanyInfoRepository extends JpaRepository<CompanyInfo, Long> {}