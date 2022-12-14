/**
 * Clase que describe a los levantamientos de requisitos
 * Clase heredada de la clase Cursos
 * @author Brithanny Arguello, Steven Chacón y Jorge González
 * Bibliotecas externas
 */
package Clases;
import java.sql.Date;

import Cursos.Cursos;
import Usuarios.Estudiantes;

public class LevantamientoRequisitos extends Tramites {
    /**
     * Atributos
     */
    private Cursos curso_a_levatar;
    private String justificacion;
    private boolean estado;
    private String justificacion_de_Rechazo;
    
    public LevantamientoRequisitos(Estudiantes estAso, String descrip, Date fechRegis, 
    Cursos curLev, String justifi, Boolean estad, String justiRech){
        super(estAso, descrip, fechRegis);
        this.curso_a_levatar = curLev;
        this.justificacion = justifi;
        this.estado = estad;
        this.justificacion_de_Rechazo = justiRech;
    }
    /**
     * Devuelve el curso a levantar
     * @return curso a levantar 
     */
    public Cursos getCurso_a_levatar(){
        return curso_a_levatar;
    }
    /**
     * Permite asignar o cambiar el curso a levantar
     * @param curso_a_levatar
     */
    public void setCurso_a_levatar(Cursos curso_a_levatar){
        this.curso_a_levatar = curso_a_levatar;
    }
    /**
     * Devuelve la justificacion por levantamiento
     * @return
     */
    public String getJustificacion(){
        return justificacion;
    }
    /**
     * Permite asignar o cambiar justificacion por levantamiento
     * @param justificacion
     */
    public void getJustificacion(String justificacion){
        this.justificacion = justificacion;
    }
    /**
     * Devuelve el estado del levantamiento (rechazado o aceptado)
     * @return estado
     */
    public boolean getEstado(){
        return estado;
    }
    /**
     * Permite asignar o cambiar el estado del levantamiento
     * @param estado
     */
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    /**
     * Devuelve la justificacion de rechazo (en caso de ser rechazado)
     * @return justificacion de Rechazo
     */
    public String getJustificacion_de_Rechazo(){
        return justificacion_de_Rechazo;
    }
    /**
     * Permite asignar o cambiar la justificacion del rechazo
     * @param justificacion_de_Rechazo
     */
    public void setJustificacion_de_Rechazo(String justificacion_de_Rechazo){
        this.justificacion_de_Rechazo = justificacion_de_Rechazo;
    }

}
