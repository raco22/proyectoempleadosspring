
CREATE TABLE cargos (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    salario_base DECIMAL(10, 2) NOT NULL
);


CREATE TABLE empleados (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    cargo_id INT REFERENCES cargos(id),
    salario DECIMAL(10, 2) NOT NULL
);


CREATE TABLE proyectos (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);


CREATE TABLE empleado_proyecto (
    empleado_id INT REFERENCES empleados(id),
    proyecto_id INT REFERENCES proyectos(id),
    PRIMARY KEY (empleado_id, proyecto_id)
);