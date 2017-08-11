package com.manulife;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.manulife.model.Claim;
import com.manulife.model.Credential;
import com.manulife.model.Profile;
import com.manulife.repository.ClaimRepository;
import com.manulife.repository.CredentialRepository;
import com.manulife.repository.ProfileRepository;

@SpringBootApplication
public class ClaimSpringbootApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(ClaimSpringbootApplication.class);


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
			claimRepository.save(new Claim("Alexa Mcintyre", "Alexa", "","Mcintyre","08-28-77", "P.O. Box 260, 8095 Gravida. Avenue","","San Antonio","40870","Texas","United States","(877) 729-4633","sollicitudin@elitpede.com",1608021583 , "In Progress",""));
			claimRepository.save(new Claim("Kaseem Patel", "Kaseem", "","Patel","01-04-74", "302-2951 Ipsum. Road","","Lowell","49533","Massachusetts","United States","(716) 182-6793","sollicitudin@semmollis.co.uk",1608021584 , "Completed",""));
			claimRepository.save(new Claim("Amery Sawyer", "Amery", "","Sawyer","11-10-86", "8832 Faucibus Street","","Butte","65877","Montana","United States","(890) 628-3495","scelerisque.neque.sed@Proinegetodio.co.uk",1608021585 , "Rejected"," "));
			claimRepository.save(new Claim("Travis Russo", "Travis", "","Russo","05-14-84", "282-1169 Tincidunt, Av.","","Portland","58127","Oregon","United States","(128) 858-2131","spede.Praesent@feugiatmetussit.edu",1608021586 , "Completed",""));
			claimRepository.save(new Claim("Timothy Russell", "Timothy", "","Russell","02-23-87", "Ap #751-271 Elit. Street","","Burlington","29059","Vermont","United States","(596) 620-7942","pede.Cum@orci.org",1608021587 , "In Progress",""));
			
			logger.info("The sample data has been generated");

		};
	}
}
