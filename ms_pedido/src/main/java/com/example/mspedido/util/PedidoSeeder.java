package com.example.mspedido.util;

import com.example.mspedido.entity.Pedido;
import com.example.mspedido.repository.PedidoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PedidoSeeder {

    @Autowired
    private PedidoRepository pedidoRepository;

    @PostConstruct
    public void seedData() {
        // Verifica si ya existen datos, para no duplicar registros
        if (pedidoRepository.count() == 0) {
            // Crear pedidos de ejemplo
            Pedido pedido1 = new Pedido();
            pedido1.setSerie("A1");
            pedido1.setNumero("10001");
            pedido1.setDescripcion("Pedido de ejemplo 1");
            pedido1.setClienteId(1);
            pedidoRepository.save(pedido1);

            Pedido pedido2 = new Pedido();
            pedido2.setSerie("B2");
            pedido2.setNumero("10002");
            pedido2.setDescripcion("Pedido de ejemplo 2");
            pedido2.setClienteId(2);
            pedidoRepository.save(pedido2);

            Pedido pedido3 = new Pedido();
            pedido3.setSerie("C3");
            pedido3.setNumero("10003");
            pedido3.setDescripcion("Pedido de ejemplo 3");
            pedido3.setClienteId(3);
            pedidoRepository.save(pedido3);

            // Añadir más pedidos si es necesario
        }
    }
}
