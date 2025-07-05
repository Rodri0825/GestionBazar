package Controladores;

import Objetos.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO 
{
    
    public boolean registrarProducto(Producto productos) 
    {
        String sql = "INSERT INTO productos (codigo, nombre, marca, stock, precio) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setString(1, productos.getCodigo());
            stmt.setString(2, productos.getNombre());
            stmt.setString(3, productos.getMarca());
            stmt.setInt(4, productos.getStock());
            stmt.setDouble(5, productos.getPrecio());
            
            int filasInsertadas = stmt.executeUpdate();
            return filasInsertadas > 0;
            
        } catch (SQLException e) 
        {
            System.err.println("Error al registrar producto: " + e.getMessage());
            return false;
        }
    }
    public List<Producto> obtenerTodosLosProductos() 
    {
        List<Producto> lista = new ArrayList<>();

        String sql = "SELECT codigo, nombre, marca, stock, precio FROM productos"; // Asegúrate de usar el nombre correcto de la tabla

        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql);ResultSet rs = stmt.executeQuery()) 
        {
        while (rs.next()) 
        {
            String codigo = rs.getString("codigo");
            String nombre = rs.getString("nombre");
            String marca = rs.getString("marca");
            int stock = rs.getInt("stock");
            double precio = rs.getDouble("precio");

            Producto productos = new Producto(codigo, nombre, marca, stock, precio);
            lista.add(productos);
        }

    } catch (Exception e) 
    {
        System.err.println("Error al obtener productos: " + e.getMessage());
    }
        return lista;
    }
    public boolean existeProductoPorCodigo(String codigo) 
    {
        String sql = "SELECT COUNT(*) FROM productos WHERE codigo = ?";
        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
        stmt.setString(1, codigo);
        ResultSet rs = stmt.executeQuery();
        if (rs.next())
        {
            return rs.getInt(1) > 0;
        }
    } catch (SQLException e) 
    {
        System.err.println("Error al verificar existencia por código: " + e.getMessage());
    }
        return false;
    }
    public boolean existeProductoPorNombre(String nombre) 
    {
    String sql = "SELECT COUNT(*) FROM productos WHERE nombre = ?";
    try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) 
    {
        stmt.setString(1, nombre);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) 
        {
            return rs.getInt(1) > 0;
        }
    } catch (SQLException e) 
    {
        System.err.println("Error al verificar existencia por nombre: " + e.getMessage());
    }
        return false;
    }
    public boolean actualizarStockYPrecio(String codigo, int nuevoStock, double nuevoPrecio) 
    {
        String sql = "UPDATE productos SET stock = ?, precio = ? WHERE codigo = ?";

        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setInt(1, nuevoStock);
            stmt.setDouble(2, nuevoPrecio);
            stmt.setString(3, codigo);

            int filasActualizadas = stmt.executeUpdate();
            return filasActualizadas > 0;
        } catch (SQLException e) 
        {
            System.err.println("Error al actualizar producto: " + e.getMessage());
            return false;
        }
    }
    public Producto buscarProductoPorCodigo(String codigo) 
    {
        String sql = "SELECT * FROM productos WHERE codigo = ?";
    
        try (Connection conn = ConexionDB.getConnection();
                
            PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setString(1, codigo);
            ResultSet rs = stmt.executeQuery();
        
            if (rs.next()) 
            {
                return new Producto(
                rs.getString("codigo"),
                rs.getString("nombre"),
                rs.getString("marca"),
                rs.getInt("stock"),
                rs.getDouble("precio"));
            }
        } catch (SQLException e) 
        {
            System.err.println("Error al buscar producto por código: " + e.getMessage());
        }
        return null;
    }
}
