package com.example.hakatonsber_2023_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TaskSearchDTO {

    private String name;

    private int offset;
}
