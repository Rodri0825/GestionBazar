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

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsuario.setText("Usuario");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblContraseña.setText("Contraseña");

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        lblTitulo.setText("INICIAR SESION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblContraseña))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContraseña)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnIniciarSesion))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lblTitulo)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnIniciarSesion)
                .addContainerGap(60, Short.MAX_VALUE))
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
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
