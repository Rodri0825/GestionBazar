package Vista;

import Objetos.Empleado;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormularioVerEmpleados extends javax.swing.JDialog {
    
    private Controladores.EmpleadoDAO empleadoDAO = new Controladores.EmpleadoDAO();
    
    public FormularioVerEmpleados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarEmpleadosEnTabla();

    }
    private void cargarEmpleadosEnTabla() {
        String[] columnas = {"Código", "Nombre", "DNI", "Teléfono", "Sueldo", "Rol"};
        List<Empleado> lista = empleadoDAO.obtenerTodosLosEmpleados();
        String[][] filas = new String[lista.size()][6];

        for (int i = 0; i < lista.size(); i++) {
            Empleado emp = lista.get(i);
            filas[i][0] = emp.getCodigoEmpleado();
            filas[i][1] = emp.getNombre();
            filas[i][2] = emp.getDni();
            filas[i][3] = emp.getTelefono();
            filas[i][4] = String.valueOf(emp.getSueldo());
            filas[i][5] = emp.isRol() ? "Administrador" : "Empleado";
        }

        jTablaEmpleados.setModel(new DefaultTableModel(filas, columnas));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaEmpleados = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(jTablaEmpleados);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaEmpleados;
    // End of variables declaration//GEN-END:variables
}
