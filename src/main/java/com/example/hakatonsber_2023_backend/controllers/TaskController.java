package com.example.hakatonsber_2023_backend.controllers;

import com.example.hakatonsber_2023_backend.dto.request.TaskDTO;
import com.example.hakatonsber_2023_backend.dto.request.TaskSearchDTO;
import com.example.hakatonsber_2023_backend.entity.Status;
import com.example.hakatonsber_2023_backend.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TaskController {


    @PostMapping("/todos")
    public ResponseEntity<?> getTasks(@RequestBody TaskSearchDTO taskSearchDTO){
        return ResponseEntity.ok("Okey");
    }

    @PostMapping("/create")
    public ResponseEntity<?> createTask(@RequestBody TaskDTO taskDTO){
        return null;
    }

//    @DeleteMapping("/delete/{id}")
//    public List<Status> deleteTask(@PathVariable long id){
//        return ;
//    }

    @PostMapping("/get/update")
    public ResponseEntity<?> updateTask(@RequestBody TaskDTO taskDTO){
        return null;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getTask(@PathVariable long id){
        return null;
    }
}
