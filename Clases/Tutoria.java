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
     * @param semana (String)
     * @param asistencia (String)
     */
    public Tutoria(short semana, short asistencia) {
        this.sesion = semana;
        this.asistencia = asistencia;
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

    @Override
    public String toString() {
        String respuesta = ("\nSemana " + this.sesion + "\nAsistencia: " + this.asistencia);
        return respuesta;
    }
}