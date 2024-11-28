package com.example.empleados.service;

import com.example.empleados.model.Empleado;
import com.example.empleados.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public void delete(Long id) {
        empleadoRepository.deleteById(id);
    }

    public Empleado update(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}
