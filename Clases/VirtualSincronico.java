/**
 * Clase que describe los cursos de modalidad "Virtual sincrónico"
 * Clase heredada de clase Cursos
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class VirtualSincronico extends Cursos {
    /**
     * Atributos
     */
    private String[] dias;      //Días en que se recibe el curso
    private String horaInicio;  //Hora de incio de las clases
    private String horaFinal;   //Hora de fin de las clases
    private String plataforma;  //Plataforma usada para recibir las clases
    /**
     * Constructor de la clase
     * @param cod (String)
     * @param nom (String)
     * @param cre (short)
     * @param hl (short)
     * @param req (String[])
     * @param cor (String[])
     * @param dias (String[])
     * @param hIn (String)
     * @param hFn (String)
     * @param pla (String)
     */
    public VirtualSincronico(
    String cod, String nom, short cre, short hl, String[] req,
    String[] cor,String[] dias, String hIn, String hFn, String pla) {
        super(cod, nom, cre, hl, req, cor);
        this.dias = dias;
        this.horaInicio = hIn;
        this.horaFinal = hFn;
        this.plataforma = pla;
        //TODO Auto-generated constructor stub
    }
    
}
