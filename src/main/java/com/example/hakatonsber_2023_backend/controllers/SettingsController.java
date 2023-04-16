package com.example.hakatonsber_2023_backend.controllers;

import com.example.hakatonsber_2023_backend.entity.Settings;

import com.example.hakatonsber_2023_backend.services.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/settings")
@CrossOrigin(origins = "*", maxAge = 3600)
public class SettingsController {

    @Autowired
    private SettingsService settingsService;

    @PostMapping("/getSettings/{id}")
    public List<Settings> getSettings(@PathVariable long id) {
        return settingsService.getSettings(id);
    }
}
