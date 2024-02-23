package frm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Martinez
 */
public class PantallaCrearCuenta extends javax.swing.JFrame {
    
    private String idClienteEnSesion;
    
//    private static final String URL = "jdbc:mysql://localhost:3306/banco";
//    private static final String USER = "banco";
//    private static final String PASSWORD = "12345678";
    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USER = "root";
    private static final String PASSWORD = "41502Mar";

    /**
     * Creates new form PantallaCrearCuenta
     */
    public PantallaCrearCuenta(String cliente) {
        initComponents();
        this.idClienteEnSesion = cliente;
        
        // Obtener la fecha del sistema y mostrarla en el campo de texto txtFechaApertura
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = fechaActual.format(formatter);
        txtFechaApertura.setText(fechaFormateada);

        // Deshabilitar el campo de texto txtFechaApertura
        txtFechaApertura.setEnabled(false);

        // Mostrar el ID del cliente actual en el campo de texto txtIDCliente
        txtIDCliente.setText(String.valueOf(idClienteEnSesion));

        // Deshabilitar el campo de texto txtIDCliente
        txtIDCliente.setEnabled(false);
    }

    
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCrearCuenta("").setVisible(true);
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFechaApertura = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        txtIDCliente = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFechaApertura.setText("Fecha de Apertura");

        txtSaldo.setText("Saldo");

        txtIDCliente.setText("ID Cliente");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnVolver2.setText("Volver");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaApertura)
                            .addComponent(txtSaldo)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrear)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFechaApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnVolver2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        // Obtener los datos del formulario
        double saldo = Double.parseDouble(txtSaldo.getText());
        String fechaApertura = txtFechaApertura.getText();
        long idCliente = Long.parseLong(idClienteEnSesion);

        // Establecer la conexión a la base de datos
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Preparar la consulta SQL para insertar una nueva cuenta
            String sql = "INSERT INTO cuenta (fechaApertura, saldo, idCliente) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                // Establecer los parámetros de la consulta
                statement.setString(1, fechaApertura);
                statement.setDouble(2, saldo);
                statement.setLong(3, idCliente);

                // Ejecutar la consulta
                int filasInsertadas = statement.executeUpdate();

                if (filasInsertadas > 0) {
                    // Recuperar el ID generado automáticamente
                    ResultSet generatedKeys = statement.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        long idCuenta = generatedKeys.getLong(1);
                        JOptionPane.showMessageDialog(this, "El ID de su cuenta es: " + idCuenta);
                    }
                    // Cerrar la ventana actual
                    this.dispose();
                    // Abrir la pantalla del menú principal
                    PantallaMenuPrincipal menuPrincipal = new PantallaMenuPrincipal(idClienteEnSesion);
                    menuPrincipal.setVisible(true);
                }
                else {
                    System.out.println("Error al crear la cuenta.");
                    // Aquí podrías mostrar un mensaje de error o realizar alguna otra acción
                }
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión o consulta: " + e.getMessage());
            // Aquí podrías mostrar un mensaje de error o realizar alguna otra acción
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        // TODO add your handling code here:
        PantallaMenuPrincipal menuPrincipal = new PantallaMenuPrincipal(idClienteEnSesion);
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolver2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JTextField txtFechaApertura;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
