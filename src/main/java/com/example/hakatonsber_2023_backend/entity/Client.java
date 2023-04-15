package com.example.hakatonsber_2023_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="client",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username")
        })
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String surname;

    private String patronymic;

    private String phone;

    private String email;

    private String password;
}
