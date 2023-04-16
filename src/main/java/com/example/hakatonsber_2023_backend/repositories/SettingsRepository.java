package com.example.hakatonsber_2023_backend.repositories;

import com.example.hakatonsber_2023_backend.entity.Response;
import com.example.hakatonsber_2023_backend.entity.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SettingsRepository extends JpaRepository<Settings, Long> {

}
