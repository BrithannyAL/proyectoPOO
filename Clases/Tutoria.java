package Clases;

/**
 * Clase que describe las tutorias que se llevaran a cabo en el sistema para la
 * gestón de registros académicos del TEC
 * 
 * @author Brithanny Arguello, Steven Chacón, Jorge Gonzales
 */
public class Tutoria {
    private short sesion; // Semana en la que se realiza la tutoria
    private short asistencia; // Cantidad de personas que asistieron a la tutoria

    /**
     * Contructor de la clase grupo
     * 
     * @param s (String)
     * @param a (String)
     */
    public Tutoria(short s, short a) {
        this.sesion = s;
        this.asistencia = a;
    }

    public short getSesion() {
        return sesion;
    }

    public void setSesion(short sesion) {
        this.sesion = sesion;
    }

    public short getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(short asistencia) {
        this.asistencia = asistencia;
    }
}