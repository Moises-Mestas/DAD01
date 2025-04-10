package com.example.ms_boleta.service;

import com.example.ms_boleta.entity.Producto1;

import java.util.List;

public interface Producto1Service {
    Producto1 crearProducto(Producto1 producto1);
    Producto1 obtenerProducto(Long id);

    List<Producto1> obtenerTodosProductos();
}
