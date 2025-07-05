package Controladores;

import Objetos.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class EmpleadoDAO 
{
    public boolean registrarEmpleado(Empleado emp) {
        String sql = "INSERT INTO empleados (dni, nombre, telefono, rol, sueldo, codigo_empleado) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, emp.getDni());
            stmt.setString(2, emp.getNombre());
            stmt.setString(3, emp.getTelefono());
           stmt.setBoolean(4, emp.esAdmin());
            stmt.setDouble(5, emp.getSueldo());
            stmt.setString(6, emp.getCodigoEmpleado());

            int filas = stmt.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            System.err.println("Error al registrar empleado: " + e.getMessage());
            return false;
        }
    }

    public boolean existeDNI(String dni) {
        String sql = "SELECT COUNT(*) FROM empleados WHERE dni = ?";
        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, dni);
            var rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar DNI: " + e.getMessage());
        }
        return false;
    }

    public boolean existeCodigoEmpleado(String codigo) 
    {
        String sql = "SELECT COUNT(*) FROM empleados WHERE codigo_empleado = ?";
        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setString(1, codigo);
            var rs = stmt.executeQuery();
            if (rs.next()) 
            {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) 
        {
            System.err.println("Error al verificar código empleado: " + e.getMessage());
        }
        return false;
    }
    public boolean existeNombre(String nombre) 
    {
        String sql = "SELECT COUNT(*) FROM empleados WHERE nombre = ?";
        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, nombre);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) 
        {
            return rs.getInt(1) > 0;
        }
        } catch (SQLException e) 
        {
        System.err.println("Error al verificar nombre: " + e.getMessage());
        }
        return false;
}

    public boolean existeTelefono(String telefono) 
    {
        String sql = "SELECT COUNT(*) FROM empleados WHERE telefono = ?";
        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setString(1, telefono);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) 
            {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar teléfono: " + e.getMessage());
        }
        return false;
    }
    public List<Empleado> obtenerTodosLosEmpleados() 
    {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM empleados";
    
        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql);ResultSet rs = stmt.executeQuery()) 
        {
            while (rs.next()) 
            {
                boolean esAdmin = rs.getBoolean("rol");
                String nombre = rs.getString("nombre");
                String dni = rs.getString("dni");
                String telefono = rs.getString("telefono");
                double sueldo = rs.getDouble("sueldo");
                String codigo = rs.getString("codigo_empleado");
            
                Empleado emp = new Empleado(esAdmin, nombre, dni, telefono, sueldo, codigo);
                lista.add(emp);
            }
        } catch (SQLException e) 
        {
            System.err.println("Error al obtener empleados: " + e.getMessage());
        }
        return lista;
    }
    public boolean registrarCredenciales(String codigoEmpleado, String usuario, String contrasena, boolean esAdmin) 
    {
        String sql = "INSERT INTO usuarios (nombre_usuario, contrasena, es_admin, empleado_id) VALUES (?, ?, ?, (SELECT id FROM empleados WHERE codigo_empleado = ?))";

        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);
            stmt.setBoolean(3, esAdmin);
            stmt.setString(4, codigoEmpleado);

        int filas = stmt.executeUpdate();
        return filas > 0;
    } catch (SQLException e) {
        System.err.println("Error al registrar credenciales: " + e.getMessage());
        return false;
    }
    }
}

