/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobanco;

import datos.ConexionBD;
import excepciones.PersistenciaException;
import interfaces.IConexion;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Conexión con la base de datos Workbench
 *
 * @author eduar
 */
public class proyectoBanco {

    public static void main(String args[]) {

        String cadenaConexion = "jdbc:mysql://localhost:3306/banco";
        String user = "banco";
        String password = "12345678";

        try {
            IConexion baseDatos = new ConexionBD(cadenaConexion, user, password);
            System.out.println("Conexión realizada");
        } catch (Exception e) {
            System.out.println("Hubo un error");
            System.out.println(e.getStackTrace());
        }
    }

}
