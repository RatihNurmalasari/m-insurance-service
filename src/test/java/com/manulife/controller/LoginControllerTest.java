package com.manulife.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.manulife.model.Credential;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginControllerTest {
	@Autowired
	LoginController loginController;
	
	@Test
	public void testValidateCredentialSuccess() {
		Credential credential = new Credential("alexa.sawyer@gmail.com", "ABC123abc");
		Credential loginReq = new Credential("alexa.sawyer@gmail.com", "ABC123abc");
		assertTrue(loginController.validateCredential(credential, loginReq));
	}

}
