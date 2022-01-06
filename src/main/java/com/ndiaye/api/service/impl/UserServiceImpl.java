package com.ndiaye.api.service.impl;

import com.ndiaye.api.dto.CreateUserDto;
import com.ndiaye.api.dto.UpdateUserDto;
import com.ndiaye.api.entity.User;
import com.ndiaye.api.exception.ForbiddenEmailException;
import com.ndiaye.api.exception.UserAlreadyExistsException;
import com.ndiaye.api.exception.UserNotFoundException;
import com.ndiaye.api.repository.IUserRepository;
import com.ndiaye.api.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    private final static String USER_NOT_FOUND_MSG = "User not found";
    private final static String USER_ALREADY_EXISTS_MSG = "User already exists for given email";
    private final static String FORBIDDEN_EMAIL_MSG = "Email is forbidden";
    private final static String FORBIDDEN_EMAIL = "mon.email@gmail.com";

    private IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(CreateUserDto user) {
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            throw new UserAlreadyExistsException(USER_ALREADY_EXISTS_MSG + " : " + user.getEmail());
        }
        if (user.getEmail().equals(FORBIDDEN_EMAIL)) {
            throw new ForbiddenEmailException(FORBIDDEN_EMAIL_MSG + " : " + user.getEmail());
        }
        User newUser = new User();
        newUser.setFirstname(user.getFirstname());
        newUser.setLastname(user.getLastname());
        newUser.setEmail(user.getEmail());
        newUser.setAddress(user.getAddress());
        newUser.setZipCode(user.getZipCode());
        newUser.setCountry(user.getCountry());
        newUser.setAge(user.getAge());
        return userRepository.save(newUser);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(
                        () -> new UserNotFoundException(USER_NOT_FOUND_MSG + " : " + id)
                );
    }

    @Override
    public User updateUser(Long id, UpdateUserDto newUser) {
        User retrievedUser = userRepository.findById(id)
                .orElseThrow(
                        () -> new UserNotFoundException(USER_NOT_FOUND_MSG + " : " + id)
                );
        retrievedUser.setAddress(newUser.getAddress());
        retrievedUser.setZipCode(newUser.getZipCode());
        retrievedUser.setCountry(newUser.getCountry());
        return userRepository.save(retrievedUser);
    }

    @Override
    public void deleteUserById(Long id) {
        User retrievedUser = userRepository.findById(id)
                .orElseThrow(
                        () -> new UserNotFoundException(USER_NOT_FOUND_MSG + " : " + id)
                );
        userRepository.delete(retrievedUser);
    }
}
