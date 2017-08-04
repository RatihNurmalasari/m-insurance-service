package com.manulife.claim.service;

import java.util.List;

import com.manulife.claim.model.Claim;

public interface ClaimService {
	Claim getClaimById(long claimid);
	List<Claim> getAllClaim();
}
