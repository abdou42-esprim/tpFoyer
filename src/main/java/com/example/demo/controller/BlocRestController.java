package com.example.demo.controller;

import com.example.demo.entities.Bloc;
import com.example.demo.service.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {

    IBlocService blocService;

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        return blocService.retrieveBlocs();
    }

    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long bId) {
        return blocService.retrieveBloc(bId);
    }

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBloc(b);
    }

    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long bId) {
        blocService.removeBloc(bId);
    }

    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        return blocService.modifyBloc(b);
    }
}