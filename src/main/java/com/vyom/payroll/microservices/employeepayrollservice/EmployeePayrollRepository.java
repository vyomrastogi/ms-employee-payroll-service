/**
 * 
 */
package com.vyom.payroll.microservices.employeepayrollservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vyom
 *
 */
public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Long> {

}
