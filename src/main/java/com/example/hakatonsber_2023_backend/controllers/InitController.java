package com.example.hakatonsber_2023_backend.controllers;


import com.example.hakatonsber_2023_backend.dto.request.AuthRequest;
import com.example.hakatonsber_2023_backend.repositories.TaskRepository;
import com.example.hakatonsber_2023_backend.services.ResponseService;
import com.example.hakatonsber_2023_backend.services.TaskService;
import com.example.hakatonsber_2023_backend.services.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/init")
@CrossOrigin(origins = "*", maxAge = 3600)
public class InitController {


    @Autowired
    private ResponseService responseService;

    @Autowired
    private TaskService taskService;

    @GetMapping("do")
    public void init() {
        responseService.init();
    }

}
