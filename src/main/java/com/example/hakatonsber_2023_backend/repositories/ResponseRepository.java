package com.example.hakatonsber_2023_backend.repositories;

import com.example.hakatonsber_2023_backend.entity.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {

}
