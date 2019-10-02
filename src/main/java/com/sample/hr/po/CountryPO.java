package com.sample.hr.po;

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

@Entity
@Table(name="COUNTRIES")
public class CountryPO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="seqenceGen")	
	@SequenceGenerator(name="seqenceGen",sequenceName="USERS_SEQ")
	@Column(name="COUNTRY_ID")
	private String countryId;
	@Column(name="COUNTRY_NAME")
	private String countryName;
	@ManyToOne
	@JoinColumn(name="REGION_ID")
	private RegionPO regionId;
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public RegionPO getRegionId() {
		return regionId;
	}
	public void setRegionId(RegionPO regionId) {
		this.regionId = regionId;
	}
	
	
	
}
