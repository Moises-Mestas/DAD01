package com.example.ms_catalogo.service;

import com.example.ms_catalogo.entity.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listarTodos();
    Producto guardar(Producto producto);
    Optional<Producto> buscarPorId(Long id);
    Producto actualizar(Long id, Producto producto);
    void eliminar(Long id);
}
