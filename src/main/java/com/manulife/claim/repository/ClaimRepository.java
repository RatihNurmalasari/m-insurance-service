package com.manulife.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manulife.claim.model.Claim;

@Repository("claimRepository")
public interface ClaimRepository extends JpaRepository<Claim, Long> {
}
