package com.example.demo.service;
import com.example.demo.entities.Chambre;
import java.util.List;
public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre retrieveChambre(Long ChambreId);
    Chambre addChambre(Chambre c);
    void removeChambre(Long ChambreId);
    Chambre modifyChambre(Chambre chambre);
}
