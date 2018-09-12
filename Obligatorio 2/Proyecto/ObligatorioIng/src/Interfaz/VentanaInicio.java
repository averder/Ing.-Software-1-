package Interfaz;

import Dominio.Sistema;
import Dominio.Stock;
import Persistencia.Persistencia;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentanaInicio extends javax.swing.JFrame {

    private Sistema modelo;

    public VentanaInicio(Sistema sis) {
        initComponents();
        modelo = sis;
        lstListaProductosEnStock.setListData(modelo.getListaStocks().toArray());
    }

    public Sistema getModelo() {
        return modelo;
    }

    public void setModelo(Sistema modelo) {
        this.modelo = modelo;
    }

    public void guardar() {
        Persistencia per = new Persistencia();
        per.guardarSistema(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstListaProductosEnStock = new javax.swing.JList();
        btnQuitarUnProducto = new javax.swing.JButton();
        lblresultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMuestraResultado = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        btnGastoFijo = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();
        btnReporteGastosAlMes = new javax.swing.JButton();
        btnReporteStock = new javax.swing.JButton();
        btnCargarProductos = new javax.swing.JButton();
        btnActualizarListaStock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor de gastos");

        lstListaProductosEnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstListaProductosEnStockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstListaProductosEnStock);

        btnQuitarUnProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuitarUnProducto.setText("Quitar un producto");
        btnQuitarUnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarUnProductoActionPerformed(evt);
            }
        });

        lblresultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblresultado.setForeground(new java.awt.Color(0, 0, 204));
        lblresultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblresultado.setText("Resultado:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Mensaje:");

        lblMuestraResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnGastoFijo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGastoFijo.setText("Ingresar Gasto Fijo");
        btnGastoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastoFijoActionPerformed(evt);
            }
        });

        btnCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCompra.setText("Ingresar Compra");
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });

        btnReporteGastosAlMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporteGastosAlMes.setText("Resporte gastos al mes");
        btnReporteGastosAlMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteGastosAlMesActionPerformed(evt);
            }
        });

        btnReporteStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReporteStock.setText("Resporte stock");
        btnReporteStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteStockActionPerformed(evt);
            }
        });

        btnCargarProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCargarProductos.setText("Cargar Productos");
        btnCargarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarProductosActionPerformed(evt);
            }
        });

        btnActualizarListaStock.setText("Actualizar lista Stock");
        btnActualizarListaStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarListaStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnQuitarUnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 202, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMuestraResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGastoFijo, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(btnCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnReporteStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReporteGastosAlMes, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnActualizarListaStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCargarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnQuitarUnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMuestraResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(btnReporteGastosAlMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGastoFijo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteStock, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnActualizarListaStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstListaProductosEnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstListaProductosEnStockMouseClicked

    }//GEN-LAST:event_lstListaProductosEnStockMouseClicked

    private void btnQuitarUnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarUnProductoActionPerformed
        Stock seleccionado = (Stock) lstListaProductosEnStock.getSelectedValue();

        if (seleccionado != null) {
            boolean resultado = modelo.quitarProducto(seleccionado);
            if (resultado == false) {
                lblMuestraResultado.setText("Se ha quitado un producto de "
                        + seleccionado.getProducto().getNombre()
                        + " del stock");
                lstListaProductosEnStock.setListData(modelo.getListaStocks().toArray());
                String linea = modelo.actualizarListaInicio();
                lblMensaje.setText(linea);
            } else if (resultado == true) {
                lblMuestraResultado.setText("Ya no hay mas productos de "
                        + seleccionado.getProducto().getNombre()
                        + " en stock");
                lstListaProductosEnStock.setListData(modelo.getListaStocks().toArray());
                String linea = modelo.actualizarListaInicio();
                lblMensaje.setText(linea);
            }
        } else if (modelo.getListaStocks().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encuentra productos en sistema", "ERROR", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un stock previamente", "ERROR", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnQuitarUnProductoActionPerformed

    private void btnCargarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarProductosActionPerformed
        VentanaCargarProductos v = new VentanaCargarProductos(modelo, this);
        v.setLocationRelativeTo(this);
        v.setVisible(true);
    }//GEN-LAST:event_btnCargarProductosActionPerformed

    private void btnActualizarListaStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarListaStockActionPerformed
        String linea = modelo.actualizarListaInicio();
        lblMensaje.setText(linea);
        lstListaProductosEnStock.setListData(modelo.getListaStocks().toArray());
    }//GEN-LAST:event_btnActualizarListaStockActionPerformed

    private void btnGastoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastoFijoActionPerformed
        VentanaGastoFijo v = new VentanaGastoFijo(getModelo(), this);
        v.setLocationRelativeTo(this);
        v.setVisible(true);
    }//GEN-LAST:event_btnGastoFijoActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        VentanaCompra v = new VentanaCompra(getModelo(), this);
        v.setLocationRelativeTo(this);
        v.setVisible(true);
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnReporteStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteStockActionPerformed
        VentanaStock v = new VentanaStock(getModelo(), this);
        v.setLocationRelativeTo(this);
        v.setVisible(true);
    }//GEN-LAST:event_btnReporteStockActionPerformed

    private void btnReporteGastosAlMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteGastosAlMesActionPerformed
        VentanaReporteGastosAlMes v = new VentanaReporteGastosAlMes(getModelo(), this);
        v.setLocationRelativeTo(this);
        v.setVisible(true);
    }//GEN-LAST:event_btnReporteGastosAlMesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardar();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarListaStock;
    private javax.swing.JButton btnCargarProductos;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnGastoFijo;
    private javax.swing.JButton btnQuitarUnProducto;
    private javax.swing.JButton btnReporteGastosAlMes;
    private javax.swing.JButton btnReporteStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMuestraResultado;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JList lstListaProductosEnStock;
    // End of variables declaration//GEN-END:variables
}
