package Objetos;
public class Usuario 
{
    private String nombreUsuario;
    private String contraseña;
    private Trabajador trabajador;
    
     public Usuario() 
    {
    }

    public Usuario(String nombreUsuario, String contraseña, Trabajador trabajador) 
    {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.trabajador = trabajador;
    }

    public String getNombreUsuario() 
    {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) 
    {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() 
    {
        return contraseña;
    }

    public void setContraseña(String contraseña) 
    {
        this.contraseña = contraseña;
    }

    public Trabajador getTrabajador() 
    {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) 
    {
        this.trabajador = trabajador;
    }

    public boolean validarCredenciales(String usuario, String clave) 
    {
        return this.nombreUsuario.equals(usuario) && this.contraseña.equals(clave);
    }

    public boolean esAdministrador() 
    {
        return trabajador.isRol();
    }

    @Override
    public String toString() 
    {
        return "Usuario:\n" +
                "nombreUsuario: " + nombreUsuario +
                ", rol: " + (trabajador.isRol() ? "Administrador" : "Empleado") +
                ", nombre: " + trabajador.getNombreTrabajador();
    }
}
