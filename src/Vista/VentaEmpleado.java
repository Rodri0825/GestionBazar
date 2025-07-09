package Vista;


public class VentaEmpleado extends javax.swing.JFrame {

    private java.util.List<String[]> listaVentas = new java.util.ArrayList<>();
    private String codigoEmpleado;
    private String nombreEmpleado;
    
    public VentaEmpleado(String codigoEmpleado, String nombreEmpleado) 
    {
        this.codigoEmpleado = codigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        initComponents();
    }
    public String getCodigoEmpleado()
    {
        return codigoEmpleado;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarVenta = new javax.swing.JButton();
        btnVerMisVentas = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 26, 46));

        btnRegistrarVenta.setBackground(new java.awt.Color(59, 130, 246));
        btnRegistrarVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("Registrar venta");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        btnVerMisVentas.setBackground(new java.awt.Color(245, 158, 11));
        btnVerMisVentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerMisVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVerMisVentas.setText("Ver mis Ventas");
        btnVerMisVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMisVentasActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(239, 68, 68));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesion");
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
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerMisVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerMisVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
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

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        FormularioRegistrarVenta formulario = new FormularioRegistrarVenta(this, true, this);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnVerMisVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMisVentasActionPerformed
        FormularioVerVentas formulario = new FormularioVerVentas(this, true, listaVentas);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnVerMisVentasActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed
    public void agregarVenta(String[] datosVenta) 
    {
        listaVentas.add(datosVenta);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnVerMisVentas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
