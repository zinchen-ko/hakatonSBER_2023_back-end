package com.example.hakatonsber_2023_backend.repositories;

import com.example.hakatonsber_2023_backend.entity.Task;
import com.example.hakatonsber_2023_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
