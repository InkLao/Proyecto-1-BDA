-- Crea la base de datos del banco
CREATE DATABASE banco;
-- Selecciona la base de datos banco
use banco;
-- Crea la tabla cliente
CREATE TABLE cliente (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombres VARCHAR(30) NOT NULL,
    ap_paterno VARCHAR(20) NOT NULL,
    ap_materno VARCHAR(20) NOT NULL,
    fechaNacimiento DATE NOT NULL,
    contraseña VARCHAR(50) NOT NULL
);
-- Crea la tabla direccion
CREATE TABLE direccion (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    calle VARCHAR(50),
    colonia VARCHAR(50),
    codigoPostal VARCHAR(20),
    numeroExterior VARCHAR(20),
    idCliente BIGINT,
    FOREIGN KEY (idCliente) REFERENCES cliente (id)
);
-- Crea la tabla cuenta
CREATE TABLE cuenta (
    numCuenta BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    fechaApertura DATE NOT NULL,
    saldo decimal(15,2) NOT NULL DEFAULT 0.00,
    idCliente BIGINT NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES cliente (id)
);
-- Crea la tabla transaccion
CREATE TABLE transaccion (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    monto decimal(15,2) NOT NULL,
    fechaOperacion DATETIME NOT NULL,
    tipo VARCHAR(50),
    folioOperacion VARCHAR(12),
    contraseñaRetiro VARCHAR(8),
    cuentaOrigen BIGINT,
    cuentaDestino BIGINT,
    FOREIGN KEY (cuentaOrigen) REFERENCES cuenta (numCuenta),
    FOREIGN KEY (cuentaDestino) REFERENCES cuenta (numCuenta)
);

