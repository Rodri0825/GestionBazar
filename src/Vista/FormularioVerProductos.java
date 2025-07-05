package Vista;

import Objetos.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormularioVerProductos extends javax.swing.JDialog 
{
    private Controladores.ProductoDAO productoDAO = new Controladores.ProductoDAO();

    public FormularioVerProductos(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        cargarProductosEnTabla(); // Mostramos los productos en la tabla al iniciar
    }

    private void cargarProductosEnTabla() 
    {
        List<Producto> productos = productoDAO.obtenerTodosLosProductos(); // Cargamos desde BD
        String[] columnas = {"Código", "Nombre", "Marca", "Stock", "Precio"};
        String[][] filas = new String[productos.size()][5];

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            filas[i][0] = p.getCodigo();
            filas[i][1] = p.getNombre();
            filas[i][2] = p.getMarca();
            filas[i][3] = String.valueOf(p.getStock());
            filas[i][4] = String.valueOf(p.getPrecio());
        }

        jTable1.setModel(new DefaultTableModel(filas, columnas));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);//Para expandir las columnas y no se vea estrecho
        if (productos.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "No hay productos registrados");
        }
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