package com.codesample.employee.service;

import org.springframework.stereotype.Service;
import com.codesample.employee.model.Employee;

@Service
public class EmployeeService {
	
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId("E101");
		employee.setName("John");
		employee.setDesignation("Engineer");
		return employee;
	}
}
