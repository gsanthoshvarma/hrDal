package com.sample.hr.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMPLOYEES")
public class EmployeePO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="sequenceGen")
	@SequenceGenerator(name="sequenceGen",sequenceName="EMPLOYEES_SEQ")
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL")
	private String emailId;
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	@Column(name="HIRE_DATE")
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	@ManyToOne
	@JoinColumn(name="JOB_ID")
	private JobPO job;
	@Column(name="SALARY")
	private long salary;
	@Column(name="COMMISSION_PCT",nullable=true)	
	private Double commissionPercentage;
	@Column(name="MANAGER_ID")
	private Integer managerId;
	@ManyToOne
	@JoinColumn(name="DEPARTMENT_ID")
	private DepartmentPO departmentPO;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public JobPO getJob() {
		return job;
	}
	public void setJob(JobPO job) {
		this.job = job;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Double getCommissionPercentage() {
		return commissionPercentage;
	}
	public void setCommissionPercentage(Double commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public DepartmentPO getDepartmentPO() {
		return departmentPO;
	}
	public void setDepartmentPO(DepartmentPO departmentPO) {
		this.departmentPO = departmentPO;
	}
	
	
	

}
