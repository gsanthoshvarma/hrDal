package com.sample.hr.config;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.sample.hr.po.CountryPO;
import com.sample.hr.po.DepartmentPO;
import com.sample.hr.po.EmployeePO;
import com.sample.hr.po.LocationPO;
import com.sample.hr.po.RegionPO;

@Configurable
public class HREmployeeConfig {

	
	
}
