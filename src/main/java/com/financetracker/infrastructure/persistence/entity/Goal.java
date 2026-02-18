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
@Document(collection = "goal")
public class Goal {
    @Id
    @JsonIgnore
    private Long id;
    private Long user_id;
    private String name;
    private Long target_amount;
    private Long current_amount;
    private LocalDateTime target_date;
    private LocalDateTime create_at;
    private LocalDateTime update_at;
}