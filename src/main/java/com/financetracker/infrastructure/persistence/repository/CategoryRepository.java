package com.financetracker.infrastructure.persistence.repository;

import com.financetracker.infrastructure.persistence.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, Long> {
}
