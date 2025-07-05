package Vista;

import Controladores.AdministradorControlador;
import Controladores.ProductoDAO;
import Objetos.Producto;
import javax.swing.JOptionPane;

public class FormularioRegistrarProducto extends javax.swing.JDialog {

    private AdministradorControlador adminControlador;
    private ProductoDAO productoDAO = new ProductoDAO();
    
    //permite que esta ventana use el mismo controlador que la ventana principal
    // parent: quien lo llama
    //modal: hace que la ventana se bloquee hasta que la otra se cierre
    public FormularioRegistrarProducto(java.awt.Frame parent, boolean modal, AdministradorControlador adminControlador) 
    {
        super(parent, modal);
        initComponents();
        this.adminControlador = adminControlador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spnStock = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Marca");

        jLabel4.setText("Stock");

        jLabel5.setText("Precio");

        btnGuardar.setText("Registrar Producto");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("En caso de que no se conoce la marca, ingrese la palabra \"Genérico\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //lo que se ejecutara al hacer click en el boton de "registrar producto"
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
       String codigo = txtCodigo.getText().trim();
       String nombre = txtNombre.getText().trim();
       String marca = txtMarca.getText().trim();
       int stock;
       double precio;
       
       ProductoDAO dao = new ProductoDAO();
       
       //Verificacion de codigo
        if (codigo.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Este campo no puede ser vacío");
            return;
        }
        if (dao.existeProductoPorCodigo(codigo)) 
        {
            JOptionPane.showMessageDialog(this, "El código del producto ya existe en la base de datos.");
            return;
        }
       
       //Verificacion de nombre
        if (nombre.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Este campo no puede ser vacío");
            return;
}
        if (dao.existeProductoPorNombre(nombre)) 
        {
            JOptionPane.showMessageDialog(this, "Ya existe un producto con ese nombre en la base de datos.");
            return;
        }
        
        //Verificacion de marca
        marca = txtMarca.getText().trim();
        if (marca.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Si no se conoce la marca ingresar la palabra \"Genérico\"");
            return;
        }
        
        //Verificacion de stock
        try 
        {
            
            stock = (int) spnStock.getValue();
            if (stock <= 0) 
            {
                JOptionPane.showMessageDialog(this, "Se ha ingresado un dato incorrecto");
                return;
            }
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Se a ingresado un dato incorrecto");
            return;
        }
        
        //Verificacion de precio
        String precioTexto = txtPrecio.getText().trim();
        if (precioTexto.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "El precio no puede ser nulo");
            return;
        }
        
        try 
        {
            precio = Double.parseDouble(precioTexto);
            if (precio <= 0)
            {
                JOptionPane.showMessageDialog(this, "El número que se ha ingresado no es positivo");
                return;
            }
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "El precio del producto debe ser de tipo double");
            return;
        }
        
        //Creacion y registro
        Producto nuevo = new Producto(codigo, nombre, marca, stock, precio);
        
        if (dao.registrarProducto(nuevo))
        {
            JOptionPane.showMessageDialog(this, "Producto registrado correctamente en la base de datos.");
            this.dispose(); // Cierra el formulario solo si el registro fue exitoso
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Error al registrar el producto en la base de datos.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner spnStock;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}