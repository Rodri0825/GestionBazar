package Vista;

import Objetos.Empleado;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;

public class FormularioVerEmpleados extends javax.swing.JDialog {
    
    private Controladores.EmpleadoDAO empleadoDAO = new Controladores.EmpleadoDAO();
    
    public FormularioVerEmpleados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarEmpleadosEnTabla();
        personalizarTabla();

    }
    
    private void personalizarTabla() 
    {
        jTablaEmpleados.setBackground(new Color(26, 26, 46)); // Fondo oscuro
        jTablaEmpleados.setForeground(Color.WHITE); // Texto blanco
        jTablaEmpleados.setGridColor(new Color(50, 50, 70)); // Líneas de celda
        jTablaEmpleados.setSelectionBackground(new Color(22, 217, 155)); // Verde selección
        jTablaEmpleados.setSelectionForeground(Color.BLACK); // Texto cuando se selecciona
        jTablaEmpleados.setRowHeight(28); // Altura de filas

        JTableHeader header = jTablaEmpleados.getTableHeader();
        header.setBackground(new Color(22, 217, 155)); // Verde para encabezado
        header.setForeground(Color.BLACK); // Texto negro
        header.setFont(new Font("Segoe UI", Font.BOLD, 13)); // Fuente
        
        jScrollPane1.getViewport().setBackground(new Color(26, 26, 46)); // Fondo interno del scroll
        jScrollPane1.setBackground(new Color(26, 26, 46)); // Borde exterior

        // Opcional: remover bordes blancos si los tuviera
        jScrollPane1.setBorder(null);
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

        btnCerrar.setBackground(new java.awt.Color(22, 217, 155));
        btnCerrar.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
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
