package com.financetracker.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
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