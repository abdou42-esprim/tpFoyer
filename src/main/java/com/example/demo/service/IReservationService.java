package com.example.demo.service;

import com.example.demo.entities.Reservation;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation retrieveReservation(String idReservation);
    Reservation addReservation(Reservation r);
    void removeReservation(String idReservation);
    Reservation modifyReservation(Reservation r);
}