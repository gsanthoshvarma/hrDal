package com.sample.hr.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="REGIONS")
public class RegionPO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="seqenceGen")	
	@SequenceGenerator(name="seqenceGen",sequenceName="USERS_SEQ")
	@Column(name="REGION_ID")
	private int regionId;
	@Column(name="REGION_NAME")
	private String regionName;
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	
	
}
