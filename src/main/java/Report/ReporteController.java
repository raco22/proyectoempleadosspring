package com.empleados.proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@RestController
@RequestMapping("/reportes")
public class ReporteController {

    @GetMapping("/empleados")
    public String generarReporte() throws IOException {
        File archivo = new File("reporte_empleados.txt");
        FileWriter writer = new FileWriter(archivo);
        writer.write("Reporte de Empleados\n");
        writer.write("ID, Nombre, Apellido, Cargo, Salario\n");
        // Aquí deberías obtener la lista de empleados desde el servicio y escribirla en el archivo
        // Por simplicidad, se omite la implementación de la obtención de datos
        writer.close();
        return "Reporte generado: " + archivo.getAbsolutePath();
    }
}
