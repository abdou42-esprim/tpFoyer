package com.example.demo.service;

import com.example.demo.entities.Bloc;
import com.example.demo.repositories.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {

    BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}