package com.example.empleados.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double salarioBase;

    @OneToMany(mappedBy = "cargo")
    private List<Empleado> empleados;

    // Getters y Setters
    // Constructor
    public Cargo() {}

    public Cargo(String nombre, Double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

}
