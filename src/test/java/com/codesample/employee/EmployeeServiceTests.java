package com.codesample.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codesample.employee.model.Employee;
import com.codesample.employee.service.EmployeeService;

@SpringBootTest
class EmployeeServiceTests {

	@Autowired EmployeeService employeeService;
	
	@Test
	void testGetEmployee() {
		Employee employee = employeeService.getEmployee();
		assertEquals("E101", employee.getId());
		assertEquals("John", employee.getName());
		assertEquals("Engineer", employee.getDesignation());
	}
}
