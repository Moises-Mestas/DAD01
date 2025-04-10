package com.example.ms_boleta.service.impl;

import com.example.ms_boleta.entity.Boleta;
import com.example.ms_boleta.repository.BoletaRepository;
import com.example.ms_boleta.service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletaServiceImpl implements BoletaService {

    @Autowired
    private BoletaRepository boletaRepository;

    @Override
    public Boleta guardarBoleta(Boleta boleta) {
        return boletaRepository.save(boleta);
    }

    @Override
    public List<Boleta> obtenerTodasLasBoletas() {
        return boletaRepository.findAll();
    }

    @Override
    public Boleta obtenerBoletaPorId(Long id) {
        return boletaRepository.findById(id).orElse(null);
    }
}
