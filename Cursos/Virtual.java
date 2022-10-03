package Cursos;
/**
 * Clase que describe los cursos en modalidad "virtual"
 * Clase heredada de la clase Cursos
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class Virtual extends Cursos {
    /**
     * Atributos
     */
    private String[] dias;      //Lista de días en las que se imparten los cursos
    private String horaInicio;  //Hora de inicio de las clases de los cursos
    private String horaFinal;   //Hora final de las clases de los cursos
    //private String aula;        //Aula o salón en donde se imparten las clases
    /**
     * Contructor de la clase virtual
     * @param cod (String)
     * @param nom (String)
     * @param cre (short)
     * @param hl (short)
     * @param req (String[])
     * @param cor (String[])
     * @param dias (String[])
     * @param hIn (String)
     * @param hFn (String)
     * @param aula (String)
     */
    public Virtual(
    String cod, String nom, short cre, short hl, String[] req, String[] cor,
    String[] dias, String hIn, String hFn, String aula) {
        super(cod, nom, cre, hl, req, cor);
        this.dias = dias;
        this.horaInicio = hIn;
        this.horaFinal = hFn;
        //this.aula = aula;
    }
    /**
     * Obtiene la lista de días en los que se imparten los puntos
     * @return dias (String[])
     */
    public String[] getDias() {
        return dias;
    }
    /**
     * Permite asignarle a un curso la lista de días en los que serán impartidos los cursos
     * @param dias (String[])
     */
    public void setDias(String[] dias) {
        this.dias = dias;
    }
    /**
     * Obtiene la hora de inicio de las clases de los cursos
     * @return horaInicio (String)
     */
    public String getHoraInicio() {
        return horaInicio;
    }
    /**
     * Permite asignarle a un curso la hora de inicio de lecciones
     * @param horaInicio (String)
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    /**
     * Obtiene la hora final de las lecciones de un curso
     * @return horaFinal (String)
     */
    public String getHoraFinal() {
        return horaFinal;
    }
    /**
     * Permite asignarle a un curso la hora en que finalizan las lecciones de los cursos
     * @param horaFinal (String)
     */
    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    /*public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }*/
}
