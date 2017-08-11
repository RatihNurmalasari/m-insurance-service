package com.manulife.service;

import java.util.List;

import com.manulife.model.Claim;

public interface ClaimService {
	Claim getClaimById(long claimid);
	List<Claim> getAllClaim();
}
