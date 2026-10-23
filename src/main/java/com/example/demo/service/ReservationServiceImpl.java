package com.example.demo.service;

import com.example.demo.entities.Reservation;
import com.example.demo.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public void removeReservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    @Override
    public Reservation modifyReservation(Reservation r) {
        return reservationRepository.save(r);
    }
}