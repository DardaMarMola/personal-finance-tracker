package com.financetracker.infrastructure.persistence.repository;

import com.financetracker.infrastructure.persistence.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, Long> {

}
