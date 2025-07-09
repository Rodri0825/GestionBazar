package Vista;

import Controladores.VentaDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class FormularioRegistrarVenta extends javax.swing.JDialog {

    private VentaEmpleado ventanaEmpleado;
    
    public FormularioRegistrarVenta(java.awt.Frame parent, boolean modal, VentaEmpleado ventanaEmpleado) {
        super(parent, modal);
        initComponents();
        this.ventanaEmpleado = ventanaEmpleado;
        mostrarFechaActual();
    }
    private void mostrarFechaActual() {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        txtFecha.setText(hoy.format(formato));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigoProducto = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnRegistrarVenta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 26, 46));

        lblCodigoProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigoProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoProducto.setText("Codigo del Producto");

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad.setText("Cantidad");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha");

        btnRegistrarVenta.setBackground(new java.awt.Color(22, 217, 155));
        btnRegistrarVenta.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnRegistrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("Registrar Venta");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(239, 68, 68));
        btnCancelar.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VENTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodigoProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnRegistrarVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoProducto)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        String codigo = txtCodigoProducto.getText().trim();
        String cantidadTexto = txtCantidad.getText().trim();

        if (codigo.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código de producto");
            return;
        }

        int cantidad;
        try 
        {
            cantidad = Integer.parseInt(cantidadTexto);
            if (cantidad <= 0) 
            {
                JOptionPane.showMessageDialog(this, "La cantidad de producto debe ser mayor a cero");
                return;
            }
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "La cantidad de producto debe ser un número entero");
            return;
        }

        String fecha = txtFecha.getText().trim();
        LocalDate hoy = LocalDate.now();
        String fechaActual = hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        if (!fecha.equals(fechaActual)) 
        {
            JOptionPane.showMessageDialog(this, "La fecha debe ser la actual");
            return;
        }

        // Registrar venta en BD
        VentaDAO dao = new VentaDAO();
        String codigoEmpleado = ventanaEmpleado.getCodigoEmpleado();
        boolean registrado = dao.registrarVenta(codigo, cantidad, fecha, codigoEmpleado);

        if (registrado) 
        {
            JOptionPane.showMessageDialog(this, "Venta registrada exitosamente en la base de datos.");

            // Agregar a lista local de ventas (para ver mis ventas)
            if (ventanaEmpleado != null) 
            {
                ventanaEmpleado.agregarVenta(new String[]{codigo, String.valueOf(cantidad), fecha});
            }
            this.dispose();
            } else 
            {
                JOptionPane.showMessageDialog(this, "Error al registrar la venta en la base de datos.");
            }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        if (ventanaEmpleado != null) 
        {
            ventanaEmpleado.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigoProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
