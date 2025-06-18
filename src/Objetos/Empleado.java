package Objetos;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Trabajador
{
    private List<Producto> ventas = new ArrayList<>();
    private Administrador Jefe;

    public Empleado() {
    }

    public Empleado(boolean rol, String nombreTrabajador, String DNI, String telefono, double sueldo, List<Producto> ventas, Administrador administrador) {
        super(rol, nombreTrabajador, DNI, telefono, sueldo);
        this.ventas = ventas;
        this.Jefe = administrador;
    }

    public List<Producto> getVentas() {
        return ventas;
    }

    public void setVentas(List<Producto> ventas) {
        this.ventas = ventas;
    }

    public Administrador getJefe() {
        return Jefe;
    }

    public void setJefe(Administrador administrador) {
        this.Jefe = administrador;
    }

    @Override
    public String toString() {
        return "Empleado: \n" +
                "Ventas: " + getVentas() +
                ", jefe: " + getJefe() +
                "\n\nVentas: " + getVentas() +
                ", rol: " + (isRol() ? "Administrador" : "Empleado") +
                "\nNombre de trabajador: " + getNombreTrabajador() +
                ", DNI: " + getDNI() +
                ", telefono: " + getTelefono() +
                ", sueldo: " + getSueldo();
    }
}
