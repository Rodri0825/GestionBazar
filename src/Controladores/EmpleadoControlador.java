package Controladores;

import Objetos.Empleado;
import Objetos.Venta;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoControlador 
{
    private List<Empleado> empleados = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();

    public EmpleadoControlador() {}

    public void registrarEmpleado(Empleado empleado) 
    {
        empleados.add(empleado);
    }

    public boolean nombreExiste(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombreTrabajador().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean dniExiste(String dni) {
        for (Empleado e : empleados) {
            if (e.getDNI().equalsIgnoreCase(dni)) {
                return true;
            }
        }
        return false;
    }

    public boolean telefonoExiste(String telefono) {
        for (Empleado e : empleados) {
            if (e.getTelefono().equalsIgnoreCase(telefono)) {
                return true;
            }
        }
        return false;
    }

    public boolean codigoExiste(String codigo) {
        for (Empleado e : empleados) {
            if (e.getCodigo() != null && e.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }
}
