package Controladores;

import Objetos.Empleado;
import Objetos.Producto;
import Objetos.Venta;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoControlador 
{
    private List<Empleado> empleados = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();

    public EmpleadoControlador() 
    {
    }

    public void registrarEmpleado(Empleado empleado) 
    {
        empleados.add(empleado);
    }

    public Empleado buscarEmpleadoPorNombre(String nombre) 
    {
        for (Empleado emp : empleados) 
        {
            if (emp.getNombreTrabajador().equalsIgnoreCase(nombre)) 
            {
                return emp;
            }
        }
        return null;
    }

    public void mostrarEmpleados() 
    {
        if (empleados.isEmpty()) 
        {
            System.out.println("No hay empleados registrados.");
        } 
        else 
        {
            for (Empleado emp : empleados) 
            {
                System.out.println(emp.toString());
            }
        }
    }

    public List<Empleado> obtenerEmpleados()
    {
        return empleados;
    }

    public void registrarVenta(Empleado empleado, List<Producto> productosVendidos) 
    {
        Venta venta = new Venta(productosVendidos, empleado);
        ventas.add(venta);
        empleado.getVentas().addAll(productosVendidos); // historial del empleado

        for (Producto p : productosVendidos) 
        {
            p.setStock(p.getStock() - 1); // ajustar si usas cantidad
        }

        System.out.println("Venta registrada correctamente.");
    }

    public void mostrarVentasPorEmpleado(String nombreEmpleado) 
    {
        boolean hayVentas = false;
        for (Venta v : ventas) 
        {
            if (v.getEmpleado().getNombreTrabajador().equalsIgnoreCase(nombreEmpleado)) 
            {
                System.out.println(v.toString());
                hayVentas = true;
            }
        }

        if (!hayVentas) 
        {
            System.out.println("No se encontraron ventas para ese empleado.");
        }
    }

    public List<Venta> obtenerVentas() 
    {
        return ventas;
    }
}
