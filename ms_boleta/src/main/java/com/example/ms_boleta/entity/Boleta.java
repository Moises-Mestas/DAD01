package com.example.ms_boleta.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Data
public class Boleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String numero;

    private String cliente;

    private String fecha;

    private Double total;

    public Boleta() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boleta(Long id, String numero, String cliente, String fecha, Double total) {
        this.id = id;
        this.numero = numero;
        this.cliente = cliente;
        this.fecha = fecha;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", cliente='" + cliente + '\'' +
                ", fecha='" + fecha + '\'' +
                ", total=" + total +
                '}';
    }
}
