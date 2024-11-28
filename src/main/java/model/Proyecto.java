package com.empleados.proyecto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToMany(mappedBy = "proyectos")
    private List<Empleado> empleados;


    public Proyecto() {}

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }
