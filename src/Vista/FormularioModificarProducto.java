package Vista;

import Controladores.AdministradorControlador;
import Controladores.ProductoDAO;
import javax.swing.JOptionPane;

public class FormularioModificarProducto extends javax.swing.JDialog {

    private Controladores.AdministradorControlador adminControlador;
    private Objetos.Producto productoSeleccionado;
    private Vista.VentaAdmin ventanaAdmin;
    
    public FormularioModificarProducto(java.awt.Frame parent, boolean modal, AdministradorControlador adminControlador, VentaAdmin ventanaAdmin) {
        super(parent, modal);
        initComponents();
        this.adminControlador = adminControlador;
        this.ventanaAdmin = ventanaAdmin;
            
        lblStockNuevo.setVisible(false);
        txtNuevoStock.setVisible(false);
        lblNuevoPrecio.setVisible(false);
        txtNuevoPrecio.setVisible(false);
        btnGuardarCambios.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNuevoStock = new javax.swing.JTextField();
        lblNuevoPrecio = new javax.swing.JLabel();
        txtNuevoPrecio = new javax.swing.JTextField();
        btnGuardarCambios = new javax.swing.JButton();
        lblCodigoBuscar = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCodigoBuscar = new javax.swing.JTextField();
        lblStockNuevo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 26, 46));

        lblNuevoPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNuevoPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoPrecio.setText("Nuevo precio");

        btnGuardarCambios.setBackground(new java.awt.Color(22, 217, 155));
        btnGuardarCambios.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        lblCodigoBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigoBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoBuscar.setText("Ingrese el codigo del producto a buscar");

        btnBuscarProducto.setBackground(new java.awt.Color(59, 130, 246));
        btnBuscarProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(239, 68, 68));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblStockNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStockNuevo.setForeground(new java.awt.Color(255, 255, 255));
        lblStockNuevo.setText("Nuevo stock");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODIFICAR PRODUCTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblCodigoBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblStockNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNuevoStock))
                            .addComponent(txtNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardarCambios)
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblCodigoBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(lblStockNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNuevoPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        String codigo = txtCodigoBuscar.getText().trim();
        if (codigo.isEmpty()) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes ingresar un código de producto.");
            return;
        }
        
        ProductoDAO dao = new ProductoDAO();
        productoSeleccionado = dao.buscarProductoPorCodigo(codigo);
        
        if (productoSeleccionado == null) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún producto con ese código.");
            return;
        }
        
        // Mostrar campos de modificación
        lblStockNuevo.setVisible(true);
        txtNuevoStock.setVisible(true);
        lblNuevoPrecio.setVisible(true);
        txtNuevoPrecio.setVisible(true);
        btnGuardarCambios.setVisible(true);

        // Mostrar datos actuales
        txtNuevoStock.setText(String.valueOf(productoSeleccionado.getStock()));
        txtNuevoPrecio.setText(String.valueOf(productoSeleccionado.getPrecio()));
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        if (productoSeleccionado == null) 
        {
            JOptionPane.showMessageDialog(this, "Primero debes buscar un producto válido.");
            return;
        }

        // Validar stock
        String stockTexto = txtNuevoStock.getText().trim();
        int nuevoStock;

        try
        {
            nuevoStock = Integer.parseInt(stockTexto);
            
            if (nuevoStock < 0) 
            {
                JOptionPane.showMessageDialog(this, "El stock no puede ser negativo.");
                return;
            }
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "El stock debe ser un número entero.");
            return;
        }

        // Validar precio
        String precioTexto = txtNuevoPrecio.getText().trim();
        double nuevoPrecio;

        try {
            nuevoPrecio = Double.parseDouble(precioTexto);
            
            if (nuevoPrecio <= 0) 
            {
                JOptionPane.showMessageDialog(this, "El precio debe ser mayor que cero.");
                return;
            }
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "El precio debe ser un número decimal válido.");
            return;
        }

        // Actualizar en la base de datos
        ProductoDAO dao = new ProductoDAO();
        boolean actualizado = dao.actualizarStockYPrecio(productoSeleccionado.getCodigo(), nuevoStock, nuevoPrecio);

        if (actualizado) 
        {
            JOptionPane.showMessageDialog(this, "Producto actualizado correctamente.");
            this.dispose();
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Error al actualizar el producto.");
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose(); // cerrar el formulario actual
        if (ventanaAdmin != null) 
        {
            ventanaAdmin.setVisible(true); //vuelve a mostrar VentaAdmin
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigoBuscar;
    private javax.swing.JLabel lblNuevoPrecio;
    private javax.swing.JLabel lblStockNuevo;
    private javax.swing.JTextField txtCodigoBuscar;
    private javax.swing.JTextField txtNuevoPrecio;
    private javax.swing.JTextField txtNuevoStock;
    // End of variables declaration//GEN-END:variables
}
