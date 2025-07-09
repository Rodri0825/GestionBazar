package Vista;

import Controladores.AdministradorControlador;
import Objetos.Empleado;
import javax.swing.JOptionPane;
import Controladores.EmpleadoDAO;
import Controladores.UsuarioDAO;

public class FormularioRegistrarEmpleado extends javax.swing.JDialog {

    private AdministradorControlador adminControlador;
    
    public FormularioRegistrarEmpleado(java.awt.Frame parent, boolean modal, AdministradorControlador adminControlador) 
    {
        super(parent, modal);
        initComponents();
        this.adminControlador = adminControlador;

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSueldoEmpleado = new javax.swing.JTextField();
        btnGuardarEmpleado = new javax.swing.JButton();
        cmbRol = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        cmbRolSeleccionado = new javax.swing.JComboBox<>();
        txtCodigoEmpleado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtDNI = new javax.swing.JLabel();
        txtDNIEmpleado = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JLabel();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 26, 46));

        btnGuardarEmpleado.setBackground(new java.awt.Color(22, 217, 155));
        btnGuardarEmpleado.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnGuardarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEmpleado.setText("Registrar");
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });

        cmbRol.setForeground(new java.awt.Color(255, 255, 255));
        cmbRol.setText("Rol");

        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setText("Codigo del empleado");

        cmbRolSeleccionado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Empleado", "Administrador" }));
        cmbRolSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolSeleccionadoActionPerformed(evt);
            }
        });

        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Nombre");

        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });

        txtDNI.setForeground(new java.awt.Color(255, 255, 255));
        txtDNI.setText("DNI");

        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setText("Telefono");

        txtSueldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSueldo.setText("Sueldo");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE EMPLEADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSueldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbRolSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNIEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSueldoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmbRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbRolSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDNI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDNIEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSueldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSueldoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRolSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRolSeleccionadoActionPerformed

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        
    String rol = cmbRolSeleccionado.getSelectedItem().toString().trim();
    String nombre = txtNombreEmpleado.getText().trim();
    String dni = txtDNIEmpleado.getText().trim();
    String telefono = txtTelefonoEmpleado.getText().trim();
    String sueldoTexto = txtSueldoEmpleado.getText().trim();
    String codigo = txtCodigoEmpleado.getText().trim();

    EmpleadoDAO dao = new EmpleadoDAO();

    // Validar rol
    if (rol.equals("Selecciona")) 
    {
        JOptionPane.showMessageDialog(this, "Debes seleccionar uno de los roles");
        return;
    }
    if (!rol.equalsIgnoreCase("Empleado") && !rol.equalsIgnoreCase("Administrador")) 
    {
        JOptionPane.showMessageDialog(this, "Rol no válido. Solo se permite 'Empleado' o 'Administrador'");
        return;
    }
    boolean esAdmin = rol.equalsIgnoreCase("Administrador");

    // Validar nombre
    if (nombre.isEmpty())
    {
        JOptionPane.showMessageDialog(this, "El campo nombre no debe estar vacío");
        return;
    }
    if (dao.existeNombre(nombre)) 
    {
        JOptionPane.showMessageDialog(this, "Ya está registrado el empleado con ese nombre");
        return;
    }

    // Validar DNI
    if (dni.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "El DNI no puede ser vacío");
        return;
    }
    if (!dni.matches("\\d{8}")) 
    {
        JOptionPane.showMessageDialog(this, "El DNI debe contener exactamente 8 dígitos numéricos");
        return;
    }
    if (dao.existeDNI(dni)) 
    {
        JOptionPane.showMessageDialog(this, "Ya se ha registrado una persona con ese DNI");
        return;
    }

    // Validar teléfono
    if (telefono.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El número de teléfono no puede ser nulo");
        return;
    }
    if (!telefono.matches("9\\d{8}")) 
    {
        JOptionPane.showMessageDialog(this, "El teléfono debe tener 9 dígitos y comenzar con 9");
        return;
    }
    if (dao.existeTelefono(telefono)) 
    {
        JOptionPane.showMessageDialog(this, "El número de teléfono no puede ser repetido");
        return;
    }

    // Validar sueldo
    if (sueldoTexto.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "Debes completar este campo");
        return;
    }

    double sueldo;
    try 
    {
        sueldo = Double.parseDouble(sueldoTexto);
        if (sueldo <= 0) 
        {
            JOptionPane.showMessageDialog(this, "Haz ingresado un dato inválido");
            return;
        }
    } catch (NumberFormatException e) 
    {
        JOptionPane.showMessageDialog(this, "El sueldo debe ser de tipo double");
        return;
    }

    // Validar código de empleado
    if (codigo.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "El código del empleado no puede ser nulo");
        return;
    }
    if (dao.existeCodigoEmpleado(codigo)) 
    {
        JOptionPane.showMessageDialog(this, "Ya existe un empleado con ese código");
        return;
    }

    // Crear y registrar empleado
    Empleado nuevo = new Empleado(esAdmin, nombre, dni, telefono, sueldo, codigo);

    if (dao.registrarEmpleado(nuevo)) 
    {
        String usuario = nombre;
        String contraseña = dni;
        
        // Registrar credenciales en la tabla usuario
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        boolean credencialesOk = usuarioDAO.registrarCredenciales(codigo, usuario, contraseña, esAdmin);
        
        if (!credencialesOk) 
        {
            JOptionPane.showMessageDialog(this, "Empleado registrado, pero hubo un error al guardar las credenciales.");

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Empleado registrado con éxito.\nUsuario: " + usuario + "\nContraseña: " + contraseña);
        }
        
        this.dispose();
    } else 
    {
        JOptionPane.showMessageDialog(this, "Error al registrar el empleado en la base de datos.");
    }
    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JLabel cmbRol;
    private javax.swing.JComboBox<String> cmbRolSeleccionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JLabel txtDNI;
    private javax.swing.JTextField txtDNIEmpleado;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JLabel txtSueldo;
    private javax.swing.JTextField txtSueldoEmpleado;
    private javax.swing.JLabel txtTelefono;
    private javax.swing.JTextField txtTelefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}
