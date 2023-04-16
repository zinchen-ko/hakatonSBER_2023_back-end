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

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Account account;

    private String countOfWorkers;

    @OneToOne
    @JoinColumn(name = "department_type_id")
    private DepartmentType departmentType;

    private String maxCountOfWorkers;

    public Department(String name, Account account, String countOfWorkers, DepartmentType departmentType, String maxCountOfWorkers) {
        this.name = name;
        this.account = account;
        this.countOfWorkers = countOfWorkers;
        this.departmentType = departmentType;
        this.maxCountOfWorkers = maxCountOfWorkers;
    }
}
