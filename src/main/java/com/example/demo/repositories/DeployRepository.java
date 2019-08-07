package com.example.demo.repositories;

import com.example.demo.models.Deploy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeployRepository extends JpaRepository<Deploy, Long> {
}
