package com.example.repository;

import com.example.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityRepository  extends JpaRepository<UserEntity, Long> {


    Optional<UserEntity> findByUsernameIgnoreCase (String username);
}
