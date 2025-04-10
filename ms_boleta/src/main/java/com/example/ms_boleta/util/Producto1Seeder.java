package com.example.ms_boleta.util;

import com.example.ms_boleta.entity.Producto1;
import com.example.ms_boleta.repository.Producto1Repository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Producto1Seeder {

    @Autowired
    private Producto1Repository producto1Repository;

    @PostConstruct
    public void seed() {
        // Insertando algunos productos de ejemplo
        Producto1 producto1 = new Producto1();
        producto1.setNombre("Producto A");
        producto1.setDescripcion("Descripción del Producto A");
        producto1.setPrecio(50.00);
        producto1.setCantidad(100);
        producto1Repository.save(producto1);

        Producto1 producto2 = new Producto1();
        producto2.setNombre("Producto B");
        producto2.setDescripcion("Descripción del Producto B");
        producto2.setPrecio(75.25);
        producto2.setCantidad(150);
        producto1Repository.save(producto2);

        Producto1 producto3 = new Producto1();
        producto3.setNombre("Producto C");
        producto3.setDescripcion("Descripción del Producto C");
        producto3.setPrecio(25.50);
        producto3.setCantidad(200);
        producto1Repository.save(producto3);

        System.out.println("Datos de Producto1 insertados correctamente.");
    }
}
