package com.example.hakatonsber_2023_backend.controllers;

import com.example.hakatonsber_2023_backend.dto.TaskDTO;
import com.example.hakatonsber_2023_backend.dto.TaskSearchDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TaskController {

    @PostMapping("/todos")
    public ResponseEntity<?> getTasks(@RequestBody TaskSearchDTO taskSearchDTO){
        return null;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createTask(@RequestBody TaskDTO taskDTO){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable long id){
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
