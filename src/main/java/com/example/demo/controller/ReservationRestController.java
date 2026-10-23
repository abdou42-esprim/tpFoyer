package com.example.demo.controller;

import com.example.demo.entities.Reservation;
import com.example.demo.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    IReservationService reservationService;

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        return reservationService.retrieveAllReservations();
    }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String resId) {
        return reservationService.retrieveReservation(resId);
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.addReservation(r);
    }

    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String resId) {
        reservationService.removeReservation(resId);
    }

    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation r) {
        return reservationService.modifyReservation(r);
    }
}