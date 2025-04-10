package com.example.ms_boleta.service.impl;

import com.example.ms_boleta.entity.Boleta;
import com.example.ms_boleta.repository.BoletaRepository;
import com.example.ms_boleta.service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletaServiceImpl implements BoletaService {

    @Autowired
    private BoletaRepository boletaRepository;

    @Override
    public Boleta crearBoleta(Boleta boleta) {
        return boletaRepository.save(boleta);
    }

    @Override
    public Boleta obtenerBoleta(Long id) {
        return boletaRepository.findById(id).orElse(null);
    }
}
