package com.example.ms_boleta.util;

import com.example.ms_boleta.entity.Boleta;
import com.example.ms_boleta.entity.Producto1;
import com.example.ms_boleta.repository.BoletaRepository;
import com.example.ms_boleta.repository.Producto1Repository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BoletaSeeder {

    @Autowired
    private BoletaRepository boletaRepository;

    @Autowired
    private Producto1Repository producto1Repository;

    @PostConstruct
    public void seed() {
        // Producto 1
        Producto1 producto1 = producto1Repository.findById(1L).orElse(null);
        Producto1 producto2 = producto1Repository.findById(2L).orElse(null);
        Producto1 producto3 = producto1Repository.findById(3L).orElse(null);

        // Boleta 1
        Boleta boleta1 = new Boleta();
        boleta1.setIdBoleta(1L);
        boleta1.setProducto1(producto1);  // Relación con Producto1
        boleta1.setFechaCreacion("2025-04-01");
        boletaRepository.save(boleta1);

        // Boleta 2
        Boleta boleta2 = new Boleta();
        boleta2.setIdBoleta(2L);
        boleta2.setProducto1(producto2);  // Relación con Producto2
        boleta2.setFechaCreacion("2025-04-02");
        boletaRepository.save(boleta2);

        // Boleta 3
        Boleta boleta3 = new Boleta();
        boleta3.setIdBoleta(3L);
        boleta3.setProducto1(producto3);  // Relación con Producto3
        boleta3.setFechaCreacion("2025-04-03");
        boletaRepository.save(boleta3);

        // Boleta 4
        Boleta boleta4 = new Boleta();
        boleta4.setIdBoleta(4L);
        boleta4.setProducto1(producto1);  // Relación con Producto1
        boleta4.setFechaCreacion("2025-04-04");
        boletaRepository.save(boleta4);

        // Boleta 5
        Boleta boleta5 = new Boleta();
        boleta5.setIdBoleta(5L);
        boleta5.setProducto1(producto2);  // Relación con Producto2
        boleta5.setFechaCreacion("2025-04-05");
        boletaRepository.save(boleta5);
    }
}
