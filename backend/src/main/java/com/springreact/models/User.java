package com.springreact.models;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String firstName;
    String lastName;
    int dob;
    String phoneNumber;
    String email;
}
