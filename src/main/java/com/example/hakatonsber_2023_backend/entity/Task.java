package com.example.hakatonsber_2023_backend.entity;

import com.example.hakatonsber_2023_backend.controllers.ResponseController;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="task")
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String text;

    private Date startDate;

    private Date endDate;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "response_id")
    private Response response;

    public Task(String text, Date startDate, Date endDate, Employee employee, Response response) {
        this.text = text;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employee = employee;
        this.response = response;
    }
}
