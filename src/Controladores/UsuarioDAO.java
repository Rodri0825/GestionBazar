package Controladores;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO 
{
    public boolean registrarCredenciales(String codigoEmpleado, String usuario, String contrasena, boolean esAdmin) 
    {
        String sql = "INSERT INTO usuarios (nombre_usuario, contrasena, es_admin, empleado_id) " +
                     "VALUES (?, ?, ?, (SELECT id FROM empleados WHERE codigo_empleado = ?))";

        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);
            stmt.setBoolean(3, esAdmin);
            stmt.setString(4, codigoEmpleado);

            int filas = stmt.executeUpdate();
            return filas > 0;
        } catch (SQLException e) 
        {
            System.err.println("Error al registrar credenciales: " + e.getMessage());
            return false;
        }
    }
    public boolean validarCredenciales(String usuario, String contrasena) 
    {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";
    
        try (Connection conn = ConexionDB.getConnection();PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
        
            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) 
            {
                return rs.getInt(1) > 0; // Si hay al menos una coincidencia
        }   
        } catch (SQLException e) 
        {
            System.err.println("Error al validar credenciales: " + e.getMessage());
        }
        return false;
    }
    public String obtenerNombrePorUsuario(String usuario) 
    {
        String sql = "SELECT e.nombre FROM usuarios u " + "JOIN empleados e ON u.empleado_id = e.id " + "WHERE u.nombre_usuario = ?";

        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setString(1, usuario);
            ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) 
        {
            return rs.getString("nombre");
        }
        } catch (SQLException e) 
        {
            System.err.println("Error al obtener nombre del usuario: " + e.getMessage());
        }
        return null;
    }
}
