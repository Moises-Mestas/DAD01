package com.example.ms_ventas.util;

import com.example.ms_ventas.entity.Venta;
import com.example.ms_ventas.repository.VentaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class VentaSeeder implements CommandLineRunner {

    private final VentaRepository ventaRepository;

    public VentaSeeder(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Verificamos si ya existen datos para no duplicar
        if (ventaRepository.count() == 0) {
            Venta venta1 = new Venta();
            venta1.setProducto("Producto A");
            venta1.setCantidad(10);
            venta1.setPrecio(100.0);
            venta1.setCliente("Cliente A");
            venta1.setFecha("2025-04-02");

            Venta venta2 = new Venta();
            venta2.setProducto("Producto B");
            venta2.setCantidad(5);
            venta2.setPrecio(150.0);
            venta2.setCliente("Cliente B");
            venta2.setFecha("2025-04-03");

            Venta venta3 = new Venta();
            venta3.setProducto("Producto C");
            venta3.setCantidad(3);
            venta3.setPrecio(200.0);
            venta3.setCliente("Cliente C");
            venta3.setFecha("2025-04-04");

            Venta venta4 = new Venta();
            venta4.setProducto("Producto D");
            venta4.setCantidad(15);
            venta4.setPrecio(50.0);
            venta4.setCliente("Cliente D");
            venta4.setFecha("2025-04-05");

            Venta venta5 = new Venta();
            venta5.setProducto("Producto E");
            venta5.setCantidad(7);
            venta5.setPrecio(300.0);
            venta5.setCliente("Cliente E");
            venta5.setFecha("2025-04-06");

            // Guardar los datos en la base de datos
            ventaRepository.save(venta1);
            ventaRepository.save(venta2);
            ventaRepository.save(venta3);
            ventaRepository.save(venta4);
            ventaRepository.save(venta5);

            System.out.println("Datos de ventas insertados correctamente.");
        } else {
            System.out.println("Las ventas ya existen, no se insertaron datos.");
        }
    }
}
