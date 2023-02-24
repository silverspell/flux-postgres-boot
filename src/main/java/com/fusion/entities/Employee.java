package com.fusion.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDate;

@Builder
@ToString
@Data
@AllArgsConstructor
public class Employee {
    @Id
    private Long id;
    private String name;
    private String surname;
    @Column(value = "birthdate")
    private LocalDate birthDate;
}
