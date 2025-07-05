package Controladores;

import Objetos.Producto;
import Objetos.Usuario;
import java.util.ArrayList;
import java.util.List;

public class AdministradorControlador 
{
    private List<Producto> productos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public AdministradorControlador() 
    {
    }

    public void registrarProducto(Producto producto) 
    {
        for (Producto p : productos) 
        {
            if (p.getCodigo().equalsIgnoreCase(producto.getCodigo())) 
            {
                System.out.println("Error: Ya existe un producto con ese código.");
                return;
            }
        }
        productos.add(producto);
    }

    public Producto buscarProductoPorNombre(String nombre) 
    {
        for (Producto p : productos) 
        {
            if (p.getNombre().equalsIgnoreCase(nombre)) 
            {
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(String codigo) 
    {
        Producto encontrado = null;
        for (Producto p : productos) 
        {
            if (p.getCodigo().equalsIgnoreCase(codigo)) 
            {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) 
        {
            productos.remove(encontrado);
            System.out.println("Producto eliminado correctamente.");
        } 
        else 
        {
            System.out.println("Producto no encontrado.");
        }
    }

    public void mostrarProductos() 
    {
        if (productos.isEmpty()) 
        {
            System.out.println("No hay productos registrados.");
        } 
        else 
        {
            for (Producto p : productos) 
            {
                System.out.println(p.toString());
            }
        }
    }

    public List<Producto> obtenerProductos() 
    {
        return productos;
    }

    public void registrarUsuario(Usuario usuario) 
    {
        usuarios.add(usuario);
    }

    public Usuario login(String nombreUsuario, String contraseña) 
    {
        for (Usuario u : usuarios) 
        {
            if (u.validarCredenciales(nombreUsuario, contraseña)) 
            {
                return u;
            }
        }
        return null;
    }

    public void mostrarUsuarios() 
    {
        for (Usuario u : usuarios) 
        {
            System.out.println(u.toString());
        }
    }

    public List<Usuario> obtenerUsuarios()
    {
        return usuarios;
    }
    public Producto buscarProductoPorCodigo(String codigo) {
    for (Producto p : productos) 
    {
        if (p.getCodigo().equalsIgnoreCase(codigo)) 
        {
            return p;
        }
    }
        return null;
    }
}
