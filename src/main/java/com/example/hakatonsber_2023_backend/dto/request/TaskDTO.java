package com.example.hakatonsber_2023_backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class TaskDTO {

    private String text;

    private Date startDate;

    private Date endDate;

    private String taskType;

    private Long toId;

    private Long employeeFrom;

    private Long employeeTo;
}
