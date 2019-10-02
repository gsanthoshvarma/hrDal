package com.sample.hr.po;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
public class DepartmentPO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="sequenceGen")
	@SequenceGenerator(name="sequenceGen",sequenceName="DEPARTMENTS_SEQ")
	@Column(name="DEPARTMENT_ID")
	private int departmentId;
	@Column(name="DEPARTMENT_NAME")
	private String departmentName;
	@OneToOne
	@JoinColumn(name="MANAGER_ID")
	private EmployeePO manager;
	@ManyToOne
	@JoinColumn(name="LOCATION_ID")
	private LocationPO location;
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public EmployeePO getManager() {
		return manager;
	}
	public void setEmployeeId(EmployeePO manager) {
		this.manager = manager;
	}
	public LocationPO getLocation() {
		return location;
	}
	public void setLocationId(LocationPO location) {
		this.location = location;
	}
	
	
	
	
}
