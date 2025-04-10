package com.example.ms_boleta.controller;

import com.example.ms_boleta.entity.Boleta;
import com.example.ms_boleta.service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boletas")
public class BoletaController {

    @Autowired
    private BoletaService boletaService;

    @PostMapping
    public ResponseEntity<Boleta> crearBoleta(@RequestBody Boleta boleta) {
        Boleta nuevaBoleta = boletaService.guardarBoleta(boleta);
        return ResponseEntity.status(201).body(nuevaBoleta);
    }

    @GetMapping
    public ResponseEntity<List<Boleta>> obtenerBoletas() {
        List<Boleta> boletas = boletaService.obtenerTodasLasBoletas();
        return ResponseEntity.ok(boletas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Boleta> obtenerBoletaPorId(@PathVariable Long id) {
        Boleta boleta = boletaService.obtenerBoletaPorId(id);
        if (boleta != null) {
            return ResponseEntity.ok(boleta);
        }
        return ResponseEntity.notFound().build();
    }
}
