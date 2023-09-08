package com.codesample.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesample.employee.model.Employee;
import com.codesample.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired EmployeeService employeeService;
	
	@GetMapping("/employees")
	public Employee getEmployee() {
		return employeeService.getEmployee();
	}
}