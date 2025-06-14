package com.example.demo.controller;

import com.example.demo.model.dto.UserRequest;
import com.example.demo.model.UserEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<UserEntity> getAll() {
        return userService.findAll();
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody UserRequest dto) {
        userService.register(dto);
        return ResponseEntity.ok().build();
    }
}
