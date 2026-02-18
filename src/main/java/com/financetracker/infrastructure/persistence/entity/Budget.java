package com.financetracker.infrastructure.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "budget")
public class Budget {
    @Id
    @JsonIgnore
    private Long id;
    private Long user_id;
    private Short category_id;
    private Short month;
    private Short year;
    private Long limit_amount;
    private Long alert_threshold;
    private LocalDateTime create_at;
    private LocalDateTime update_at;
}
