package com.financetracker.infrastructure.persistence.repository;

import com.financetracker.infrastructure.persistence.entity.Budget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BudgetRepository extends MongoRepository<Budget, Long> {
}
