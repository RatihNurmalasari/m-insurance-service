package com.manulife.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manulife.claim.model.Credential;
import com.manulife.claim.repository.CredentialRepository;

@Service("loginService")
public class LoginService{
	
	@Autowired
	CredentialRepository credentialRepository;
	
	public Credential getCredentialByEmail(String email) {
		return credentialRepository.findOne(email);
	}
}
