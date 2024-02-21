/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * 
 * @author eduar
 */
public class PantallaRegistrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form PantallaRegistrarUsuario
     */
    public PantallaRegistrarUsuario() {
        initComponents();
        
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
                if (txtFechaNac.getText().equals("Fecha de Nacimiento (dd/mm/aaaa)")) {
                    txtFechaNac.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando se pierde el foco, si el texto está vacío, restaurar "Fecha de Nacimiento (dd/mm/aaaa)"
                if (txtFechaNac.getText().isEmpty()) {
                    txtFechaNac.setText("Fecha de Nacimiento (dd/mm/aaaa)");
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
        txtNombre = new javax.swing.JTextField();
        txtAPaterno = new javax.swing.JTextField();
        txtAMaterno = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtCP = new javax.swing.JTextField();
        txtNExt = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        botonVaciar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Usuario");

        txtNombre.setText("Nombre(s)");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtAPaterno.setText("Apellido Paterno");

        txtAMaterno.setText("Apellido Materno");
        txtAMaterno.setToolTipText("");

        txtCalle.setText("Calle");

        txtCP.setText("Codigo Postal");

        txtNExt.setText("No. Exterior");

        txtColonia.setText("Colonia");

        txtFechaNac.setText("Fecha de Nacimiento (dd/mm/aaaa)");

        txtContraseña.setText("Contraseña");

        botonCancelar.setText("Cancelar");

        botonVaciar.setText("Vaciar");

        botonRegistrar.setText("Registrar Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonVaciar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonRegistrar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNExt)
                                .addComponent(txtColonia)
                                .addComponent(txtFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(txtContraseña)
                                .addComponent(txtCP)
                                .addComponent(txtCalle)
                                .addComponent(txtAPaterno)
                                .addComponent(txtAMaterno)
                                .addComponent(txtNombre))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(botonCancelar)
                    .addComponent(botonVaciar)
                    .addComponent(botonRegistrar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonVaciar;
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

