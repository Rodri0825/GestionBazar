package Objetos;
public class Trabajador
{
    private boolean rol;
    private String nombreTrabajador;
    private String DNI;
    private String telefono;
    private double sueldo;
    private String codigo;

    public Trabajador(){}

    public Trabajador(boolean rol, String nombreTrabajador, String DNI, String telefono, double sueldo, String codigo) {
        this.rol = rol;
        this.nombreTrabajador = nombreTrabajador;
        this.DNI = DNI;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.codigo = codigo;
    }

    public boolean isRol() {
        return rol;
    }

    public void setRol(boolean rol) {
        this.rol = rol;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getCodigo()
    {
        return codigo;
    }
    public void setCodigo(String codigo) 
    {
    this.codigo = codigo;
    }
}
