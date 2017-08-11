package com.manulife.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manulife.claim.model.Credential;

@Repository("credentialRepository")
public interface CredentialRepository extends JpaRepository<Credential, String> {
}
