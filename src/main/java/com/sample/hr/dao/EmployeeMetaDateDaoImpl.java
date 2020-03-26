/**
 * 
 */
package com.sample.hr.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sample.hr.po.CountryPO;
import com.sample.hr.po.DepartmentPO;
import com.sample.hr.po.JobPO;
import com.sample.hr.po.RegionPO;

/**
 * @author USER1
 *
 */
@Repository
@Qualifier("employeeMetaDataDaoImpl")
public class EmployeeMetaDateDaoImpl implements EmployeeMetaDateDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * This method used to fetch all active departments from HR data
	 * @see com.sample.hr.dao.EmployeeMetaDateDao#fetchDepartments()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<DepartmentPO> fetchDepartments() {
		Session session = sessionFactory.getCurrentSession();
		List<Object[]> objectsList  = session.createQuery("select departmentId, departmentName from DepartmentPO")
				.setCacheable(true).list();
		List<DepartmentPO> departmentPOs = new ArrayList<DepartmentPO>();
		objectsList.parallelStream().forEach((a -> {
			DepartmentPO departmentPO = new DepartmentPO();
			departmentPO.setDepartmentId((int)a[0]);
			departmentPO.setDepartmentName((String)a[1]);
			departmentPOs.add(departmentPO);
		}));
		return departmentPOs;
	}

	/* (non-Javadoc)
	 * @see com.sample.hr.dao.EmployeeMetaDateDao#fetchCountries()
	 */
	@Override
	public List<CountryPO> fetchCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.sample.hr.dao.EmployeeMetaDateDao#fetchRegions()
	 */
	@Override
	public List<RegionPO> fetchRegions() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.sample.hr.dao.EmployeeMetaDateDao#fetchJobNames()
	 */
	@Override
	public List<JobPO> fetchJobNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
