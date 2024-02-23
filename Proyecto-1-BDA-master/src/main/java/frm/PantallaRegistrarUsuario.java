package frm;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * 
 * @author eduar
 */
public class PantallaRegistrarUsuario extends javax.swing.JFrame {
    private String idClienteEnSesion;
//    private static final String URL = "jdbc:mysql://localhost:3306/banco";
//    private static final String USER = "banco";
//    private static final String PASSWORD = "12345678";
    
    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USER = "banco";
    private static final String PASSWORD = "12345678";
    /**
     * Creates new form PantallaRegistrarUsuario
     */
    public PantallaRegistrarUsuario(String cliente) {
        initComponents();
         this.idClienteEnSesion = cliente;
        // Definir un color de fondo (gris azulado oscuro)
        Color grisAzuladoOscuro = new Color(30, 36, 44); // Valores RGB
        // Cambiar el color de fondo del formulario
        getContentPane().setBackground(grisAzuladoOscuro);
        
        // Agregar un FocusListener al campo txtNombre
        txtNombre.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "Nombre", borrarlo
                if (txtNombre.getText().equals("Nombre(s)")) {
                    txtNombre.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Nombre"
                if (txtNombre.getText().isEmpty()) {
                    txtNombre.setText("Nombre(s)");
                }
            }
        });
        
        txtAPaterno.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "Apellido Paterno", borrarlo
                if (txtAPaterno.getText().equals("Apellido Paterno")) {
                    txtAPaterno.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Apellido Paterno"
                if (txtAPaterno.getText().isEmpty()) {
                    txtAPaterno.setText("Apellido Paterno");
                }
            }
        });
        
        txtAMaterno.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "Apellido Materno", borrarlo
                if (txtAMaterno.getText().equals("Apellido Materno")) {
                    txtAMaterno.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Apellido Materno"
                if (txtAMaterno.getText().isEmpty()) {
                    txtAMaterno.setText("Apellido Materno");
                }
            }
        });
        
        txtCalle.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "Calle", borrarlo
                if (txtCalle.getText().equals("Calle")) {
                    txtCalle.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Calle"
                if (txtCalle.getText().isEmpty()) {
                    txtCalle.setText("Calle");
                }
            }
        });
        
        txtCP.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "Codigo Postal", borrarlo
                if (txtCP.getText().equals("Codigo Postal")) {
                    txtCP.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Codigo Postal"
                if (txtCP.getText().isEmpty()) {
                    txtCP.setText("Codigo Postal");
                }
            }
        });
        
        txtNExt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "No. Exterior", borrarlo
                if (txtNExt.getText().equals("No. Exterior")) {
                    txtNExt.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "No. Exterior"
                if (txtNExt.getText().isEmpty()) {
                    txtNExt.setText("No. Exterior");
                }
            }
        });
        
        txtColonia.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "Colonia", borrarlo
                if (txtColonia.getText().equals("Colonia")) {
                    txtColonia.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Colonia"
                if (txtColonia.getText().isEmpty()) {
                    txtColonia.setText("Colonia");
                }
            }
        });
        
        txtFechaNac.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "Fecha de Nacimiento (dd/mm/aaaa)", borrarlo
                if (txtFechaNac.getText().equals("Fecha de Nacimiento (aaaa/mm/dd)")) {
                    txtFechaNac.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Fecha de Nacimiento (dd/mm/aaaa)"
                if (txtFechaNac.getText().isEmpty()) {
                    txtFechaNac.setText("Fecha de Nacimiento (aaaa/mm/dd)");
                }
            }
        });
        
        txtContraseña.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Cuando se gana el foco, si el texto es igual a "Nombre", borrarlo
                if (txtContraseña.getText().equals("Contraseña")) {
                    txtContraseña.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Nombre"
                if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("Contraseña");
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAPaterno = new javax.swing.JTextField();
        txtAMaterno = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtCP = new javax.swing.JTextField();
        txtNExt = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Usuario");

        txtAPaterno.setText("Apellido Paterno");

        txtAMaterno.setText("Apellido Materno");
        txtAMaterno.setToolTipText("");

        txtCalle.setText("Calle");

        txtCP.setText("Codigo Postal");

        txtNExt.setText("No. Exterior");

        txtColonia.setText("Colonia");

        txtFechaNac.setText("Fecha de Nacimiento (aaaa/mm/dd)");

        txtContraseña.setText("Contraseña");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVaciar.setText("Vaciar");

        txtNombre.setText("Nombre(s)");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVaciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar))
                    .addComponent(txtNExt, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(txtColonia, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(txtFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(txtCP, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(txtAPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(txtAMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnVaciar)
                    .addComponent(btnRegistrar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        
        // Obtener los datos del formulario
        String nombre = txtNombre.getText();
        String apPaterno = txtAPaterno.getText();
        String apMaterno = txtAMaterno.getText();
        String calle = txtCalle.getText();
        String codigoPostal = txtCP.getText();
        String numeroExterior = txtNExt.getText();
        String colonia = txtColonia.getText();
        String fechaNacimiento = txtFechaNac.getText();
        String contraseña = txtContraseña.getText();

        // Establecer la conexión a la base de datos
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Deshabilitar la confirmación automática para poder realizar transacciones
            connection.setAutoCommit(false);

            // Preparar la consulta SQL para insertar un nuevo cliente
            String sqlCliente = "INSERT INTO cliente (nombres, ap_paterno, ap_materno, fechaNacimiento, contraseña) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statementCliente = connection.prepareStatement(sqlCliente, Statement.RETURN_GENERATED_KEYS)) {
                // Establecer los parámetros de la consulta para el cliente
                statementCliente.setString(1, nombre);
                statementCliente.setString(2, apPaterno);
                statementCliente.setString(3, apMaterno);
                statementCliente.setString(4, fechaNacimiento);
                statementCliente.setString(5, contraseña);

                // Ejecutar la consulta para el cliente
                int filasInsertadasCliente = statementCliente.executeUpdate();

                if (filasInsertadasCliente > 0) {
                    // Obtener el ID del cliente recién insertado
                    ResultSet generatedKeys = statementCliente.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        long idCliente = generatedKeys.getLong(1);

                        // Preparar la consulta SQL para insertar una nueva dirección
                        String sqlDireccion = "INSERT INTO direccion (calle, colonia, codigoPostal, numeroExterior, idCliente) VALUES (?, ?, ?, ?, ?)";
                        try (PreparedStatement statementDireccion = connection.prepareStatement(sqlDireccion)) {
                            // Establecer los parámetros de la consulta para la dirección
                            statementDireccion.setString(1, calle);
                            statementDireccion.setString(2, colonia);
                            statementDireccion.setString(3, codigoPostal);
                            statementDireccion.setString(4, numeroExterior);
                            statementDireccion.setLong(5, idCliente);

                            // Ejecutar la consulta para la dirección
                            int filasInsertadasDireccion = statementDireccion.executeUpdate();

                            if (filasInsertadasDireccion > 0) {
                                // Confirmar la transacción
                                connection.commit();
                                // Mostrar mensaje con el ID del cliente
                            JOptionPane.showMessageDialog(this, "Su ID es el siguiente: " + idCliente);

                            // Cerrar la ventana actual y abrir la ventana de login
                            this.dispose(); // Cerrar la ventana actual
                            PantallaLogin login = new PantallaLogin(idClienteEnSesion); // Crear instancia de la ventana de login
                            login.setVisible(true); // Mostrar la ventana de login
                            } else {
                                System.out.println("Error al registrar dirección.");
                                // Aquí podrías mostrar un mensaje de error o realizar alguna otra acción
                            }
                        }
                    }
                } else {
                    System.out.println("Error al registrar cliente.");
                    // Aquí podrías mostrar un mensaje de error o realizar alguna otra acción
                }
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión o consulta: " + e.getMessage());
            // Aquí podrías mostrar un mensaje de error o realizar alguna otra acción
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PantallaLogin pl = new PantallaLogin(idClienteEnSesion);
        pl.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAMaterno;
    private javax.swing.JTextField txtAPaterno;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNExt;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

