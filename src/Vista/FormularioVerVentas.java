package Vista;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormularioVerVentas extends javax.swing.JDialog {
    
    private List<String[]> ventas;
    
    public FormularioVerVentas(java.awt.Frame parent, boolean modal, List<String[]> ventas) {
        super(parent, modal);
        this.ventas = ventas;
        initComponents();
        cargarVentas();
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

        jLabel1.setText("Historial de ventas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaVentas;
    // End of variables declaration//GEN-END:variables
}
