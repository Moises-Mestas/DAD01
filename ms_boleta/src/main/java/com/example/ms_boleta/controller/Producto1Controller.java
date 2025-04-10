package com.example.ms_boleta.controller;

import com.example.ms_boleta.entity.Producto1;
import com.example.ms_boleta.service.Producto1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/productos1")
public class Producto1Controller {

    @Autowired
    private Producto1Service producto1Service;

    @PostMapping
    public ResponseEntity<Producto1> crearProducto(@RequestBody Producto1 producto) {
        Producto1 nuevoProducto = producto1Service.guardarProducto(producto);
        return ResponseEntity.status(201).body(nuevoProducto);
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<Producto1> obtenerProductoPorNombre(@PathVariable String nombre) {
        Optional<Producto1> producto = producto1Service.obtenerProductoPorNombre(nombre);
        return producto.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<Iterable<Producto1>> obtenerTodosLosProductos() {
        Iterable<Producto1> productos = producto1Service.obtenerTodosLosProductos();
        return ResponseEntity.ok(productos);
    }
}
