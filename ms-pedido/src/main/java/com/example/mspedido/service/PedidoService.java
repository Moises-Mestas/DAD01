package com.example.mspedido.service;

import com.example.mspedido.entity.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {
    List<Pedido> listar();

    Optional<Pedido> listarPorId(Integer id);

    Pedido guardar(Pedido pedido);

    Pedido actualizar(Pedido pedido);

    void eliminar(Integer id);
}
