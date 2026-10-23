package com.example.demo.service;

import com.example.demo.entities.Foyer;
import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer retrieveFoyer(Long idFoyer);
    Foyer addFoyer(Foyer f);
    void removeFoyer(Long idFoyer);
    Foyer modifyFoyer(Foyer f);
}