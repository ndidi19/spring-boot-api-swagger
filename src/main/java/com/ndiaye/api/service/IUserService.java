package com.ndiaye.api.service;

import com.ndiaye.api.entity.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();

    User createUser(User user);

    User getUserById(Long id);

    User updateUser(Long id, User user);

    void deleteUserById(Long id);
}
