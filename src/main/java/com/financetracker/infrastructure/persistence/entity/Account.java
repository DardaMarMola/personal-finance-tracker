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
@Document(collection = "account")
public class Account {

    @Id
    @JsonIgnore
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