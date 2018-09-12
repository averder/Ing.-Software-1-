package Interfaz;

import Dominio.Sistema;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaGastoFijo extends javax.swing.JDialog {

    private Sistema modelo;

    public VentanaGastoFijo(Sistema sis, JFrame ventanaPadre) {
        super(ventanaPadre, true);
        initComponents();
        modelo = sis;
        
    }

    public Sistema getModelo() {
        return modelo;
    }

    public void setModelo(Sistema modelo) {
        this.modelo = modelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblElegirFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbtnFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btbGuardar = new javax.swing.JButton();
        jtxtCosto = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNombre.setText("Nombre:");

        lblElegirFecha.setText("Elegir fecha:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gasto Fijo");

        jbtnFecha.setDateFormatString("dd-MM-yyyy");

        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Costo:");

        btbGuardar.setText("Guardar");
        btbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbGuardarActionPerformed(evt);
            }
        });

        jtxtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCostoActionPerformed(evt);
            }
        });
        jtxtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtCostoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCostoKeyTyped(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(71, 23));
        btnCancelar.setMinimumSize(new java.awt.Dimension(71, 23));
        btnCancelar.setPreferredSize(new java.awt.Dimension(71, 23));
        btnCancelar.setRequestFocusEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblElegirFecha)
                    .addComponent(jLabel3)
                    .addComponent(btbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(jLabel2)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElegirFecha)
                    .addComponent(jbtnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void btbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbGuardarActionPerformed
        Calendar c = jbtnFecha.getCalendar();
        boolean ok = modelo.okGastoFijo(jtxtNombre.getText(), jtxtCosto.getText(),
                c);

        String mensaje = "";
        if (jtxtNombre.getText().isEmpty()) {

            mensaje += "\nIngrese un nombre válido ";
        }
        if (jtxtCosto.getText().isEmpty() || jtxtCosto.getText().equals("0")) {

            mensaje += "\nIngrese un costo válido";
        }

        if (jbtnFecha.getCalendar() == null) {
            mensaje += "\nIngrese una fecha valida";
        }
        if (ok) {
            String mensaje2 = "Se ha ingresado correctamente el gasto fijo";
            JOptionPane.showMessageDialog(this, mensaje2, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, mensaje, "ERROR", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btbGuardarActionPerformed

    private void jtxtCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCostoKeyPressed


    }//GEN-LAST:event_jtxtCostoKeyPressed

    private void jtxtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCostoKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        int numeroCaracteres = 8;
        if(jtxtCosto.getText().length()>=numeroCaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtCostoKeyTyped

    private void jtxtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCostoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyTyped
        int numeroCaracteres = 15;
        if(jtxtNombre.getText().length()>=numeroCaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbGuardar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.calendar.JDateChooser jbtnFecha;
    private javax.swing.JTextField jtxtCosto;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JLabel lblElegirFecha;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
