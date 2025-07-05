package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB 
{
    
    //Configuracion de la base de datos
    private static final String url = "jdbc:mysql://localhost:3306/DBBazar?useSSL=false&serverTimezone=UTC";
    private static final String usuario = "root";
    private static final String contraseña = "";
    
    // Método para obtener la conexión
    public static Connection getConnection()
    {
        Connection conexion = null;
        
        try 
        {
            // Establecemos la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos\n" + e.getMessage(), "Error de Conexión", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
    //Metodo para finalizar la conexion
    public static void cerrarConexion(Connection conexion) 
    {
        if (conexion != null) 
        {
            try 
            {
                conexion.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
        
}
