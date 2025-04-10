package com.example.ms_boleta.controller;

import com.example.ms_boleta.entity.Producto1;
import com.example.ms_boleta.service.Producto1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos1")
public class Producto1Controller {

    @Autowired
    private Producto1Service producto1Service;

    @PostMapping
    public Producto1 crearProducto(@RequestBody Producto1 producto1) {
        return producto1Service.crearProducto(producto1);
    }

    @GetMapping("/{id}")
    public Producto1 obtenerProducto(@PathVariable Long id) {
        return producto1Service.obtenerProducto(id);
    }
}
