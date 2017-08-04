package com.manulife.claim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manulife.claim.model.Claim;
import com.manulife.claim.repository.ClaimRepository;

@Service("claimService")
public class ClaimServiceImpl implements ClaimService {
	
	@Autowired
	ClaimRepository claimRepository; 

	@SuppressWarnings("unchecked")
	@Override
	public Claim getClaimById(long claimid) {
		return claimRepository.findOne(claimid);
	}

	@Override
	public List<Claim> getAllClaim() {
		return claimRepository.findAll();
	}

}
