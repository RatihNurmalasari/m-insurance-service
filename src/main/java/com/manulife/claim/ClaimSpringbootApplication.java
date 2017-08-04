package com.manulife.claim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.manulife.claim.model.Claim;
import com.manulife.claim.repository.ClaimRepository;

@SpringBootApplication
public class ClaimSpringbootApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(ClaimSpringbootApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ClaimSpringbootApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(ClaimRepository claimRepository) {
		return (args) -> {
			claimRepository.save(new Claim("Alexa Mcintyre", "Alexa", "","Mcintyre","08-28-77", "P.O. Box 260, 8095 Gravida. Avenue","","San Antonio","40870","Texas","United States","(877) 729-4633","sollicitudin@elitpede.com",1608021583 , "In Progress",""));
			claimRepository.save(new Claim("Kaseem Patel", "Kaseem", "","Patel","01-04-74", "302-2951 Ipsum. Road","","Lowell","49533","Massachusetts","United States","(716) 182-6793","sollicitudin@semmollis.co.uk",1608021584 , "Completed",""));
			claimRepository.save(new Claim("Amery Sawyer", "Amery", "","Sawyer","11-10-86", "8832 Faucibus Street","","Butte","65877","Montana","United States","(890) 628-3495","scelerisque.neque.sed@Proinegetodio.co.uk",1608021585 , "Rejected"," "));
			claimRepository.save(new Claim("Travis Russo", "Travis", "","Russo","05-14-84", "282-1169 Tincidunt, Av.","","Portland","58127","Oregon","United States","(128) 858-2131","spede.Praesent@feugiatmetussit.edu",1608021586 , "Completed",""));
			claimRepository.save(new Claim("Timothy Russell", "Timothy", "","Russell","02-23-87", "Ap #751-271 Elit. Street","","Burlington","29059","Vermont","United States","(596) 620-7942","pede.Cum@orci.org",1608021587 , "In Progress",""));
			logger.info("The sample data has been generated");

		};
	}
}
