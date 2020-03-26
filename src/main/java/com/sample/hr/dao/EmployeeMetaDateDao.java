package com.sample.hr.dao;

import java.util.List;

import com.sample.hr.po.CountryPO;
import com.sample.hr.po.DepartmentPO;
import com.sample.hr.po.JobPO;
import com.sample.hr.po.RegionPO;

public interface EmployeeMetaDateDao {
	
	public List<DepartmentPO> fetchDepartments();
	
	public List<CountryPO> fetchCountries();
	
	public List<RegionPO> fetchRegions();
	
	public List<JobPO> fetchJobNames();

}
