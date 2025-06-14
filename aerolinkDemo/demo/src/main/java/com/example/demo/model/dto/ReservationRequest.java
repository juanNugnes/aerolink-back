package com.example.demo.model.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class ReservationRequest {
    @NotBlank
    private String flightNumber;

    @NotBlank
    private String passengerId;

    @NotBlank
    private String seat;

    @NotNull
    @Future
    private LocalDateTime reservationDate;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerName(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }
}
