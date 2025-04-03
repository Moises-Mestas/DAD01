package com.example.ms_catalogo.util;

import com.example.ms_catalogo.entity.Producto;
import com.example.ms_catalogo.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ProductoSeeder implements CommandLineRunner {

    private final ProductoRepository productoRepository;

    public ProductoSeeder(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public void run(String... args) {
        productoRepository.save(new Producto(null, "Laptop Dell XPS 13", "LAPXPS13", LocalDate.of(2024, 4, 1), 1L));
        productoRepository.save(new Producto(null, "Smartphone Samsung S24", "SMS24", LocalDate.of(2024, 3, 1), 1L));
        productoRepository.save(new Producto(null, "Televisor LG 55 OLED", "TVLG55OLED", LocalDate.of(2024, 2, 1), 2L));
        productoRepository.save(new Producto(null, "Auriculares Sony WH-1000XM5", "SONYWH1000", LocalDate.of(2024, 1, 15), 3L));
        productoRepository.save(new Producto(null, "Mouse Logitech MX Master 3", "LOGMXM3", LocalDate.of(2023, 12, 20), 4L));
        productoRepository.save(new Producto(null, "Teclado Mecánico Razer", "RAZKB", LocalDate.of(2023, 11, 10), 4L));
        productoRepository.save(new Producto(null, "Monitor Samsung Curvo 34\"", "SAMSUNG34C", LocalDate.of(2023, 10, 25), 2L));
        productoRepository.save(new Producto(null, "Tablet iPad Pro 12.9\"", "IPADPRO12", LocalDate.of(2023, 9, 18), 1L));
        productoRepository.save(new Producto(null, "Cámara Canon EOS R50", "CANEOSR50", LocalDate.of(2023, 8, 5), 5L));
        productoRepository.save(new Producto(null, "Impresora HP LaserJet Pro", "HPLJP", LocalDate.of(2023, 7, 22), 6L));
        productoRepository.save(new Producto(null, "Disco SSD Samsung 2TB", "SAMSSD2TB", LocalDate.of(2023, 6, 15), 7L));
        productoRepository.save(new Producto(null, "Router Wi-Fi 6 TP-Link", "TPLWIFI6", LocalDate.of(2023, 5, 30), 8L));
        productoRepository.save(new Producto(null, "Altavoz Bluetooth JBL Flip 6", "JBLFLIP6", LocalDate.of(2023, 4, 14), 3L));
        productoRepository.save(new Producto(null, "Smartwatch Apple Watch 9", "APPWATCH9", LocalDate.of(2023, 3, 9), 1L));
        productoRepository.save(new Producto(null, "Proyector Epson 4K", "EPS4K", LocalDate.of(2023, 2, 27), 2L));
    }
}
