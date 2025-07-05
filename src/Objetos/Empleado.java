package Objetos;

public class Empleado extends Trabajador
{
    private boolean esAdmin;
    private String nombre;
    private String dni;
    private String telefono;
    private double sueldo;
    private String codigoEmpleado;

    public Empleado() {}
    
    public Empleado(boolean esAdmin, String nombre, String dni, String telefono, double sueldo, String codigoEmpleado) {
        this.esAdmin = esAdmin;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.codigoEmpleado = codigoEmpleado;
    }

    public boolean esAdmin() {
        return esAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }
}
