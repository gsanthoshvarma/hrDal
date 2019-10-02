package com.sample.hr.dao;

import java.util.List;

import com.sample.hr.po.EmployeePO;

public interface Employee {
	
	public void save(EmployeePO employeePO);
	
	public List<EmployeePO> getEmployees();
	
	public int update(EmployeePO employeePO);
	
	public int deleteEmployee(long empId);
	
	public void close();
	
	public EmployeePO getEmployeeById(int employeeId);

}
