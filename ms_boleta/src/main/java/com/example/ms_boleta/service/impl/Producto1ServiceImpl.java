package com.example.ms_boleta.service.impl;

import com.example.ms_boleta.entity.Producto1;
import com.example.ms_boleta.repository.Producto1Repository;
import com.example.ms_boleta.service.Producto1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Producto1ServiceImpl implements Producto1Service {

    @Autowired
    private Producto1Repository producto1Repository;

    @Override
    public Producto1 guardarProducto(Producto1 producto) {
        return producto1Repository.save(producto);
    }

    @Override
    public Optional<Producto1> obtenerProductoPorNombre(String nombre) {
        return producto1Repository.findByNombre(nombre);
    }

    @Override
    public Iterable<Producto1> obtenerTodosLosProductos() {
        return producto1Repository.findAll();
    }
}
