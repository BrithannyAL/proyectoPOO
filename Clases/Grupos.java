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
    private ArrayList<Estudiantes> estudiantes; //Estudiantes en el grupo
    private Profesor profesor; //Profesor del grupo
    private Date fecha_inicio;  //Fecha en la que inicia el grupo
    private Date fecha_final; //Fecha en la que finaliza el grupo
    private short numeroGrupo; //Codigo para identificar el grupo

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

    public ArrayList<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_final() {
        return fecha_final;
    }


    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    public short getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(short numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }
}


