package com.ndiaye.api.controller;

import com.ndiaye.api.dto.CreateUserDto;
import com.ndiaye.api.entity.User;
import com.ndiaye.api.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    User postUser(@Valid @RequestBody CreateUserDto user) {
        return userService.createUser(user);
    }

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/users/{id}")
    User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
}
