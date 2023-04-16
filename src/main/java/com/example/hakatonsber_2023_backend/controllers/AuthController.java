package com.example.hakatonsber_2023_backend.controllers;


import com.example.hakatonsber_2023_backend.dto.request.AuthRequest;
import com.example.hakatonsber_2023_backend.services.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web-lab4/api/auth")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AuthRequest user) {
        try {
            return ResponseEntity.ok(userService.register(user));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
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
