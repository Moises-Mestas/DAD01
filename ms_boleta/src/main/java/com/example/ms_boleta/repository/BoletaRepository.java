package com.example.ms_boleta.repository;

import com.example.ms_boleta.entity.Boleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoletaRepository extends JpaRepository<Boleta, Long> {
}
