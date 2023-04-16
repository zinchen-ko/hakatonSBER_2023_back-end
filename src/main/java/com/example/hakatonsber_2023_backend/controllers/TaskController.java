package com.example.hakatonsber_2023_backend.controllers;

import com.example.hakatonsber_2023_backend.dto.request.TaskDTO;
import com.example.hakatonsber_2023_backend.dto.request.TaskSearchDTO;
import com.example.hakatonsber_2023_backend.entity.Status;
import com.example.hakatonsber_2023_backend.entity.Task;
import com.example.hakatonsber_2023_backend.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TaskController {


    @Autowired
    private TaskService taskService;

    @PostMapping("/todos")
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping("/create")
    public ResponseEntity<?> createTask(@RequestBody TaskDTO taskDTO){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public List<Status> deleteTask(@PathVariable long id){
        return null;
    }

    @PostMapping("/get/update")
    public ResponseEntity<?> updateTask(@RequestBody TaskDTO taskDTO){
        return null;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getTask(@PathVariable long id){
        return null;
    }
}
