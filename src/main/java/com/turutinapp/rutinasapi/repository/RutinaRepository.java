package com.turutinapp.rutinasapi.repository;

import com.turutinapp.rutinasapi.models.Rutina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RutinaRepository extends JpaRepository<Rutina, Long> {
}
