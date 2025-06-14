package com.example.demo.service;

import com.example.demo.model.dto.UserRequest;
import com.example.demo.model.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity register(UserRequest userRequest) {
        UserEntity user = new UserEntity();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        return userRepository.save(user);
    }

}
