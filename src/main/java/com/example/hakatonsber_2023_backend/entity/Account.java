package com.example.hakatonsber_2023_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="account")
@NoArgsConstructor
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

    public Account(String name, String address, String inn, String ogrn, String ulAddress) {
        this.name = name;
        this.address = address;
        this.inn = inn;
        this.ogrn = ogrn;
        this.ulAddress = ulAddress;
    }
}
