/**
 * 
 */
package com.vyom.payroll.microservices.employeepayrollservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Vyom
 *
 */
@Entity
public class EmployeePayroll {

	@Id
	@Column(name="payroll_id")
	@GeneratedValue
	private Long payrollId;
	@Column(name="emp_id")
	private Long empId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="role_id")
	private Long roleId;
	@Column(name="role_name")
	private String roleName;
	@Column(name="role_description")
	private String roleDescription;
	
	private int port;

	/**
	 * 
	 */
	public EmployeePayroll() {
	}

	/**
	 * @param payrollId
	 * @param empId
	 * @param firstName
	 * @param lastName
	 * @param roleId
	 * @param roleName
	 * @param roleDescription
	 */
	public EmployeePayroll(Long payrollId, Long empId, String firstName, String lastName, Long roleId, String roleName,
			String roleDescription) {
		super();
		this.payrollId = payrollId;
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}

	/**
	 * @return the payrollId
	 */
	public Long getPayrollId() {
		return payrollId;
	}

	/**
	 * @param payrollId the payrollId to set
	 */
	public void setPayrollId(Long payrollId) {
		this.payrollId = payrollId;
	}

	/**
	 * @return the empId
	 */
	public Long getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the roleId
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the roleDescription
	 */
	public String getRoleDescription() {
		return roleDescription;
	}

	/**
	 * @param roleDescription the roleDescription to set
	 */
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}
	
	

}
