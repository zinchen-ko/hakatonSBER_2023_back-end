package com.example.hakatonsber_2023_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="department")
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;

    private int countOfWorkers;

    private int maxCountOfWorkers;

    public Department(String name, Account account, int countOfWorkers, int maxCountOfWorkers) {
        this.name = name;
        this.account = account;
        this.countOfWorkers = countOfWorkers;
        this.maxCountOfWorkers = maxCountOfWorkers;
    }
}
