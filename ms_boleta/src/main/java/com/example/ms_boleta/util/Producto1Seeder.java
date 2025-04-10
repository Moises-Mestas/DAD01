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
        // Producto 1
        Producto1 producto1 = new Producto1();
        producto1.setIdProducto(1L);
        producto1.setNombre("Producto A");
        producto1.setCategoria("Categoría 1");
        producto1.setDescripcion("Descripción detallada del Producto A");
        producto1.setPrecio(99.99);
        producto1Repository.save(producto1);

        // Producto 2
        Producto1 producto2 = new Producto1();
        producto2.setIdProducto(2L);
        producto2.setNombre("Producto B");
        producto2.setCategoria("Categoría 2");
        producto2.setDescripcion("Descripción detallada del Producto B");
        producto2.setPrecio(149.99);
        producto1Repository.save(producto2);

        // Producto 3
        Producto1 producto3 = new Producto1();
        producto3.setIdProducto(3L);
        producto3.setNombre("Producto C");
        producto3.setCategoria("Categoría 3");
        producto3.setDescripcion("Descripción detallada del Producto C");
        producto3.setPrecio(200.00);
        producto1Repository.save(producto3);

        // Producto 4
        Producto1 producto4 = new Producto1();
        producto4.setIdProducto(4L);
        producto4.setNombre("Producto D");
        producto4.setCategoria("Categoría 4");
        producto4.setDescripcion("Descripción detallada del Producto D");
        producto4.setPrecio(350.75);
        producto1Repository.save(producto4);

        // Producto 5
        Producto1 producto5 = new Producto1();
        producto5.setIdProducto(5L);
        producto5.setNombre("Producto E");
        producto5.setCategoria("Categoría 5");
        producto5.setDescripcion("Descripción detallada del Producto E");
        producto5.setPrecio(75.50);
        producto1Repository.save(producto5);
    }
}
