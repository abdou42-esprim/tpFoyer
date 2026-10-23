package com.example.demo.service;

import com.example.demo.entities.Bloc;
import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveBlocs();
    Bloc retrieveBloc(Long idBloc);
    Bloc addBloc(Bloc b);
    void removeBloc(Long idBloc);
    Bloc modifyBloc(Bloc bloc);
}