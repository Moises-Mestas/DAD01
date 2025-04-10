package com.example.ms_boleta.controller;

import com.example.ms_boleta.entity.Boleta;
import com.example.ms_boleta.service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boletas")
public class BoletaController {

    @Autowired
    private BoletaService boletaService;

    @PostMapping
    public Boleta crearBoleta(@RequestBody Boleta boleta) {
        return boletaService.crearBoleta(boleta);
    }

    @GetMapping("/{id}")
    public Boleta obtenerBoleta(@PathVariable Long id) {
        return boletaService.obtenerBoleta(id);
    }
}
