package com.springreact.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigInteger;

@MappedSuperclass
@Data
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Field 'idNumber' is required")
    @Column(unique = true)
    private BigInteger idNumber;
    @NotNull(message = "Field 'firstName' is required")
    String firstName;
    @NotNull(message = "Field 'lastName' is required")
    String lastName;
    int dob;
    String phoneNumber;
    String email;
}
