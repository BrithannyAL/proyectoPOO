package Clases;
import java.util.ArrayList;

/**
 * Clase que describe el usuario de tipo coordinador y sus respectivas funciones (comportamientos)
 * Clase que hereda la clase Usuarios
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
public class Coordinador extends Usuarios {
    /**
     * Constructor de la clase que se hereda de Usuarios
     * @param nom (String) nombre completo
     * @param tel (String[]) lista de telefonos
     * @param cor (String) correo
     * @param usu (String) usuario
     * @param con (String) contraseña
     */
    public Coordinador(String nom, String[] tel, String cor, String usu, String con) {
        super(nom, tel, cor, usu, con);
    }

    public static boolean validadCoordinador(ArrayList<Coordinador> listaCoordinador,String username,String pass){
        for(Coordinador c: listaCoordinador){
            if((c.getUsuario().equals(username)) && (c.getContrasenia().equals(pass))){
                return true;
            }
        }
        return false;
    }
}