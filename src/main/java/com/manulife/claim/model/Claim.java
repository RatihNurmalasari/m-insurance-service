package com.manulife.claim.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.http.ResponseEntity;

import com.manulife.claim.util.CustomErrorType;

@Entity
public class Claim {
	
	@Id
	//@GeneratedValue
	private Long claimid;
	private String name;
	private String firstName;
	private String middelName;
	private String lastName;
	private String dob;
	private String addressline1;
	private String addressline2;
	private String city;
	private String state;
	private String country; 
	private String zipcode;
	private String phoneNumber;
	private String emailID;
	private String claimstatus;
	private String sessionID;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}


	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getClaimstatus() {
		return claimstatus;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//private boolean claimstatus;
	
	public Claim() {
		super();
	}
	
	public Long getClaimid() {
		return claimid;
	}

	public void setClaimid(Long claimid) {
		this.claimid = claimid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddelName() {
		return middelName;
	}

	public void setMiddelName(String middelName) {
		this.middelName = middelName;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String isClaimstatus() {
		return claimstatus;
	}

	public void setClaimstatus(String claimstatus) {
		this.claimstatus = claimstatus;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Claim(String name, String firstName,String middelName,String lastName,String dob ,String addressline1,
			String addressline2, String city,String zipcode ,String state,String country,String phoneNumber,String emailID ,long claimid, String claimstatus, String sessionID) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.middelName = middelName;
		this.lastName = lastName;
		this.dob=dob;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.emailID = emailID;
		this.claimid = claimid;
		this.claimstatus = claimstatus;
		this.sessionID = sessionID;
				
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

		
}
