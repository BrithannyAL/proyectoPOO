import java.util.ArrayList;

/**
 * Clase que describe a los usuarios de tipo Profesor
 * Clase heredada de la clase Usuarios
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
public class Profesor extends Usuarios {
    /**
     * Atributos
     */
    private ArrayList<Profesor> profesores;
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
    /**
     * Deuelve la lista de los usuarios de tipo profesor registrados
     * @return profesores (ArrayList<Profesor>)
     */
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
    /**
     * Permite agregar un nuevo usuario de tipo profesor a la lista de profesores de la clase
     * @param nom (String) nombre completo del profesor
     * @param tel (String[]) lista de telefonos
     * @param cor (String) correo
     * @param usu (String) usuario
     * @param con (String) contraseña
     */
    public void setProfesores(String nom, String[] tel, String cor, String usu, String con) {
        this.profesores.add(new Profesor(nom, tel, cor, usu, con));
    }
}
