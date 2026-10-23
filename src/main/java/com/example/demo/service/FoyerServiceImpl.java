package com.example.demo.service;

import com.example.demo.entities.Foyer;
import com.example.demo.repositories.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {

    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer modifyFoyer(Foyer f) {
        return foyerRepository.save(f);
    }
}
