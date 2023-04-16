package com.example.hakatonsber_2023_backend.services;

import com.example.hakatonsber_2023_backend.entity.Settings;
import com.example.hakatonsber_2023_backend.repositories.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettingsService {

    @Autowired
    private SettingsRepository settingsRepository;

    public List<Settings> getSettings(long id) {

        List<Settings> settingsList = settingsRepository.findAll();
        List<Settings> listOfSettings = null;
        for (int i = 0; i < settingsList.size(); i++) {
            if (settingsList.get(i).getAccount().getId() == id) {
                listOfSettings.add(settingsList.get(i));
            }
        }
        return listOfSettings;
    }
}
