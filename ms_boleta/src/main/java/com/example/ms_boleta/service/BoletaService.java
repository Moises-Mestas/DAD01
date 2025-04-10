package com.example.ms_boleta.service;

import com.example.ms_boleta.entity.Boleta;

import java.util.List;

public interface BoletaService {

    Boleta guardarBoleta(Boleta boleta);

    List<Boleta> obtenerTodasLasBoletas();

    Boleta obtenerBoletaPorId(Long id);
}
