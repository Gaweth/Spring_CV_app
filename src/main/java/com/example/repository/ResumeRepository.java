package com.example.repository;

import com.example.model.Portfolio;
import com.example.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

    Resume save(Resume resume);
    Resume findById(Long resume);

}
