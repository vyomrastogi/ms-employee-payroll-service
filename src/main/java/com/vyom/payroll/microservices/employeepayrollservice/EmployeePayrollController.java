/**
 * 
 */
package com.vyom.payroll.microservices.employeepayrollservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Vyom
 *
 */
@RestController
public class EmployeePayrollController {

	@Autowired
	EmployeePayrollRepository employeePayrollRepository;
	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	RoleService roleService;

	@PostMapping("/employee/{empId}/role/{roleName}")
	public EmployeePayroll insertEmployeePayrollDetails(@PathVariable Long empId, @PathVariable String roleName) {

		/*
		 * Removed Resttemplate, for using Feign
		 * ResponseEntity<EmployeePayroll> employeeEntity = new RestTemplate()
				.getForEntity("http://localhost:8080/employee/{empId}", EmployeePayroll.class, empId);

		ResponseEntity<EmployeePayroll> roleEntity = new RestTemplate()
				.getForEntity("http://localhost:8101/role/{roleName}", EmployeePayroll.class, roleName);*/

		EmployeePayroll employeePayroll = employeeService.getEmployeeDetails(empId);
		EmployeePayroll roleDetail = roleService.getEmployeeRole(roleName);
		employeePayroll.setRoleId(roleDetail.getRoleId());
		employeePayroll.setRoleName(roleDetail.getRoleName());
		employeePayroll.setRoleDescription(roleDetail.getRoleDescription());

		employeePayrollRepository.save(employeePayroll);
		
		return employeePayroll;

	}
}
