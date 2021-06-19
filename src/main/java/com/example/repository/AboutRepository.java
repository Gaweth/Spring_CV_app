package com.example.repository;

import com.example.model.About;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepository extends JpaRepository<About, Long> {

    About save(About about);
    About findById(Long about);



}
