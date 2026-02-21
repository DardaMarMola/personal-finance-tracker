package com.financetracker.infrastructure.persistence.repository;

import com.financetracker.infrastructure.persistence.entity.BudgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<BudgetEntity, Long> {
}
