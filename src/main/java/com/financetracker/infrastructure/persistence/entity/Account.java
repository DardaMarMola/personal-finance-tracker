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
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user_Id;
    private String name;
    private Short type;
    private Long balance;
    private Long currency_id;
    private Boolean isActive;
    private LocalDateTime delete_at;
    private LocalDateTime create_at;
    private LocalDateTime update_at;
}