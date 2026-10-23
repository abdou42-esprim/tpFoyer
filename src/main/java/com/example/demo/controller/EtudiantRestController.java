package com.example.demo.controller;

import com.example.demo.entities.Etudiant;
import com.example.demo.service.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {

    IEtudiantService etudiantService;

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etId) {
        return etudiantService.retrieveEtudiant(etId);
    }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etId) {
        etudiantService.removeEtudiant(etId);
    }

    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        return etudiantService.modifyEtudiant(e);
    }

    @GetMapping("/by-dates")
    public List<Etudiant> getByDates(
            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date start,
            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date end) {
        return etudiantService.getEtudiantsByDateNaissanceBetween(start, end);
    }
}