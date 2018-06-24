package com.vyom.payroll.microservices.employeepayrollservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.vyom.payroll.microservices.employeepayrollservice")
public class EmployeePayrollServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollServiceApplication.class, args);
	}
}
