package com.manulife;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
 
import com.manulife.config.CustomUserDetails;
import com.manulife.model.Claim;
import com.manulife.model.Credential;
import com.manulife.model.Hospital;
import com.manulife.model.Profile;
import com.manulife.repository.ClaimRepository;
import com.manulife.repository.CredentialRepository;
import com.manulife.repository.ProfileRepository;
import com.manulife.security.entities.Role;
import com.manulife.service.LoginService;



@SpringBootApplication
public class ClaimSpringbootApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(ClaimSpringbootApplication.class);
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ClaimSpringbootApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(CredentialRepository credentialRepository, ClaimRepository claimRepository, ProfileRepository profileRepository) {
		return (args) -> {

			// Dummy data for credential
			credentialRepository.save(new Credential("alexa.sawyer@gmail.com", "ABC123abc"));
			
			// Dummy data for profile
			profileRepository.save(new Profile("alexa.sawyer@gmail.com", "Alexa", "Sawyer", "08/01/1974", "302-2951 Ipsum. Road", "Lowell", "Massachusetts", "US", "49235", "(128) 858-2131"));
			
			// Dummy data for claim details
			claimRepository.save(new Claim("16080215833", "8282474042", "alexa.sawyer@gmail.com", "Alexa Sawyer", "Processed", "02/24/2017", "02/24/2017", "$210", "$210", new Hospital("Union Hospital", "659 Boulevard St", "Dover", "Ohio", "44622", "United States")));
			claimRepository.save(new Claim("16170321000", "8282727332", "alexa.sawyer@gmail.com", "Alexa Sawyer", "In-Progress", "03/01/2017", "03/15/2017", "$670", "$500", new Hospital("Northwestern Memorial Hospital", "251 E Huron St", "Chicago", "Illinois", "60611", "United States")));
			
			logger.info("The sample data has been generated");

		};
	}
	
	/**
	 * Password grants are switched on by injecting an AuthenticationManager.
	 * Here, we setup the builder so that the userDetailsService is the one we coded.
	 * @param builder
	 * @param repository
	 * @throws Exception
     */
	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, CredentialRepository repository, LoginService service) throws Exception {
		//Setup a default user if db memory is empty
		if (repository.count()==0)
			service.save(new Credential("user", "user", Arrays.asList(new Role("USER"), new Role("ACTUATOR"))));
		builder.userDetailsService(userDetailsService(repository)).passwordEncoder(passwordEncoder);
	}

	/**
	 * We return an istance of our CustomUserDetails.
	 * @param repository
	 * @return
     */
	private UserDetailsService userDetailsService(final CredentialRepository repository) {
		return username -> new CustomUserDetails(repository.findByUsername(username));
	}

}
