import java.util.ArrayList;

/**
 * Clase que describe a los usuarios de tipo Profesor
 * Clase heredada de la clase Usuarios
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
public class Profesor extends Usuarios {
    /**
     * Constructor de la clase que se hereda de Usuarios
     * @param nom (String) nombre completo del profesor
     * @param tel (String[]) lista de telefonos
     * @param cor (String) correo
     * @param usu (String) usuario
     * @param con (String) contraseña
     */
    public Profesor(String nom, String[] tel, String cor, String usu, String con) {
        super(nom, tel, cor, usu, con);
    }



    public static boolean validarProfesor(ArrayList<Profesor> listaProfesor,String username,String pass){
        for(Profesor c: listaProfesor){
            if((c.getUsuario().equals(username)) && (c.getContrasenia().equals(pass))){
                return true;
            }
        }
        return false;
    }

}