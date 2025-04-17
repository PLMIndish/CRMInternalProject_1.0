/*Repository for Basic info
 * created by -Mounika
 */
package com.CRM.CRM.Repository;

import org.springframework.stereotype.Repository;

import com.CRM.CRM.Entity.BasicInfo;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {}