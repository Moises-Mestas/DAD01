package com.example.ms_boleta.service;

import com.example.ms_boleta.entity.Producto1;

import java.util.Optional;

public interface Producto1Service {

    Producto1 guardarProducto(Producto1 producto);

    Optional<Producto1> obtenerProductoPorNombre(String nombre);

    Iterable<Producto1> obtenerTodosLosProductos();
}
