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

        lblCodigoBuscar = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCodigoBuscar = new javax.swing.JTextField();
        lblStockNuevo = new javax.swing.JLabel();
        txtNuevoStock = new javax.swing.JTextField();
        lblNuevoPrecio = new javax.swing.JLabel();
        txtNuevoPrecio = new javax.swing.JTextField();
        btnGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCodigoBuscar.setText("Ingrese el codigo del producto a buscar");

        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblStockNuevo.setText("Nuevo stock");

        lblNuevoPrecio.setText("Nuevo precio");

        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblCodigoBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(btnCancelar))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblStockNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNuevoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNuevoPrecio)
                                .addComponent(txtNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarCambios)
                            .addComponent(btnBuscarProducto))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblCodigoBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarProducto)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(lblStockNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNuevoPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCambios)
                .addContainerGap(95, Short.MAX_VALUE))
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
    private javax.swing.JLabel lblCodigoBuscar;
    private javax.swing.JLabel lblNuevoPrecio;
    private javax.swing.JLabel lblStockNuevo;
    private javax.swing.JTextField txtCodigoBuscar;
    private javax.swing.JTextField txtNuevoPrecio;
    private javax.swing.JTextField txtNuevoStock;
    // End of variables declaration//GEN-END:variables
}
