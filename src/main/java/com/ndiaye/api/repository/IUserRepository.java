package com.ndiaye.api.repository;

import com.ndiaye.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {


}
