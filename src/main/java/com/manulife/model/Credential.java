package com.manulife.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Credential {
	
	@Id
	//@GeneratedValue
	private String email;
	private String password;
	
	public Credential() {
		this.email = "";
		this.password = "";
	}
	
	public Credential(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
}
