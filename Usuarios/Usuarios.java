package Usuarios;

import java.io.Console;
import java.util.ArrayList;

/**
 * Clase de describe a los usuarios que pueden utilizar la plataforma de gestión
 * de registros académicos
 * 
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
abstract public class Usuarios {
    /**
     * Atributos
     */
    protected String nombre; // Nombre completo del usuario
    protected String[] telefonos; // Lista de teléfonos
    protected String correo; // Correo
    protected String usuario; // Usuario con el cual ingresa al sistema
    protected String contrasenia; // Contraseña de su cuenta

    /**
     * Contructor de la clase
     * 
     * @param nom (String): Nombre completo
     * @param tel (String[]): Lista de teléfonos
     * @param cor (String): Correo electrónico
     * @param usu (String): Nombre de usuario
     * @param con (String): Contraseña de usuario
     */
    public Usuarios(String nom, String[] tel, String cor, String usu, String con) {
        this.nombre = nom;
        this.telefonos = tel;
        this.correo = cor;
        this.usuario = usu;
        this.contrasenia = con;
    }

    /**
     * Nos devuelve el nombre completo del usuario.
     * 
     * @return nombre (String)
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite asignarle el nombre completo al usuario.
     * 
     * @param nombre (String)
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la lista de teléfonos del usuario.
     * 
     * @return telefonos (String[])
     */
    public String[] getTelefonos() {
        return telefonos;
    }

    /**
     * Permite editar los número que ya existen en la lista de telefonos del usuario
     * y añadir más a la lista. La función pregunta al usuario (uno a uno) cuales
     * números desea
     * editar de la lista, y si el usuario pide añadir números, la fucnión permite
     * agregar la cantidad
     * de nuevos números que el usuario desee.
     */
    public void setTelefonos() {
        Console console = System.console();
        System.out.println("1.  Editar los números existentes");
        System.out.println("2.  Agregar un nuevo número");
        byte opcion = Byte.parseByte(console.readLine("Digite la opción que desea ejecutar: "));

        switch (opcion) {
            case 1:
                for (String t : getTelefonos()) {
                    System.out.println("¿Desea cambiar el número " + t + "? (1. SÍ / 2. NO)");
                    byte resp = Byte.parseByte(console.readLine("Digíte su respuesta: "));
                    if (resp == 1) {
                        t = console.readLine("Digíte el nuevo número: ");
                    }
                }
                System.out.println("Ya no quedan más números en la lista de este usuario.");
                break;

            case 2:
                boolean inicio = true;
                while (inicio) {
                    String nuevoNumero = console.readLine("Escriba el nuevo número que desea agregar: ");
                    int largo = this.telefonos.length;
                    this.telefonos[largo + 1] = nuevoNumero;
                    byte resp = Byte.parseByte(console.readLine("¿Desea añadir otro número? (1. SÍ / 2. NO): "));
                    if (resp == 2) {
                        inicio = false;
                    }
                }
            default:
                break;
        }
    }

    /**
     * Obtiene el correo electronico del usuario.
     * 
     * @return correo (String)
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Permite asignarle o cambiarle el correo al usuario
     * 
     * @param correo (String)
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el nombre de usuario
     * 
     * @return usuario (String)
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Permite asignarle o cambiarle el nombre de usuario
     * 
     * @param usuario (String)
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña del usuario
     * 
     * @return contrasenia (String)
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Permite cambiarle la contraseña al usuario
     * 
     * @param contrasenia
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public static byte validadUsuario(ArrayList<Usuarios> usuarios, String username, String pass) {
        for (Usuarios c : usuarios) {
            if ((c.getUsuario().equals(username)) && (c.getContrasenia().equals(pass))) {
                if (c.getClass() == Coordinador.class) {
                    return 0;
                } else if (c.getClass() == Profesor.class) {
                    return 1;
                }
            }
        }
        return 2;
    }

}