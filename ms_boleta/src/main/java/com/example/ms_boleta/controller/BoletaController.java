package com.example.ms_boleta.controller;

import com.example.ms_boleta.entity.Boleta;
import com.example.ms_boleta.service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boletas")
public class BoletaController {

    @Autowired
    private BoletaService boletaService;

    // Crear boleta
    @PostMapping
    public Boleta crearBoleta(@RequestBody Boleta boleta) {
        return boletaService.crearBoleta(boleta);
    }

    // Obtener boleta por ID
    @GetMapping("/{id}")
    public Boleta obtenerBoleta(@PathVariable Long id) {
        return boletaService.obtenerBoleta(id);
    }

    // Obtener todas las boletas
    @GetMapping
    public List<Boleta> obtenerTodasBoletas() {
        return boletaService.obtenerTodasBoletas();
    }
}
