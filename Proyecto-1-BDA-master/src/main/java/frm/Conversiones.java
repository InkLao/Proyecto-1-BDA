/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Martinez
 */
public class Conversiones {
    public List<List<Object>> obtenerCuentasCliente(String idCliente) {
        List<List<Object>> cuentas = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "root", "41502Mar")) {
            String sql = "SELECT * FROM cuenta WHERE idCliente = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, idCliente);
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        List<Object> cuenta = new ArrayList<>();
                        cuenta.add(resultSet.getLong("numCuenta"));
                        cuenta.add(resultSet.getDouble("saldo"));
                        cuentas.add(cuenta);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar las cuentas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cuentas;
    }
    
    public String obtenerNombreCliente(String idCliente) {
        String nombreCliente = null;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "root", "41502Mar")) {
            String sql = "SELECT nombre FROM clientes WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, idCliente);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        nombreCliente = resultSet.getString("nombre");
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el nombre del cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return nombreCliente;
    }
}