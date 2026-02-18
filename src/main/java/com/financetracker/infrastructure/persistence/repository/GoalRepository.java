package com.financetracker.infrastructure.persistence.repository;

import com.financetracker.infrastructure.persistence.entity.Goal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoalRepository extends MongoRepository<Goal, Long> {
}
