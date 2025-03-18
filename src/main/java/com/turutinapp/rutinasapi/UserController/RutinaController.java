package com.turutinapp.rutinasapi.controller;

import com.turutinapp.rutinasapi.models.Rutina;
import com.turutinapp.rutinasapi.service.RutinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rutinas")
public class RutinaController {

    private final RutinaService rutinaService;

    @Autowired
    public RutinaController(RutinaService rutinaService) {
        this.rutinaService = rutinaService;
    }

    @GetMapping
    public List<Rutina> getAllRutinas() {
        return rutinaService.getAllRutinas();
    }

    @GetMapping("/{id}")
    public Optional<Rutina> getRutinaById(@PathVariable Long id) {
        return rutinaService.getRutinaById(id);
    }

    @PostMapping
    public Rutina createRutina(@RequestBody Rutina rutina) {
        return rutinaService.saveRutina(rutina);
    }

    @DeleteMapping("/{id}")
    public void deleteRutina(@PathVariable Long id) {
        rutinaService.deleteRutina(id);
    }
}
