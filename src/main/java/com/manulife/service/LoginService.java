package com.manulife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.manulife.model.Credential;
import com.manulife.repository.CredentialRepository;

@Service("loginService")
public class LoginService{

	@Autowired
	CredentialRepository credentialRepository;

	public Credential getCredentialByEmail(String email) {
		return credentialRepository.findOne(email);
	}

	@Bean
	public PasswordEncoder getPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

	public void save(Credential credential){
		credential.setPassword(getPasswordEncoder().encode(credential.getPassword()));
		credentialRepository.save(credential);
	}
}
