package Interfaz;

import Dominio.Producto;
import Dominio.Sistema;
import Dominio.Stock;
import Persistencia.ArchivoLectura;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaCargarProductos extends javax.swing.JDialog {

    private Sistema modelo;

    public VentanaCargarProductos(Sistema sis, JFrame ventanaPadre) {
        super(ventanaPadre, true);
        initComponents();
        modelo = sis;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtArchivoCargar = new javax.swing.JTextField();
        btnExaminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtArchivoCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArchivoCargarActionPerformed(evt);
            }
        });

        btnExaminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExaminar.setText("Examinar");
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cargar productos");

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(txtArchivoCargar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addGap(26, 26, 26)
                .addComponent(btnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArchivoCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setSelectedFile(new File(txtArchivoCargar.getText()));

        int retorno = fileChooser.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {

            String ubicacion = fileChooser.getSelectedFile().getPath();

            txtArchivoCargar.setText(ubicacion);
        }
    }//GEN-LAST:event_btnExaminarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String pathArchivo = txtArchivoCargar.getText();
        try {
            ArchivoLectura al = new ArchivoLectura(pathArchivo);
            boolean error = false;
            while (al.hayMasLineas()) {

                String linea = al.linea();
                System.out.println("Linea" + linea);
                if (chequearLinea(linea)) {
                    String[] tokens = linea.split("#");
                    String nombre = tokens[0];
                    int minimoStock = Integer.parseInt(tokens[1]);
                    int maxStock = Integer.parseInt(tokens[2]);
                    Producto nuevoP = new Producto(nombre, minimoStock);
                    Stock nuevoStock = new Stock(nuevoP, maxStock);
                    modelo.actualizarListaStock(nuevoStock);
                } else {
                    error = true;
                }
            }

            if (error) {
                JOptionPane.showMessageDialog(null, "Error al cargar el producto, revise"
                        + " el contenido si esta bien escrito; o el tipo de archivo"
                        + " que desea cargar");
            }
            dispose();
            al.cerrar();

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar algun archivo previamente de aceptar");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtArchivoCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArchivoCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArchivoCargarActionPerformed

    public boolean chequearLinea(String linea) {

        boolean ok = false;
        try {
            String[] tokens = linea.split("#");
            if (tokens.length == 3 && txtArchivoCargar.getText().substring(txtArchivoCargar.getText().length() - 4, txtArchivoCargar.getText().length()).equalsIgnoreCase(".txt")) {
                String nombreProducto = tokens[0];
                int minimoStock = Integer.parseInt(tokens[1]);
                int maxStock = Integer.parseInt(tokens[2]);
                //validar los numeros con null
                if (minimoStock > 0 && !nombreProducto.equals("") && maxStock > 0) {
                    ok = true;
                }
            }

        } catch (NumberFormatException err) {

        }

        return ok;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtArchivoCargar;
    // End of variables declaration//GEN-END:variables
}
