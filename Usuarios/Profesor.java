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

    ArrayList<Tutoria> lt = new ArrayList<>();

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

    public void ingresarTutoria() {
        Console console = System.console();
        int semana = Integer.parseInt(console.readLine("Ingrese la semana en la que se lleva a cabo la tutoría: "));
        int asistencia = Integer.parseInt(console.readLine("Ingrese la cantidad de personas que asistieron a la tutoría: "));
        if ((semana >= 1) && (semana <= 16) && (asistencia >= 1)) {
            lt.add(new Tutoria( (short) semana, (short) asistencia));
        }
        for (Tutoria lt : lt)
            System.out.println("\nSesion de semana:" + lt.getSesion() + "\nTotal de asistencia:" + lt.getAsistencia());
    }

    public void asignarCalificacion(String e, String n, Profesor p) {

    }
}