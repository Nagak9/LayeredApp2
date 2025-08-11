package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
