package com.example.ms_boleta.util;

import com.example.ms_boleta.entity.Boleta;
import com.example.ms_boleta.repository.BoletaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BoletaSeeder {

    @Autowired
    private BoletaRepository boletaRepository;

    @PostConstruct
    public void seed() {
        // Insertando algunas boletas de ejemplo
        Boleta boleta1 = new Boleta();
        boleta1.setNumero("B001");
        boleta1.setCliente("Juan Pérez");
        boleta1.setFecha("2025-04-09");
        boleta1.setTotal(150.00);
        boletaRepository.save(boleta1);

        Boleta boleta2 = new Boleta();
        boleta2.setNumero("B002");
        boleta2.setCliente("Ana García");
        boleta2.setFecha("2025-04-09");
        boleta2.setTotal(200.50);
        boletaRepository.save(boleta2);

        Boleta boleta3 = new Boleta();
        boleta3.setNumero("B003");
        boleta3.setCliente("Carlos López");
        boleta3.setFecha("2025-04-09");
        boleta3.setTotal(120.75);
        boletaRepository.save(boleta3);

        System.out.println("Datos de Boleta insertados correctamente.");
    }
}
