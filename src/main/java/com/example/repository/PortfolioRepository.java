package com.example.repository;

import com.example.model.About;
import com.example.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

    Portfolio save(Portfolio portfolio);
    Portfolio findById(Long portfolio);


}