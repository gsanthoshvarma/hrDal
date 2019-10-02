package com.sample.hr.dao;


import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.hr.po.EmployeePO;

@Repository
public class EmployeeDaoImpl implements Employee{
	private static final Logger LOG = Logger.getLogger(EmployeeDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(EmployeePO employeePO) {
		Session session = sessionFactory.getCurrentSession();
		session.save(employeePO);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<EmployeePO> getEmployees() {
		LOG.info("getEmployee method executed");
		Session session = sessionFactory.openSession();
		List<EmployeePO> employeePOs = session.createQuery("from EmployeePO").list();
		return employeePOs;
	}

	@Override
	public int update(EmployeePO employeePO) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(employeePO);
		return 0;
	}

	@Override
	public int deleteEmployee(long empId) {
		return 0;
	}

	@Override
	public void close() {
	}
	

}
