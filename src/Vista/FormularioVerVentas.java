package Vista;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;

public class FormularioVerVentas extends javax.swing.JDialog {
    
    private List<String[]> ventas;
    
    public FormularioVerVentas(java.awt.Frame parent, boolean modal, List<String[]> ventas) {
        super(parent, modal);
        this.ventas = ventas;
        initComponents();
        cargarVentas();
        personalizarTabla();
    }
    
    private void personalizarTabla() 
    {
        jTablaVentas.setBackground(new Color(26, 26, 46)); // Fondo oscuro
        jTablaVentas.setForeground(Color.WHITE); // Texto blanco
        jTablaVentas.setGridColor(new Color(50, 50, 70)); // Líneas de celda
        jTablaVentas.setSelectionBackground(new Color(22, 217, 155)); // Verde selección
        jTablaVentas.setSelectionForeground(Color.BLACK); // Texto cuando se selecciona
        jTablaVentas.setRowHeight(28); // Altura de filas

        JTableHeader header = jTablaVentas.getTableHeader();
        header.setBackground(new Color(22, 217, 155)); // Verde para encabezado
        header.setForeground(Color.BLACK); // Texto negro
        header.setFont(new Font("Segoe UI", Font.BOLD, 13)); // Fuente
        
        jScrollPane1.getViewport().setBackground(new Color(26, 26, 46)); // Fondo interno del scroll
        jScrollPane1.setBackground(new Color(26, 26, 46)); // Borde exterior

        // Opcional: remover bordes blancos si los tuviera
        jScrollPane1.setBorder(null);
    }
    
    private void cargarVentas()
    {
        String[] columnas = {"Código", "Cantidad", "Fecha"};
        String[][] filas = new String[ventas.size()][3];
        
        for (int i = 0; i < ventas.size(); i++)
        {
            filas[i] = ventas.get(i);
        }
        jTablaVentas.setModel(new DefaultTableModel(filas, columnas));
        if (ventas.isEmpty()) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay ventas registradas.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cantidad", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTablaVentas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Historial de ventas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaVentas;
    // End of variables declaration//GEN-END:variables
}
