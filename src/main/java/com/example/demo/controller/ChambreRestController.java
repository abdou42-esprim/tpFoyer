package com.example.demo.controller;

import com.example.demo.entities.Chambre;
import com.example.demo.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {

    IChambreService chambreService;

    // http://localhost:8081/tpfoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        return chambreService.retrieveAllChambres();
    }

    // http://localhost:8081/tpfoyer/chambre/retrieve-chambre/1
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        return chambreService.retrieveChambre(chId);
    }

    // http://localhost:8081/tpfoyer/chambre/add-chambre
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    // http://localhost:8081/tpfoyer/chambre/remove-chambre/1
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }

    // http://localhost:8081/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        return chambreService.modifyChambre(c);
    }
}