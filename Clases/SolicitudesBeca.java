/**
 * Clase que describe a los levantamientos de requisitos
 * Clase heredada de la clase Cursos
 * @author Brithanny Arguello, Steven Chacón y Jorge González
 */
package Clases;

public class SolicitudesBeca {
    /**
     * Atributos
     */
    private String periodo;
    private boolean tipo;
    /**
     * Constructor de la clase SolicitudesBeca
     * @param p (periodo de la beca)
     * @param t (tipo de beca: total o prestamo)
     */
    public SolicitudesBeca(String p, boolean t){
        this.periodo = p;
        this.tipo = t;
    }
    /**
     * Devuelve el periodo de a beca
     * @return periodo
     */
    public String getPeriodo(){
        return periodo;
    }
    /**
     * Permite asignar o cambiar el periodo de la beca
     * @param periodo
     */
    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }
    /**
     * Devuelve el tipo de beca (Total o prestamo)
     * @return tipo
     */
    public boolean getTipo(){
        return tipo;
    }
    /**
     * Permite asignar o cambiar el tipo de beca
     * @param tipo
     */
    public void setTipo(boolean tipo){
        this.tipo = tipo;
    }

}
