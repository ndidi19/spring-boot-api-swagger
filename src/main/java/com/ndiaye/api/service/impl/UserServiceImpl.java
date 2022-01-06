package com.ndiaye.api.service.impl;

import com.ndiaye.api.dto.CreateUserDto;
import com.ndiaye.api.entity.User;
import com.ndiaye.api.exception.UserNotFoundException;
import com.ndiaye.api.repository.IUserRepository;
import com.ndiaye.api.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

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
                        () -> new UserNotFoundException("User not found for id : " + id)
                );
    }

    @Override
    public User updateUser(Long id, User newUser) {
        User retrievedUser = userRepository.getById(id);
        retrievedUser.setFirstname(newUser.getFirstname());
        return userRepository.save(retrievedUser);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
