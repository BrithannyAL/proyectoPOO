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
    private ArrayList<Acompañamientos> acompañamientos;
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
        this.acompañamientos = new ArrayList<>();
        this.tutorias= new ArrayList<>();
    }

    public ArrayList<Tutoria> getTutorias() {
        return tutorias;
    }

    public void setTutorias(ArrayList<Tutoria> tutorias) {
        this.tutorias = tutorias;
    }

    public ArrayList<Grupos> getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupos grupo) {
        this.grupos.add(grupo);
    }

    public ArrayList<Acompañamientos> getAcompañamientos() {
        return acompañamientos;
    }

    public void setAcompañamientos(ArrayList<Acompañamientos> acompañamientos) {
        this.acompañamientos = acompañamientos;
    }


 

    public void ingresarTutoria() {
        Console console = System.console();
        int semana = Integer.parseInt(console.readLine("Ingrese la semana en la que se lleva a cabo la tutoría: "));
        int asistencia = Integer.parseInt(console.readLine("Ingrese la cantidad de personas que asistieron a la tutoría: "));
        if ((1 <= semana) && (semana <= 16) && (1 <= asistencia)) {
            this.tutorias.add(new Tutoria( (short) semana, (short) asistencia));

            System.out.println(this.getTutorias()); 
        }

    }

    public void asignarCalificacion(String e, String n, Profesor p) {
        //
    }




    public void ingresarAcompañamiento(ArrayList<Estudiantes> estudiantes){
        Console console = System.console();
        String fecha = console.readLine("Ingrese la fecha en la que se realiza el acompañamiento(DD-MM-YY): ");
        String tipo = console.readLine("Ingrese el tipo de reporte: ");
        String nota = console.readLine("Ingrese una nota descriptiva acerca del caso en cuestión: ");
        for (Estudiantes e : estudiantes)
        System.out.println(e);
        String est = console.readLine("Ingrese el carnet del estudiante a asociar: ");
        Estudiantes estudiante = Estudiantes.buscarEstudiante(estudiantes,est);
        if(estudiante != null){
            this.acompañamientos.add(new Acompañamientos(fecha,tipo,estudiante,nota));

            
        }


    }
}