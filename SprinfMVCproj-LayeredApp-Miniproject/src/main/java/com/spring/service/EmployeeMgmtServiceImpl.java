package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Employee;
import com.spring.repo.IEmployeeRepository;

@Service("Empservice")

public class EmployeeMgmtServiceImpl implements IEmployeemgmtService {
	
	@Autowired
	
	private IEmployeeRepository empRepo;

	@Override
	public List<Employee> ShowAllEmployees() {
		
		return empRepo.findAll();
	}

}
