
package Objetos;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venta 
{
     private List<Producto> productosVendidos = new ArrayList<>();
    private Empleado empleado;
    private LocalDateTime fecha;
    private double total;

    public Venta() 
    {
    }

    public Venta(List<Producto> productosVendidos, Empleado empleado) 
    {
        this.productosVendidos = productosVendidos;
        this.empleado = empleado;
        this.fecha = LocalDateTime.now();
        this.total = calcularTotal();
    }

    public double calcularTotal() 
    {
        double suma = 0;
        for (Producto p : productosVendidos) 
        {
            suma += p.getPrecio();
        }
        return suma;
    }

    public double getTotal() 
    {
        return total;
    }

    public Empleado getEmpleado() 
    {
        return empleado;
    }

    public LocalDateTime getFecha() 
    {
        return fecha;
    }

    public List<Producto> getProductosVendidos() 
    {
        return productosVendidos;
    }

    @Override
    public String toString() 
    {
        DateTimeFormatter nuevoForm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Venta\n" +
                "Empleado: " + empleado.getNombreTrabajador() +
                "\nFecha: " + fecha.format(nuevoForm) +
                "\ntotal: " + total +
                "\nProductos vendidos: " + productosVendidos;
    }
}
