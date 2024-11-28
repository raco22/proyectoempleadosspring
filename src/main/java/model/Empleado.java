package com.example.empleados.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;

    @ManyToMany
    @JoinTable(
            name = "empleado_proyecto",
            joinColumns = @JoinColumn(name = "empleado_id"),
            inverseJoinColumns = @JoinColumn(name = "proyecto_id")
    )
    private List<Proyecto> proyectos;


    public Empleado() {}

    public Empleado(String nombre, String apellido, Cargo cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = calcularSalario();
    }

    public Double calcularSalario() return this.cargo.getSalarioBase(); // Asumiendo que el salario se basa en el salario base del cargo
}


}
