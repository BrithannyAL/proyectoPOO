package Cursos;

/**
 * Clase que describe los cursos de modalidad "Virtual sincrónico"
 * Clase heredada de clase Cursos
 * 
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class VirtualSincronico extends Cursos {
    /**
     * Atributos
     */
    private String[] dias; // Lista de días en que se recibe el curso
    private String horaInicio; // Hora de incio de las clases
    private String horaFinal; // Hora de fin de las clases
    private String plataforma; // Plataforma usada para recibir las clases

    /**
     * Constructor de la clase
     * 
     * @param cod  (String)
     * @param nom  (String)
     * @param cre  (short)
     * @param hl   (short)
     * @param req  (String[])
     * @param cor  (String[])
     * @param dias (String[])
     * @param hIn  (String)
     * @param hFn  (String)
     * @param pla  (String)
     */
    public VirtualSincronico(
            String cod, String nom, short cre, short hl, String[] req,
            String[] cor, String[] dias, String hIn, String hFn, String pla) {
        super(cod, nom, cre, hl, req, cor);
        this.dias = dias;
        this.horaInicio = hIn;
        this.horaFinal = hFn;
        this.plataforma = pla;
    }

    /**
     * Devuelve una lista con los días en los que se imparte el curso
     * 
     * @return dias (String[])
     */
    public String[] getDias() {
        return dias;
    }

    /**
     * Permite asignarle a un curso la lista de días en los que se impartirá
     * 
     * @param dias (String[])
     */
    public void setDias(String[] dias) {
        this.dias = dias;
    }

    /**
     * Devuelve la hora en la que inicia el curso
     * 
     * @return horaInicio (String)
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Permite asignarle a un curso la hora de inicio de las lecciones
     * 
     * @param horaInicio (String)
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * Devuelve la hora en que acaban las lecciones de un curso
     * 
     * @return horaFinal (String)
     */
    public String getHoraFinal() {
        return horaFinal;
    }

    /**
     * Permite asignarle a un curso la hora en que acaban las lecciones
     * 
     * @param horaFinal (String)
     */
    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    /**
     * Devuelve el nombre la plataforma en donde se imparte el curso
     * 
     * @return plataforma (String)
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Permite asignarle a un curso la plataforma en donde se impartirán las clases
     * 
     * @param plataforma (String)
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
