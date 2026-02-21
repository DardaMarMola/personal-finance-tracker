package com.financetracker.infrastructure.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "transaction")
public class TransactionEntity {
    @Id
    @JsonIgnore
    private Long id;
    private Long user_id;
    private Long account_id;
    private Long category_id;
    private String type;
    private BigDecimal amount;
    private String description;
    private LocalDateTime transaction_at;
    private String receipt_url;
    private String tags;
    private LocalDateTime created_at;
}
