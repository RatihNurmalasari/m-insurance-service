package com.manulife.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.manulife.security.entities.Role;

@Entity
public class Credential {
	
	@Id
	//@GeneratedValue
	private String username;
	private String password;
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Role> roles;
	
	public Credential() {
		this.username = "";
		this.password = "";
	}
	public Credential(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Credential(String username, String password ,List<Role> roles) {
		this.username = username;
		this.password = password;
		this.roles = roles;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
		
}
