/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

import excepciones.PersistenciaException;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Martinez
 */
public class PantallaTransferencia extends javax.swing.JFrame {
    
    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USER = "banco";
    private static final String PASSWORD = "12345678";
    
    /**
     * Creates new form PantallaTransferencia
     */
    public PantallaTransferencia() {
        initComponents();
        cargarCuentasClientes();
        
        // Definir un color de fondo (gris azulado oscuro)
        Color grisAzuladoOscuro = new Color(30, 36, 44); // Valores RGB
        // Cambiar el color de fondo del formulario
        getContentPane().setBackground(grisAzuladoOscuro);
        
        
        // Agregar un FocusListener al campo txtMonto
        txtMonto.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "Monto", borrarlo
                if (txtMonto.getText().equals("Monto")) {
                    txtMonto.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Monto"
                if (txtMonto.getText().isEmpty()) {
                    txtMonto.setText("Monto");
                }
            }
        });
        
        // Agregar un FocusListener al campo txtDestino
        txtDestino.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "Cuenta Destino", borrarlo
                if (txtDestino.getText().equals("Cuenta Destino")) {
                    txtDestino.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Cuenta Destino"
                if (txtDestino.getText().isEmpty()) {
                    txtDestino.setText("Cuenta Destino");
                }
            }
        });
    }
    
    private void cargarCuentasClientes() {
        cmbCuentasOrigen.removeAllItems(); // Limpiar el JComboBox antes de cargar las cuentas
        
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "SELECT numCuenta FROM cuenta";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    cmbCuentasOrigen.addItem(resultSet.getString("numCuenta"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar las cuentas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void realizarTransferencia(String cuentaOrigen, double monto, String cuentaDestino) {
    Connection connection = null; // Declaración de la variable connection fuera del bloque try
    
    try {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        connection.setAutoCommit(false);
        
        // Deducción del monto de la cuenta de origen
        String sqlDeducir = "UPDATE cuenta SET saldo = saldo - ? WHERE numCuenta = ?";
        try (PreparedStatement statementDeducir = connection.prepareStatement(sqlDeducir)) {
            statementDeducir.setDouble(1, monto);
            statementDeducir.setString(2, cuentaOrigen);
            int filasActualizadas = statementDeducir.executeUpdate();
            if (filasActualizadas != 1) {
                throw new SQLException("No se pudo deducir el monto de la cuenta de origen.");
            }
        }
        
        // Agregar el monto a la cuenta destino
        String sqlAgregar = "UPDATE cuenta SET saldo = saldo + ? WHERE numCuenta = ?";
        try (PreparedStatement statementAgregar = connection.prepareStatement(sqlAgregar)) {
            statementAgregar.setDouble(1, monto);
            statementAgregar.setString(2, cuentaDestino);
            int filasActualizadas = statementAgregar.executeUpdate();
            if (filasActualizadas != 1) {
                throw new SQLException("No se pudo agregar el monto a la cuenta destino.");
            }
        }
        
        connection.commit();
        JOptionPane.showMessageDialog(this, "Transferencia realizada con éxito.");
    } catch (SQLException e) {
        if (connection != null) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(this, "Error al realizar la transferencia: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Cerramos la conexión en el bloque finally para asegurarnos de que se cierre incluso en caso de excepción
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}


    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbCuentasOrigen = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbCuentasOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cuenta de Origen");

        txtMonto.setText("Monto");

        txtDestino.setText("Cuenta Destino");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCuentasOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCuentasOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String cuentaOrigen = cmbCuentasOrigen.getSelectedItem().toString();
    double monto = Double.parseDouble(txtMonto.getText());
    String cuentaDestino = txtDestino.getText();
    
    if (verificarCuentaExistente(cuentaDestino)) {
        // Realizar la transferencia
        realizarTransferencia(cuentaOrigen, monto, cuentaDestino);
    } else {
        JOptionPane.showMessageDialog(this, "La cuenta destino no existe.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private boolean verificarCuentaExistente(String numCuenta) {
    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
        String sql = "SELECT COUNT(*) AS cuenta_existe FROM cuenta WHERE numCuenta = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, numCuenta);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int cuentaExiste = resultSet.getInt("cuenta_existe");
                return cuentaExiste > 0;
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al verificar la cuenta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return false;
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cmbCuentasOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables

    
}
