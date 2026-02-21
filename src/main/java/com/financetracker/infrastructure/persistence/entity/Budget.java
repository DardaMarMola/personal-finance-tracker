package com.financetracker.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "budget")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
