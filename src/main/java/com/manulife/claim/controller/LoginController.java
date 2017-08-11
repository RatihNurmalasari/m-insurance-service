package com.manulife.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manulife.claim.model.Credential;
import com.manulife.claim.model.Profile;
import com.manulife.claim.service.LoginService;
import com.manulife.claim.service.ProfileService;
import com.manulife.claim.util.CustomErrorType;

@CrossOrigin
@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;
	@Autowired
	private ProfileService profileService;
	
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/account/login", method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody Credential loginReq) {
    	    	if(loginReq.getEmail().isEmpty() || loginReq.getPassword().isEmpty()) {
	    		return new ResponseEntity(new CustomErrorType("Please check your email and password"), HttpStatus.NOT_FOUND);
	    	}

	    Credential credential = loginService.getCredentialByEmail(loginReq.getEmail());
	    	if(credential != null && loginReq.getPassword().equals(credential.getPassword())) {
	    		Profile profile = profileService.getProfileByEmail(credential.getEmail());
    			return new ResponseEntity<>(profile, HttpStatus.OK);
	    	}
	    	
	    	return new ResponseEntity(new CustomErrorType("Please check your email and password"), HttpStatus.NOT_FOUND);	
	}
}


