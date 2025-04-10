package com.example.ms_boleta.service;

import com.example.ms_boleta.entity.Boleta;

import java.util.List;

public interface BoletaService {
    Boleta crearBoleta(Boleta boleta);
    Boleta obtenerBoleta(Long id);

    List<Boleta> obtenerTodasBoletas();
}
