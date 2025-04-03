package com.example.ms_catalogo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity

@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String codigo;
    private LocalDate fechaCreacion;
    private Long categoriaId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Producto(Long id, String nombre, String codigo, LocalDate fechaCreacion, Long categoriaId) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
        this.categoriaId = categoriaId;
    }
    public Producto() {
    }
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", categoriaId=" + categoriaId +
                '}';
    }
}
