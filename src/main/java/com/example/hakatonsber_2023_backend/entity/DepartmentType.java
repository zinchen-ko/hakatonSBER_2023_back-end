package com.example.hakatonsber_2023_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="departmentType",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username")
        })
public class DepartmentType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

}
