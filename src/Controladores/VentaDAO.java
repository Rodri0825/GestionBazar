package Controladores;
    
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class VentaDAO 
{
    public boolean registrarVenta(String codigoProducto, int cantidad, String fecha, String codigoEmpleado) 
    {
        String sqlInsert = "INSERT INTO ventas (codigo_producto, cantidad, fecha, codigoEmpleado) VALUES (?, ?, ?, ?)";
        String sqlSelectStock = "SELECT stock FROM productos WHERE codigo = ?";
        String sqlUpdateStock = "UPDATE productos SET stock = ? WHERE codigo = ?";

        try (Connection conn = ConexionDB.getConnection()) 
        {
            conn.setAutoCommit(false); // iniciamos la transacción

            // Verificar stock actual
            int stockActual = 0;
            try (PreparedStatement stmtSelect = conn.prepareStatement(sqlSelectStock)) 
            {
                stmtSelect.setString(1, codigoProducto);
                ResultSet rs = stmtSelect.executeQuery();
                
                if (rs.next()) 
                {
                    stockActual = rs.getInt("stock");
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "El producto no existe.");
                    conn.rollback();
                    return false;
                }
            }
            if (stockActual < cantidad) 
            {
                JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible.");
                conn.rollback();
                return false;
            }

            // Registrar venta
            try (PreparedStatement stmtInsert = conn.prepareStatement(sqlInsert)) 
            {
                stmtInsert.setString(1, codigoProducto);
                stmtInsert.setInt(2, cantidad);
                stmtInsert.setString(3, fecha);
                stmtInsert.setString(4, codigoEmpleado);
                stmtInsert.executeUpdate();
            }

            // Actualizar stock
            int nuevoStock = stockActual - cantidad;
            try (PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdateStock)) 
            {
                stmtUpdate.setInt(1, nuevoStock);
                stmtUpdate.setString(2, codigoProducto);
                stmtUpdate.executeUpdate();
            }

            conn.commit(); // confirmar todo
            return true;

        } catch (SQLException e) 
        {
            System.err.println("Error al registrar venta o actualizar stock: " + e.getMessage());
            return false;
        }
    }
}
