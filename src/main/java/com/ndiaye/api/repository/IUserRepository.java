package com.ndiaye.api.repository;

import com.ndiaye.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByEmail(String email);
}