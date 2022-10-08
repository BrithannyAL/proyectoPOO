/**
 * Clase que describe al levantamiento del requisito RN
 * Clase heredada de la clase Cursos
 * @author Brithanny Arguello, Steven Chacón y Jorge González
 * Bibliotecas externas
 */
package Clases;
import Cursos.Cursos;

public class LevantamientoRN {
    /**
    * Atributos
    */
    private Cursos cursos_asociados;
    private Cursos curso_a_matricular;
    private boolean estado;
    /**
     * Constructor de la clase LevantamientoRN
     * @param ca (Curso asociado a levantar)
     * @param cm (Curso a matricular)
     * @param e (estado de levantamiento)
     */
    public LevantamientoRN(Cursos ca, Cursos cm, boolean e){
        this.cursos_asociados = ca;
        this.curso_a_matricular = cm;
        this.estado = e;
    }
    /**
     * Devuelve el curso asociado
     * @return curso asociado
     */
    public Cursos getCursos_asociados(){
        return cursos_asociados;
    }
    /**
     * Permite asignar o cambiar el curso asociado
     * @param cursos_asociados
     */
    public void setCursos_asociados(Cursos curso_a_matricular){
        this.curso_a_matricular = curso_a_matricular;
    }
    /**
     * Devuelve el curso a matricular
     * @return curso a matricular
     */
    public Cursos getCurso_a_matricular(){
        return curso_a_matricular;
    }
    /**
     * Permite asignar o cambiar el curso a matricular
     * @param curso_a_matricular
     */
    public void setCurso_a_matricular(Cursos curso_a_matricular){
        this.curso_a_matricular = curso_a_matricular;
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
}
