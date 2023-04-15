package com.example.hakatonsber_2023_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employee",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username")
        })
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String surname;

    private String patronymic;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;

    private String phone;

    private String email;

    private String password;

    @OneToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
