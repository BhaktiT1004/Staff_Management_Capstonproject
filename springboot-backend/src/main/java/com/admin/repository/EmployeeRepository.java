package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
