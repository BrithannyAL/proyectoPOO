package Cursos;
/**
 * Clase que describe los cursos de modalidad Virtual Asincrónico
 * CLase heredada de la clase Cursos
 * @author Brithanny Arguello, Steven Chacón, Jorge Gonzales
 */
public class VirtualAsincronico extends Cursos {
    /**
     * Atributos de la clase
     */
    private String medioComunicacion;   //Platadorma o programa en donde se compartirá el material de clase
    /**
     * Contrcutor de la clase Virutal Asincrónico
     * @param cod (String)
     * @param nom (String)
     * @param cre (short)
     * @param hl (short)
     * @param req (String[])
     * @param cor (String[])
     * @param mCom (String)
     */
    public VirtualAsincronico(String cod, String nom, short cre, short hl, String[] req, String[] cor, String mCom) {
        super(cod, nom, cre, hl, req, cor);
        this.medioComunicacion = mCom;
    }
    /**
     * Obtiene el medio de comunicacón por el cual sse impartirá el material de clase
     * @return medioComunicacion (String)
     */
    public String getMedioComunicacion() {
        return medioComunicacion;
    }
    /**
     * Permite asignarle a un curso el medio de comunicación por el cual se impartirá el material de clase
     * @param medioComunicacion (String)
     */
    public void setMedioComunicacion(String medioComunicacion) {
        this.medioComunicacion = medioComunicacion;
    }
}
