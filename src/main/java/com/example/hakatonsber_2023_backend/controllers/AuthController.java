package com.example.hakatonsber_2023_backend.controllers;


import com.example.hakatonsber_2023_backend.dto.request.AuthRequest;
import com.example.hakatonsber_2023_backend.dto.response.MessageResponse;
import com.example.hakatonsber_2023_backend.repositories.TaskRepository;
import com.example.hakatonsber_2023_backend.services.ResponseService;
import com.example.hakatonsber_2023_backend.services.TaskService;
import com.example.hakatonsber_2023_backend.services.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private ResponseService responseService;

    @Autowired
    private TaskService taskService;

    @PostMapping("/register")
    public MessageResponse register(@RequestBody AuthRequest user) {
        return userService.register(user);
    }


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest user) {
        try {

            return ResponseEntity.ok(userService.login(user));
        } catch (BadCredentialsException e){
            return ResponseEntity.badRequest().body("Wrong login or password");
        } catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
