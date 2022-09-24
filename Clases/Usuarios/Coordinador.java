/**
 * Bibliotecas externas
 */
import java.sql.Date;
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
     * @param nom (String) nombre completo
     * @param tel (String[]) lista de telefonos
     * @param cor (String) correo
     * @param usu (String) usuario
     * @param con (String) contraseña
     */
    public Coordinador(String nom, String[] tel, String cor, String usu, String con) {
        super(nom, tel, cor, usu, con);
    }
    /**
     * Nos devuelve la lista de usuarios de tipo coordinador registrados.
     * @return coordinadores (ArrayList<Coordinador>)
     */
    public ArrayList<Coordinador> getCoordinadores() {
        return coordinadores;
    }
    /**
     * Método que permite agregar un nuevo cordinador a la lista de usuarios coordinadores de la clase.
     * @param nom (String) nombre completo
     * @param tel (String[]) lista de telefonos
     * @param cor (String) correo
     * @param usu (String) usuario
     * @param con (String) contraseña
     */
    public void crearUsuarioCoordinador(String nom, String[] tel, String cor, String usu, String con) {
        this.coordinadores.add(new Coordinador(nom, tel, cor, usu, con));
    }
   
    public Profesor crearUsuarioProfesor(
        Profesor listaProfesores, String nom, String[] tel, String cor, String usu, String con
        ) {
        listaProfesores.setProfesores(nom, tel, cor, usu, con);
        return listaProfesores;
    }
   
    public Estudiantes registrarEstudiantes(
        Estudiantes listaEstudiantes, String nom, Date nac, String car, short edad, boolean gen, String lPro
        ) {
        listaEstudiantes.setEstudiantes(nom, car, nac, edad, gen, lPro);
        return listaEstudiantes;
    }
}