package com.example.demo.service;

import com.example.demo.entities.Universite;
import com.example.demo.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {

    UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite modifyUniversite(Universite u) {
        return universiteRepository.save(u);
    }
}