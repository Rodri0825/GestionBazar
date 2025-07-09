package Vista;

import javax.swing.JOptionPane;
import Controladores.AdministradorControlador;
import Controladores.EmpleadoControlador;
import Controladores.UsuarioDAO;
import Vista.VentaAdmin;
import Vista.VentaEmpleado;
    
public class Login extends javax.swing.JFrame {

    public Login() 
    {
        initComponents();
        getRootPane().setDefaultButton(btnIniciarSesion);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empleadoDAO1 = new Controladores.EmpleadoDAO();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 26, 46));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");

        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña");

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        btnIniciarSesion.setBackground(new java.awt.Color(22, 217, 155));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("INICIAR SESION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(lblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(lblContraseña)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtContraseña))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnIniciarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String usuario = txtUsuario.getText().trim();
    String contraseña = new String(txtContraseña.getPassword()).trim();

    // Verificar credenciales predefinidas de administrador
    if (usuario.equals("admin") && contraseña.equals("1234")) 
    {
        AdministradorControlador adminControlador = new AdministradorControlador();
        EmpleadoControlador empleadoControlador = new EmpleadoControlador();

        VentaAdmin ventana = new VentaAdmin(adminControlador, empleadoControlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
        return;
    }

    // Verificar en la base de datos para empleados
    UsuarioDAO dao = new UsuarioDAO();
    boolean valido = dao.validarCredenciales(usuario, contraseña);

    if (valido) 
    {
        String nombreEmpleado = dao.obtenerNombrePorUsuario(usuario);
        if (nombreEmpleado != null) 
        {
            VentaEmpleado ventana = new VentaEmpleado(usuario, nombreEmpleado); // ✅ pasamos usuario como código
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No se pudo obtener el nombre del empleado.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
    }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
  
    public static void main(String args[]) 
    {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private Controladores.EmpleadoDAO empleadoDAO1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
