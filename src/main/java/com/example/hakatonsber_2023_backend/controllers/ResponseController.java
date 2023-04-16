package com.example.hakatonsber_2023_backend.controllers;

import com.example.hakatonsber_2023_backend.entity.Response;
import com.example.hakatonsber_2023_backend.entity.Status;
import com.example.hakatonsber_2023_backend.services.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/response")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ResponseController {

    @Autowired
    private ResponseService responseService;

    @GetMapping("/getStatus")
    public List<Status> getStatus(Principal principal) {
        return responseService.getStatus();
    }

    @GetMapping("/getResponse")
    public List<Response> getResponse(Principal principal) {
        return responseService.getResponse();
    }
}
