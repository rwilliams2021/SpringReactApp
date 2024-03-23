package com.springreact.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Designer extends User {
    double hourlyRate;
    int yearsOfExperience;
    @ManyToMany
    List<Client> clients;
}
