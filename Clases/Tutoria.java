package Clases;
/**
 * Clase que describe las tutorias que se llevaran a cabo en el sistema para la gestón de registros académicos del TEC
 * @author Brithanny Arguello, Steven Chacón, Jorge Gonzales
 */
public class Tutoria {
    private String sesion;      //Semana en la que se realiza la tutoria
    private String asistencia;  //Cantidad de personas que asistieron a la tutoria
    /**
     * Contructor de la clase grupo
     * @param s (String)
     * @param a (String)
     */
    public Tutoria(String s, String a) {
        this.sesion = s;
        this.asistencia = a;
    }

    public String getSesion() {
        return sesion;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }
}
