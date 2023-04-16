package com.example.hakatonsber_2023_backend.services;

import com.example.hakatonsber_2023_backend.entity.Employee;
import com.example.hakatonsber_2023_backend.entity.Response;
import com.example.hakatonsber_2023_backend.entity.Task;
import com.example.hakatonsber_2023_backend.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }


}
