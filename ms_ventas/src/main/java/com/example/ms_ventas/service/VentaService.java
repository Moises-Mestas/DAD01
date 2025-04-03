package com.example.ms_ventas.service;

import com.example.ms_ventas.entity.Venta;

import java.util.List;

public interface VentaService {
    List<Venta> obtenerVentas();    // Método definido en la interfaz

    Venta guardarVenta(Venta venta);  // Método definido en la interfaz
}
