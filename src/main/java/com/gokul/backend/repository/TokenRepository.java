package com.gokul.backend.repository;

import com.gokul.backend.models.AccountVerificationToken;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TokenRepository extends CrudRepository<AccountVerificationToken,Long> {
    Optional<AccountVerificationToken>findByToken(String token);
}
