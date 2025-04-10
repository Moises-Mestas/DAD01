package com.example.ms_boleta.controller;

import com.example.ms_boleta.entity.Producto1;
import com.example.ms_boleta.service.Producto1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos1")
public class Producto1Controller {

    @Autowired
    private Producto1Service producto1Service;

    // Crear producto
    @PostMapping
    public Producto1 crearProducto(@RequestBody Producto1 producto1) {
        return producto1Service.crearProducto(producto1);
    }

    // Obtener producto por ID
    @GetMapping("/{id}")
    public Producto1 obtenerProducto(@PathVariable Long id) {
        return producto1Service.obtenerProducto(id);
    }

    // Obtener todos los productos
    @GetMapping
    public List<Producto1> obtenerTodosProductos() {
        return producto1Service.obtenerTodosProductos();
    }
}
