package com.CRM.CRM.Repository;

import org.springframework.stereotype.Repository;

import com.CRM.CRM.Entity.TaskAssignment;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface TaskAssignmentRepository extends JpaRepository<TaskAssignment, Long> {}