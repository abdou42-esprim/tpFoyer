package com.example.demo.service;

import com.example.demo.entities.Etudiant;
import java.util.Date;
import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant retrieveEtudiant(Long idEtudiant);
    List<Etudiant> addEtudiants(List<Etudiant> etudiants);
    Etudiant addEtudiant(Etudiant e);
    void removeEtudiant(Long idEtudiant);
    Etudiant modifyEtudiant(Etudiant e);
    List<Etudiant> getEtudiantsByDateNaissanceBetween(Date startDate, Date endDate);
}