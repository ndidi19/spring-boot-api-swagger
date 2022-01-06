package com.ndiaye.api.service;

import com.ndiaye.api.dto.CreateUserDto;
import com.ndiaye.api.dto.UpdateUserDto;
import com.ndiaye.api.entity.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();

    User createUser(CreateUserDto user);

    User getUserById(Long id);

    User updateUser(Long id, UpdateUserDto user);

    void deleteUserById(Long id);
}
