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
@FeignClient(name = "role-service", url = "localhost:8101")
public interface RoleService {

	@GetMapping("/role/{roleName}")
	public EmployeePayroll getEmployeeRole(@PathVariable("roleName") String roleName);
}
