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

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarProducto = new javax.swing.JButton();
        btnVerProductos = new javax.swing.JButton();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnVerEmpleados = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 26, 46));

        btnRegistrarProducto.setBackground(new java.awt.Color(22, 217, 155));
        btnRegistrarProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProducto.setText("Registrar producto");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        btnVerProductos.setBackground(new java.awt.Color(59, 130, 246));
        btnVerProductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVerProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerProductos.setText("Ver productos");
        btnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosActionPerformed(evt);
            }
        });

        btnRegistrarEmpleado.setBackground(new java.awt.Color(22, 217, 155));
        btnRegistrarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEmpleado.setText("Registrar empleado");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        btnVerEmpleados.setBackground(new java.awt.Color(59, 130, 246));
        btnVerEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVerEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEmpleados.setText("Ver empleados");
        btnVerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEmpleadosActionPerformed(evt);
            }
        });

        btnModificarProducto.setBackground(new java.awt.Color(245, 158, 11));
        btnModificarProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProducto.setText("Modificar producto");
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(239, 68, 68));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnVerProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}