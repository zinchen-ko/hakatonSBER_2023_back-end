package com.example.hakatonsber_2023_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="role",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username")
        })
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    
    private String name;

    @ManyToMany
    private Set<Right> rights;
}
