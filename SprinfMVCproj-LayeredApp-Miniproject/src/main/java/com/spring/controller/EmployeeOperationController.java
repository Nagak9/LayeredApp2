package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.service.IEmployeemgmtService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EmployeeOperationController {

	@Autowired
	
	private IEmployeemgmtService empService;
	
	@GetMapping("/")
	public String ShowHome() {
		return "home";
	
	}
	
}
