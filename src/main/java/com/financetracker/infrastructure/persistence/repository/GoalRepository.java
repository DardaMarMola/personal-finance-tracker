package com.financetracker.infrastructure.persistence.repository;

import com.financetracker.infrastructure.persistence.entity.GoalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<GoalEntity, Long> {
}
