package com.example.hakatonsber_2023_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="task",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username")
        })
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String text;

    private Date startDate;

    private Date endDate;

    @OneToOne
    @JoinColumn(name = "task_type_id")
    private TaskType taskType;

    @OneToOne
    @JoinColumn(name = "employee_from_id")
    private Employee employeeFrom;

    @OneToOne
    @JoinColumn(name = "employee_to_id")
    private Employee employeeTo;

    private Long toId;
}
