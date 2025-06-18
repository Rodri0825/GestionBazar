package Main;

import Controladores.AdministradorControlador;
import Controladores.EmpleadoControlador;
import Objetos.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        AdministradorControlador adminControl = new AdministradorControlador();
        EmpleadoControlador empleadoControl = new EmpleadoControlador();

        Administrador admin = new Administrador(true, "Luciana", "12345678", "999999999", 3000);
        Empleado emp = new Empleado(false, "Carlos", "87654321", "988888888", 1500, new ArrayList<>(), admin);
        
        Usuario uAdmin = new Usuario("admin", "1234", admin);
        Usuario uEmpleado = new Usuario("carlos", "5678", emp);

        adminControl.registrarUsuario(uAdmin);
        adminControl.registrarUsuario(uEmpleado);
        empleadoControl.registrarEmpleado(emp);

        boolean salirSistema = false;

        while (!salirSistema) 
        {
            System.out.println("\n==== SISTEMA BAZAR ====");
            System.out.print("Usuario: ");
            String user = sc.nextLine();
            System.out.print("Contraseña: ");
            String pass = sc.nextLine();

            Usuario login = adminControl.login(user, pass);

            if (login != null) 
            {
                Trabajador persona = login.getTrabajador();
                System.out.println("\nBienvenido, " + persona.getNombreTrabajador());

                if (login.esAdministrador()) 
                {
                    int opcion;
                    do {
                        System.out.println("\n--- MENÚ ADMINISTRADOR ---");
                        System.out.println("1. Registrar producto");
                        System.out.println("2. Mostrar productos");
                        System.out.println("3. Registrar empleado");
                        System.out.println("4. Mostrar empleados");
                        System.out.println("9. Cerrar sesión");
                        System.out.println("0. Salir del sistema");
                        System.out.print("Opción: ");
                        opcion = sc.nextInt(); sc.nextLine();

                        switch (opcion) {
                            case 1:
                                String codigo;
                                do {
                                    System.out.print("Código: ");
                                    codigo = sc.nextLine();
                                    if (codigo.isEmpty()) System.out.println("El código no puede estar vacío.");
                                } while (codigo.isEmpty());

                                String nombre;
                                do {
                                    System.out.print("Nombre: ");
                                    nombre = sc.nextLine();
                                    if (nombre.isEmpty()) System.out.println("El nombre no puede estar vacío.");
                                } while (nombre.isEmpty());

                                System.out.print("Marca: ");
                                String marca = sc.nextLine();

                                int stock;
                                do {
                                    System.out.print("Stock: ");
                                    stock = sc.nextInt();
                                    if (stock < 0) System.out.println("El stock no puede ser negativo.");
                                } while (stock < 0);

                                double precio;
                                do {
                                    System.out.print("Precio: ");
                                    precio = sc.nextDouble(); sc.nextLine();
                                    if (precio <= 0) System.out.println("El precio debe ser mayor a cero.");
                                } while (precio <= 0);

                                Producto nuevo = new Producto(codigo, nombre, marca, stock, precio);
                                adminControl.registrarProducto(nuevo);
                                break;
                            case 2:
                                adminControl.mostrarProductos();
                                break;
                            case 3:
                                String n;
                                do {
                                    System.out.print("Nombre: ");
                                    n = sc.nextLine();
                                    if (n.isEmpty()) System.out.println("El nombre no puede estar vacío.");
                                } while (n.isEmpty());

                                String dni;
                                do {
                                    System.out.print("DNI: ");
                                    dni = sc.nextLine();
                                    if (dni.isEmpty()) System.out.println("El DNI no puede estar vacío.");
                                } while (dni.isEmpty());

                                String tel;
                                do {
                                    System.out.print("Teléfono: ");
                                    tel = sc.nextLine();
                                    if (tel.isEmpty()) System.out.println("El teléfono no puede estar vacío.");
                                } while (tel.isEmpty());

                                System.out.print("Sueldo: ");
                                double suel = sc.nextDouble(); sc.nextLine();

                                Empleado nuevoEmp = new Empleado(false, n, dni, tel, suel, new ArrayList<>(), (Administrador) persona);
                                empleadoControl.registrarEmpleado(nuevoEmp);
                                break;
                            case 4:
                                empleadoControl.mostrarEmpleados();
                                break;
                            case 9:
                                System.out.println("Cerrando sesión...");
                                break;
                            case 0:
                                System.out.println("Saliendo del sistema...");
                                salirSistema = true;
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (opcion != 9 && !salirSistema);
                } 
                else 
                {
                    int opcion;
                    do {
                        System.out.println("\n--- MENÚ EMPLEADO ---");
                        System.out.println("1. Registrar venta");
                        System.out.println("2. Ver mis ventas");
                        System.out.println("9. Cerrar sesión");
                        System.out.println("0. Salir del sistema");
                        System.out.print("Opción: ");
                        opcion = sc.nextInt(); sc.nextLine();

                        switch (opcion) {
                            case 1:
                                adminControl.mostrarProductos();
                                List<Producto> productosVenta = new ArrayList<>();
                                String cod;
                                do {
                                    System.out.print("Código del producto a vender ('fin' para terminar): ");
                                    cod = sc.nextLine();
                                    if (!cod.equalsIgnoreCase("fin")) {
                                        Producto p = null;
                                        for (Producto prod : adminControl.obtenerProductos()) {
                                            if (prod.getCodigo().equalsIgnoreCase(cod)) {
                                                p = prod;
                                                break;
                                            }
                                        }
                                        if (p != null && p.getStock() > 0) {
                                            productosVenta.add(p);
                                        } else {
                                            System.out.println("Producto no encontrado o sin stock.");
                                        }
                                    }
                                } while (!cod.equalsIgnoreCase("fin"));

                                if (!productosVenta.isEmpty()) {
                                    empleadoControl.registrarVenta((Empleado) persona, productosVenta);
                                } else {
                                    System.out.println("No se registró la venta.");
                                }
                                break;
                            case 2:
                                empleadoControl.mostrarVentasPorEmpleado(persona.getNombreTrabajador());
                                break;
                            case 9:
                                System.out.println("Cerrando sesión...");
                                break;
                            case 0:
                                System.out.println("Saliendo del sistema...");
                                salirSistema = true;
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (opcion != 9 && !salirSistema);
                }
            } 
            else 
            {
                System.out.println("Credenciales incorrectas.");
            }
        }
    }
}
