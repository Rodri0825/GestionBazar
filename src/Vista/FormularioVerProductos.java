package Vista;

import Controladores.AdministradorControlador;
import Objetos.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormularioVerProductos extends javax.swing.JDialog 
{
    private Controladores.AdministradorControlador adminControlador;

    public FormularioVerProductos(java.awt.Frame parent, boolean modal, Controladores.AdministradorControlador adminControlador) 
    {
        super(parent, modal);
        initComponents();
        this.adminControlador = adminControlador;
        cargarProductosEnTabla(); // Mostramos los productos en la tabla al iniciar
    }

    private void cargarProductosEnTabla() 
    {
        String[] columnas = {"Código", "Nombre", "Marca", "Stock", "Precio"};
        List<Objetos.Producto> lista = adminControlador.obtenerProductos();
        String[][] filas = new String[lista.size()][5];

        for (int i = 0; i < lista.size(); i++) {
            Objetos.Producto p = lista.get(i);
            filas[i][0] = p.getCodigo();
            filas[i][1] = p.getNombre();
            filas[i][2] = p.getMarca();
            filas[i][3] = String.valueOf(p.getStock());
            filas[i][4] = String.valueOf(p.getPrecio());
        }

        jTable1.setModel(new DefaultTableModel(filas, columnas));
    } @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Stock", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnCerrar)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}