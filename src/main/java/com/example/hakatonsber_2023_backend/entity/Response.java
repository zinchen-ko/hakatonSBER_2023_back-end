package com.example.hakatonsber_2023_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="response")
@NoArgsConstructor
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private Date date;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Employee employee;

    @OneToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "status_id")
    private Status status;

    private String text;

    public Response(String name, Employee employee, Department department, Status status, String text) {
        this.name = name;
        this.employee = employee;
        this.department = department;
        this.status = status;
        this.text = text;
    }
}
