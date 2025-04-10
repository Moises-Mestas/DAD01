package com.example.ms_boleta.service;

import com.example.ms_boleta.entity.Boleta;

public interface BoletaService {
    Boleta crearBoleta(Boleta boleta);
    Boleta obtenerBoleta(Long id);
}
