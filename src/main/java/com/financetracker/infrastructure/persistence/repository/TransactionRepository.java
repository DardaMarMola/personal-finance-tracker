package com.financetracker.infrastructure.persistence.repository;

import com.financetracker.infrastructure.persistence.entity.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, Long> {
}
