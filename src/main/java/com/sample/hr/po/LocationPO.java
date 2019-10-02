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
@Table(name="LOCATIONS")
public class LocationPO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="seqenceGen")	
	@SequenceGenerator(name="seqenceGen",sequenceName="USERS_SEQ")
	@Column(name="LOCATION_ID")
	private int locationId;
	@Column(name="STREET_ADDRESS")
	private String address;
	@Column(name="POSTAL_CODE")
	private String postalCode;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE_PROVINCE")
	private String state;
	@ManyToOne
	@JoinColumn(name="COUNTRY_ID")
	private CountryPO country;
	
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public CountryPO getCountry() {
		return country;
	}
	public void setCountry(CountryPO country) {
		this.country = country;
	}
	
	
	
}
