package com.example.hakatonsber_2023_backend.repositories;

import com.example.hakatonsber_2023_backend.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {

    Optional<Status> findByStatus(String username);

    Boolean existsByStatus(String username);

}
