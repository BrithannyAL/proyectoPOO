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
     * @param nom (String)
     * @param tel (String[])
     * @param cor (String)
     * @param usu (String)
     * @param con (String)
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
     * Permite agregar un nuevo profesor a la lista de profesores registrados
     * @param prof (Profesor)
     */
    public void setProfesores(Profesor prof) {
        this.profesores.add(prof);
    }
}
