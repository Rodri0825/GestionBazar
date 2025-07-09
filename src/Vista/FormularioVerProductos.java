package Vista;

import Objetos.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;

public class FormularioVerProductos extends javax.swing.JDialog 
{
    private Controladores.ProductoDAO productoDAO = new Controladores.ProductoDAO();

    public FormularioVerProductos(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        cargarProductosEnTabla(); // Mostramos los productos en la tabla al iniciar
        personalizarTabla();
    }
    
    private void personalizarTabla() 
    {
        jTableProductos.setBackground(new Color(26, 26, 46)); // Fondo oscuro
        jTableProductos.setForeground(Color.WHITE); // Texto blanco
        jTableProductos.setGridColor(new Color(50, 50, 70)); // Líneas de celda
        jTableProductos.setSelectionBackground(new Color(22, 217, 155)); // Verde selección
        jTableProductos.setSelectionForeground(Color.BLACK); // Texto cuando se selecciona
        jTableProductos.setRowHeight(28); // Altura de filas

        JTableHeader header = jTableProductos.getTableHeader();
        header.setBackground(new Color(22, 217, 155)); // Verde para encabezado
        header.setForeground(Color.BLACK); // Texto negro
        header.setFont(new Font("Segoe UI", Font.BOLD, 13)); // Fuente
        
        jScrollPane1.getViewport().setBackground(new Color(26, 26, 46)); // Fondo interno del scroll
        jScrollPane1.setBackground(new Color(26, 26, 46)); // Borde exterior

        // Opcional: remover bordes blancos si los tuviera
        jScrollPane1.setBorder(null);
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

        jTableProductos.setModel(new DefaultTableModel(filas, columnas));
        jTableProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);//Para expandir las columnas y no se vea estrecho
        if (productos.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "No hay productos registrados");
        }
    } @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableProductos.setBackground(new java.awt.Color(26, 26, 46));
        jTableProductos.setForeground(new java.awt.Color(255, 255, 255));
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Stock", "Precio"
            }
        ));
        jTableProductos.setGridColor(new java.awt.Color(153, 102, 255));
        jTableProductos.setSelectionBackground(new java.awt.Color(204, 255, 255));
        jScrollPane1.setViewportView(jTableProductos);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables
}