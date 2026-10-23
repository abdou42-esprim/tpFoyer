package com.example.demo.service;

import com.example.demo.entities.Etudiant;
import com.example.demo.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {

    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> getEtudiantsByDateNaissanceBetween(Date startDate, Date endDate) {
        return etudiantRepository.findByDateNaissanceBetween(startDate, endDate);
    }
}
