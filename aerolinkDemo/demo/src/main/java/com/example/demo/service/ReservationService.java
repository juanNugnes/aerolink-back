package com.example.demo.service;

import com.example.demo.model.ReservationEntity;
import com.example.demo.model.UserEntity;
import com.example.demo.model.dto.ReservationRequest;
import com.example.demo.repository.ReservationRepository;
import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReservationService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ReservationRepository reservationRepository;

    public ReservationEntity createReservation(ReservationRequest request) {

        UserEntity passenger = userRepository.findById(Long.valueOf(request.getPassengerId()))
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        ReservationEntity reservation = ReservationEntity.builder()
                .flightNumber(request.getFlightNumber())
                .passenger(passenger)
                .seat(request.getSeat())
                .reservationDate(request.getReservationDate())
                .build();

        return reservationRepository.save(reservation);
    }

    public List<ReservationEntity> getAllReservations() {
        return reservationRepository.findAll();
    }
}
