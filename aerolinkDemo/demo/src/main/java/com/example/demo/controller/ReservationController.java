package com.example.demo.controller;

import com.example.demo.model.ReservationEntity;
import com.example.demo.model.UserEntity;
import com.example.demo.model.dto.ReservationRequest;
import com.example.demo.model.dto.UserRequest;
import com.example.demo.service.ReservationService;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @PostMapping
    public ResponseEntity<ReservationEntity> createReservation(@RequestBody @Valid ReservationRequest request) {
        return ResponseEntity.ok(reservationService.createReservation(request));
    }

    @GetMapping
    public ResponseEntity<List<ReservationEntity>> getAll() {
        return ResponseEntity.ok(reservationService.getAllReservations());
    }
}
