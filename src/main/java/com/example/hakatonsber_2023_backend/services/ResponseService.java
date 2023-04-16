package com.example.hakatonsber_2023_backend.services;

import com.example.hakatonsber_2023_backend.entity.Status;
import com.example.hakatonsber_2023_backend.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    @Autowired
    private StatusRepository statusRepository;

    public List<Status> getStatus() {
        return statusRepository.findAll();
    }

//    public List<>

}
