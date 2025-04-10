package com.example.ms_boleta.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Boleta {
    @Id
    private Long idBoleta;

    @ManyToOne
    private Producto1 producto1;  // Relación con Producto1

    private String fechaCreacion;

    public Boleta() {

    }

    public Long getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(Long idBoleta) {
        this.idBoleta = idBoleta;
    }

    public Producto1 getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto1 producto1) {
        this.producto1 = producto1;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boleta(Long idBoleta, Producto1 producto1, String fechaCreacion) {
        this.idBoleta = idBoleta;
        this.producto1 = producto1;
        this.fechaCreacion = fechaCreacion;

    }

    @Override
    public String toString() {
        return "Boleta{" +
                "idBoleta=" + idBoleta +
                ", producto1=" + producto1 +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                '}';
    }

}
