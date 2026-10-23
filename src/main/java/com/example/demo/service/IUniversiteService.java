package com.example.demo.service;

import com.example.demo.entities.Universite;
import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite retrieveUniversite(Long idUniversite);
    Universite addUniversite(Universite u);
    void removeUniversite(Long idUniversite);
    Universite modifyUniversite(Universite u);
}