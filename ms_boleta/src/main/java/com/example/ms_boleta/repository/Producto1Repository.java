package com.example.ms_boleta.repository;

import com.example.ms_boleta.entity.Producto1;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface Producto1Repository extends JpaRepository<Producto1, Long> {

    Optional<Producto1> findByNombre(String nombre);
}
