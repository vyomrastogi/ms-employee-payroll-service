/**
 * 
 */
package com.vyom.payroll.microservices.employeepayrollservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Vyom
 *
 */
@FeignClient(name="employee-service",url="localhost:8080")
public interface EmployeeService {
	
	@GetMapping("/employee/{empId}")
	public EmployeePayroll getEmployeeDetails(@PathVariable("empId") Long empId);

}
