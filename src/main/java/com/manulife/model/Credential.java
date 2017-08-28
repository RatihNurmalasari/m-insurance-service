package com.manulife.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Credential {
	
	@Id
	//@GeneratedValue
	private String email;
	private String pass;
	
	public Credential() {
		this.email = "";
		this.pass = "";
	}
	
	public Credential(String email, String password) {
		this.email = email;
		this.pass = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
		
}
