package Objetos;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Trabajador 
{
    private List<Empleado> empleados = new ArrayList<>();

    public Administrador() 
    {
        super();
    }

    public Administrador(boolean rol, String nombre, String dni, String telefono, double sueldo) 
    {
        super(rol, nombre, dni, telefono, sueldo);
    }

    public List<Empleado> getEmpleados() 
    {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) 
    {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado empleado) 
    {
        empleados.add(empleado);
    }

    @Override
    public String toString() 
    {
        return "Administrador: \n" +
                "nombre: " + getNombreTrabajador() +
                ", DNI: " + getDNI() +
                ", telefono: " + getTelefono() +
                ", sueldo: " + getSueldo() +
                ", empleados a cargo: " + empleados.size();
    }
}
