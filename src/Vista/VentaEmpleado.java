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

        btnRegistrarVenta = new javax.swing.JButton();
        btnVerMisVentas = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrarVenta.setText("Registrar venta");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        btnVerMisVentas.setText("Ver mis Ventas");
        btnVerMisVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMisVentasActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerMisVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnRegistrarVenta)
                .addGap(18, 18, 18)
                .addComponent(btnVerMisVentas)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion)
                .addContainerGap(117, Short.MAX_VALUE))
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
    // End of variables declaration//GEN-END:variables
}
