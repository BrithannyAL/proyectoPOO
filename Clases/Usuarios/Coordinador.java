import java.util.ArrayList;

/**
 * Clase que describe el usuario de tipo coordinador y sus respectivas funciones (comportamientos)
 * Clase que hereda la clase Usuarios
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
public class Coordinador extends Usuarios {
    /**
     * Atributos
     */
    private ArrayList<Coordinador> coordinadores;   //Lista de usuarios de tipo coordinador
    /**
     * Constructor de la clase que se hereda de Usuarios
     * @param nom (String)
     * @param tel (String[])
     * @param cor (String)
     * @param usu (String)
     * @param con (String)
     */
    public Coordinador(String nom, String[] tel, String cor, String usu, String con) {
        super(nom, tel, cor, usu, con);
    }
    /**
     * Método que permite agregar un nuevo cordinador a la lista de usuarios coordinadores de la clase.
     * @param nom (String)
     * @param tel (String[])
     * @param cor (String)
     * @param usu (String)
     * @param con (String)
     */
    public void crearUsuarioCoordinador(String nom, String[] tel, String cor, String usu, String con){
        Coordinador nuevo = new Coordinador(nom, tel, cor, usu, con);
        this.coordinadores.add(nuevo);
    }
}
