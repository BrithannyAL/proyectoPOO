/**
 * Blibioteca externas
 */

package Clases;
import java.sql.Date;
import java.util.ArrayList;  
/**
 * Clase que describe los grupos que se registran en el sistema para la gestón de registros académicos del TEC
 * @author Brithanny Arguello, Steven Chacón, Jorge Gonzales
 */
public class Grupos {
    /**
     * Atributos
     */
    private ArrayList<Estudiantes> estudiantes; //Estudiantes en el grupo (class Estudiantes)
    private Profesor profesor;                  //Profesor del grupo (class Profesor)
    private Date fecha_inicio;                  //Fecha en la que inicia el grupo
    private Date fecha_final;                   //Fecha en la que finaliza el grupo
    private short numeroGrupo;                  //Codigo para identificar el grupo
    /**
     * Contructor de la clase grupo
     * @param est (Estudiantes)
     * @param p (Profesor)
     * @param fi (Date)
     * @param ff (Date)
     * @param ng (short)
     */
    public Grupos(Profesor p, Date fi, Date ff, short ng) {
        this.profesor = p;
        this.fecha_inicio = fi;
        this.fecha_final = ff;
        this.numeroGrupo = ng;
    }
    /**
     * Devuelve la lista de estudiantes que están en cada grupo
     * @return estudiantes (ArrayList<Estudiantes>)
     */
    public ArrayList<Estudiantes> getEstudiantes() {
        return estudiantes;
    }
    /**
     * Permite agregar a los estudiantes a los grupos de la clase
     * @param estudiantes (ArrayList<Estudiantes>)
     */
    public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }
    /**
     * Devuelve al profesor de cada grupo de la clase
     * @return profesor (String)
     */
    public Profesor getProfesor() {
        return profesor;
    }
    /**
     * Permite asignar o cambiar al profesor del grupo de la clase
     * @param profesor (Profesor)
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    //Devuelve la fecha de inicio del grupo
    public Date getFecha_inicio() {
        return fecha_inicio;
    }
    //Permite asignar o cambiar la fecha de inicio
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    //Obtiene la fecha final
    public Date getFecha_final() {
        return fecha_final;
    }
    //Permite modificar o asignar una fecha final
    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }
    //Obtiene el o los numeros de grupo(s)
    public short getNumeroGrupo() {
        return numeroGrupo;
    }

    //Permite asignar o modificar el numero de un grupo
    public void setNumeroGrupo(short numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }
}


