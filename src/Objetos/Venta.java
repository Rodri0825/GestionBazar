
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

    // Campos para registrar en BD
    private String codigoProducto;
    private int cantidad;
    private String fechaVenta;

    public Venta() 
    {
    }

    // Constructor original
    public Venta(List<Producto> productosVendidos, Empleado empleado) 
    {
        this.productosVendidos = productosVendidos;
        this.empleado = empleado;
        this.fecha = LocalDateTime.now();
        this.total = calcularTotal();
    }

    // Constructor para registrar una venta simple en BD
    public Venta(String codigoProducto, int cantidad, String fechaVenta) 
    {
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
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

    public String getCodigoProducto() 
    {
        return codigoProducto;
    }

    public int getCantidad() 
    {
        return cantidad;
    }

    public String getFechaVenta() 
    {
        return fechaVenta;
    }

    @Override
    public String toString() 
    {
        DateTimeFormatter nuevoForm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Venta\n" +
                "Empleado: " + (empleado != null ? empleado.getNombreTrabajador() : "N/A") +
                "\nFecha: " + (fecha != null ? fecha.format(nuevoForm) : "N/A") +
                "\nTotal: " + total +
                "\nProductos vendidos: " + productosVendidos;
    }
}
