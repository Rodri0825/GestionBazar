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

        lblCodigoProducto = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnRegistrarVenta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCodigoProducto.setText("Codigo del Producto");

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        lblCantidad.setText("Cantidad");

        jLabel1.setText("Fecha");

        btnRegistrarVenta.setText("Registrar Venta");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrarVenta)
                        .addGap(56, 56, 56)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCantidad)
                        .addComponent(txtFecha)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblCodigoProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarVenta)
                    .addComponent(btnCancelar))
                .addGap(38, 38, 38))
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
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigoProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
