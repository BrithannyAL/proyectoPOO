/**
 * Clase que describe a los levantamientos de requisitos
 * @author Brithanny Arguello, Steven Chacón y Jorge González
 */
package Clases;
import Usuarios.Estudiantes;
import java.sql.Date;



public class SolicitudesBeca extends Tramites {
    /**
     * Atributos
     */
    private String periodo;
    private boolean tipo;
    

    public SolicitudesBeca(Estudiantes estAso, String descrip, Date fechRegis, 
    String p, boolean t){
        super(estAso, descrip, fechRegis);
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
