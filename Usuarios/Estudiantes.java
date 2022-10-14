/**
 * Bibliotecas externas
 */
package Usuarios;

import java.util.ArrayList;
import java.util.Date;

import Clases.Calificacion;
import Cursos.*;

/**
 * Clase que describe a los estudiantes que se registran en el sistema para la
 * gestón de registros académicos del TEC
 * 
 * @author Brithanny Arguello, Steven Chacón, Jorge Gonzales
 */
public class Estudiantes {
    /**
     * Atributos
     */
    private String nombre; // Nombre completo del estudiante
    private String carnet; // Número de carnet del estudiante
    private Date nacimiento; // Fecha de nacimiento del estudiante
    private short edad; // Edad del estudiante
    private boolean genero; // Genero del estudiante (true/femenino y false/masculino)
    private String lugarProcedencia; // Lugar donde vive el estudiante
    private ArrayList<Cursos> cursos;
    private ArrayList<Calificacion> calificaciones; //Lista de cursos que matriculó

    /**
     * Contructor de la clase estudiantes
     * 
     * @param nom    (String) nombre completo
     * @param car    (String) carnet estudiantil
     * @param string (Date) fecha de nacimiento
     * @param edad   (short) edad
     * @param gen    (boolean) género
     * @param lPro   (String) Lugar de procedencia
     */
    public Estudiantes(String nom, String car, Date nac, short edad, String gen, String lPro) {
        this.nombre = nom;
        this.carnet = car;
        this.nacimiento = nac;
        this.edad = edad;
        setGenero(gen);
        this.lugarProcedencia = lPro;
    }

    /**
     * Obtiene el nombre completo del estudiante
     * 
     * @return nombre (String)
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite aignarle el nombre competo al estudiante
     * 
     * @param nombre (String)
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el carnet del estudiante
     * 
     * @return carnet (String)
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * Permite asignarle el carnet correspondiente al estudiante
     * 
     * @param carnet (String)
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * Obtiene la fecha de nacimiento del estudiante
     * 
     * @return nacimiento (Date)
     */
    public Date getNacimiento() {
        return nacimiento;
    }

    /**
     * Permite asignarle la fecha de nacimiento al estudiante
     * 
     * @param nacimiento (Date)
     */
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Obtiene la edad actual del estudiante
     * 
     * @return edad (short)
     */
    public short getEdad() {
        return edad;
    }

    /**
     * Le asigna la edad actual al estudiante al estudiante
     * 
     * @param edad
     */
    public void setEdad(short edad) {
        this.edad = edad;
    }

    /**
     * Devuelve el genero del estudiante
     * true = Femenino
     * false = Masculino
     * 
     * @return genero (String)
     */
    public String getGenero() {
        if (this.genero == true) {
            return "Femenino";
        } else if (this.genero == false) {
            return "Masculino";
        }
        return "";
    }

    /**
     * Permite asignarle al estudiante su respectivo genero
     * Femenino = true
     * Maculino = false
     * 
     * @param genero (String)
     */
    public void setGenero(String genero) {
        if (genero == "Femenino") {
            this.genero = true;
        } else if (genero == "Masculino") {
            this.genero = false;
        }
    }

    /**
     * Devuelve el lugar en donde vive el estudiante
     * 
     * @return lugarProcedencia (String)
     */
    public String getLugarProcedencia() {
        return lugarProcedencia;
    }

    /**
     * Guarda el nombre del lugar donde vive el estudiante/de donde viene
     * 
     * @param lugarProcedencia (String)
     */
    public void setLugarProcedencia(String lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }

    public ArrayList<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(Cursos curso) {
        this.cursos.add(curso);
    }

    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Cursos curso, int nota) {
        Calificacion calificacion = new Calificacion(nota,curso );
        this.calificaciones.add(calificacion);
    }

    @Override
    public String toString() {
        String respuesta = (this.nombre + ": " + this.carnet);
        return respuesta;
    }

    public void verListaCursos() {
        for (Cursos c: this.cursos) {
            c.toString();
        }
    }

    public void imprimirLista(ArrayList<Estudiantes> estudiantes) {
        for (Estudiantes e: estudiantes) {
            e.toString();
        }
    }
}