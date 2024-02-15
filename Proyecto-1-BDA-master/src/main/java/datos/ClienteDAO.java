/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import excepciones.PersistenciaException;
import interfaces.ICliente;
import interfaces.IConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import objetos.Cliente;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author labcisco
 */
public class ClienteDAO implements ICliente {
    
    private final IConexion conexion;
    private static final Logger LOG = Logger.getLogger(ClienteDAO.class.getName());
    
    public ClienteDAO(IConexion conexion){
        this.conexion = conexion;
    }
    
    @Override
    public Cliente registrarCliente(Cliente cliente) throws PersistenciaException {
        String crearCliente= "INSERT INTO cliente (nombre, apellidoPaterno, apellidoMaterno, domicilio, fechaNacimiento) VALUES (?,?,?,?,?)";
        
        Cliente resultado = null;
        
        try{
            Connection c = conexion.crearConexion();
            PreparedStatement insert = c.prepareStatement(crearCliente, PreparedStatement.RETURN_GENERATED_KEYS);
            insert.setString(1, cliente.getNombre());
            insert.setString(2, cliente.getApellidoPaterno());
            insert.setString(3, cliente.getApellidoMaterno());
            insert.setString(4, cliente.getDomicilio());
            insert.setDate(5, cliente.getFechaNacimiento());
            insert.executeUpdate();
            
            ResultSet res= insert.getGeneratedKeys();
            
            if(res.next()){
                Integer idResultado = res.getInt(Statement.RETURN_GENERATED_KEYS);
                resultado =  new Cliente(idResultado, res.getString("nombre"), res.getString("apellidoPaterno"), res.getString("apellidoMaterno"), res.getString("domicilio"), res.getDate("fechaNacimiento"));
                return resultado;
            }
        }catch(SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible agregar el cliente" + e.getMessage());
        }
        return resultado;
    }
}
