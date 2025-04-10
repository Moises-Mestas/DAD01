package com.example.ms_boleta.service.impl;

import com.example.ms_boleta.entity.Producto1;
import com.example.ms_boleta.repository.Producto1Repository;
import com.example.ms_boleta.service.Producto1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producto1ServiceImpl implements Producto1Service {

    @Autowired
    private Producto1Repository producto1Repository;

    @Override
    public Producto1 crearProducto(Producto1 producto1) {
        return producto1Repository.save(producto1);
    }

    @Override
    public Producto1 obtenerProducto(Long id) {
        return producto1Repository.findById(id).orElse(null);
    }
}
