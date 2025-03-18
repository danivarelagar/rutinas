package com.turutinapp.rutinasapi.service;

import com.turutinapp.rutinasapi.models.Rutina;
import com.turutinapp.rutinasapi.repository.RutinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RutinaService {

    private final RutinaRepository rutinaRepository;

    @Autowired
    public RutinaService(RutinaRepository rutinaRepository) {
        this.rutinaRepository = rutinaRepository;
    }

    public List<Rutina> getAllRutinas() {
        return rutinaRepository.findAll();
    }

    public Optional<Rutina> getRutinaById(Long id) {
        return rutinaRepository.findById(id);
    }

    public Rutina saveRutina(Rutina rutina) {
        return rutinaRepository.save(rutina);
    }

    public void deleteRutina(Long id) {
        rutinaRepository.deleteById(id);
    }
}
