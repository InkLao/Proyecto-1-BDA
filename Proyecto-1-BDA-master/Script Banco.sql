-- Crea la base de datos del banco
CREATE DATABASE banco;

-- Selecciona la base de datos banco
USE banco;

-- Crear la tabla Cliente
CREATE TABLE Cliente (
    id_cliente INT PRIMARY KEY,
    nombre VARCHAR(50),
    apellidoPaterno VARCHAR(50),
    apellidoMaterno VARCHAR(50),
    domicilio VARCHAR(255),
    fechaNacimiento DATE
);

-- Crear la tabla Cuenta
CREATE TABLE Cuenta (
    numeroCuenta INT PRIMARY KEY,
    fechaApertura DATE,
    saldo INT,
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

-- Crear la tabla Transaccion
CREATE TABLE Transaccion (
    id_transaccion INT PRIMARY KEY,
    tipo VARCHAR(50),
    fechaTransaccion DATE,
    monto INT,
    numero_cuenta_id INT,
    numero_cuenta_destino INT,
    id_cliente INT,
    FOREIGN KEY (numero_cuenta_id) REFERENCES Cuenta(numeroCuenta),
    FOREIGN KEY (numero_cuenta_destino) REFERENCES Cuenta(numeroCuenta),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

