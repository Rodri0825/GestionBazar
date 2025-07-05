package Test;

import Controladores.ConexionDB;
import java.sql.Connection;

public class ProbarConexion 
{
    public static void main(String[] args) 
    {
        Connection conn = ConexionDB.getConnection();
        if (conn != null) 
        {
            System.out.println("✔ Conexión a la base de datos exitosa.");
            ConexionDB.cerrarConexion(conn);
        } else 
        {
            System.out.println("✘ No se pudo conectar.");
        }
    }
}
