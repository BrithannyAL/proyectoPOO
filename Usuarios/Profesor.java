package Usuarios;

import java.io.Console;
import java.util.ArrayList;
import Clases.*;

/**
 * Clase que describe a los usuarios de tipo Profesor
 * Clase heredada de la clase Usuarios
 * 
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
public class Profesor extends Usuarios {

    private ArrayList<Tutoria> tutorias;
    private ArrayList<Grupos> grupos;

    /**
     * Constructor de la clase que se hereda de Usuarios
     * 
     * @param nom (String) nombre completo del profesor
     * @param tel (String[]) lista de telefonos
     * @param cor (String) correo
     * @param usu (String) usuario
     * @param con (String) contraseña
     */
    public Profesor(String nom, String[] tel, String cor, String usu, String con) {
        super(nom, tel, cor, usu, con);
    }

    public ArrayList<Tutoria> getTutorias() {
        return tutorias;
    }

    public void setTutorias(Tutoria tutoria) {
        this.tutorias.add(tutoria);
    }

    public ArrayList<Grupos> getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupos grupo) {
        this.grupos.add(grupo);
    }

    public void ingresarTutoria() {
        Console console = System.console();
        int semana = Integer.parseInt(console.readLine("Ingrese la semana en la que se lleva a cabo la tutoría: "));
        int asistencia = Integer.parseInt(console.readLine("Ingrese la cantidad de personas que asistieron a la tutoría: "));
        if ((1 <= semana) && (semana <= 16) && (1 <= asistencia)) {
            this.tutorias.add(new Tutoria( (short) semana, (short) asistencia));
        }
        for (Tutoria t : this.tutorias)
            t.toString();
    }

    public void asignarCalificacion(String e, String n, Profesor p) {
        //
    }
}