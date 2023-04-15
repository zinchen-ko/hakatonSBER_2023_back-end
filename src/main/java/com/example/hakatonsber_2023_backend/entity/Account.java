package com.example.hakatonsber_2023_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="account",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username")
        })
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String address;

    private String inn;

    private String ogrn;

    private String ulAddress;
}
