/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import interfaces.IConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author labcisco
 */
public class ConexionBD implements IConexion{
    
    private String cadenaConexion;
    private String user;
    private String contrasena;
    
    public ConexionBD(String cadenaConexion, String user, String contrasena){
        this.cadenaConexion = cadenaConexion;
        this.user = user;
        this.contrasena = contrasena;
    }
    
    @Override
    public Connection crearConexion() throws SQLException {
        Connection c =DriverManager.getConnection(cadenaConexion,user,contrasena);
        return c;
    }
}
