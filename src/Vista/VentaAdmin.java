package Vista;

import Vista.FormularioRegistrarProducto;
import Vista.FormularioRegistrarEmpleado;
import Vista.FormularioVerProductos;
import Vista.FormularioVerEmpleados;
import Vista.Login;
import Controladores.AdministradorControlador;
import Controladores.EmpleadoControlador;

public class VentaAdmin extends javax.swing.JFrame 
{
    private AdministradorControlador adminControlador;
    private EmpleadoControlador empleadoControlador;
    
    public VentaAdmin(AdministradorControlador adminControlador, EmpleadoControlador empleadoControlador) 
    {
        initComponents();
        this.adminControlador = adminControlador;
        this.empleadoControlador = empleadoControlador;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarProducto = new javax.swing.JButton();
        btnVerProductos = new javax.swing.JButton();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnVerEmpleados = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrarProducto.setText("Registrar producto");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        btnVerProductos.setText("Ver productos");
        btnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosActionPerformed(evt);
            }
        });

        btnRegistrarEmpleado.setText("Registrar empleado");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        btnVerEmpleados.setText("Ver empleados");
        btnVerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEmpleadosActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnModificarProducto.setText("Modificar producto");
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(btnCerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        FormularioRegistrarProducto formulario = new FormularioRegistrarProducto(this, true, adminControlador);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void btnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductosActionPerformed
        FormularioVerProductos verProductos = new FormularioVerProductos(this, true);
        verProductos.setLocationRelativeTo(this);
        verProductos.setVisible(true);
    }//GEN-LAST:event_btnVerProductosActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        FormularioRegistrarEmpleado formulario = new FormularioRegistrarEmpleado(this, true, adminControlador);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnVerEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEmpleadosActionPerformed
        FormularioVerEmpleados formulario = new FormularioVerEmpleados(this, true);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnVerEmpleadosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        FormularioModificarProducto formulario = new FormularioModificarProducto(this, true, adminControlador, this);
        formulario.setLocationRelativeTo(this);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton btnVerEmpleados;
    private javax.swing.JButton btnVerProductos;
    // End of variables declaration//GEN-END:variables
}