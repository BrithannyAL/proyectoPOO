/**
 * Bibliotecas externas
 */
package Clases;
import java.sql.Date;


public class Tramites {
    /**
     * Atributos
     */
    private Estudiantes estudiante_asociado;
    private String descripcion;
    private Date fecha_registro;
    /**
     * 
     * @param e (Estudiantes)
     * @param d (descripcion)
     * @param f (fecha de registro)
     */
    public Tramites(Estudiantes e, String d, Date f){
        this.estudiante_asociado = e;
        this.descripcion = d;
        this.fecha_registro = f;
    }
    /**
     * Devuelve el estudiante asociado al tramite
     * @return estudiante asociado
     */
    public Estudiantes getEstudiante_asociado(){
        return estudiante_asociado;
    }
    /**
     * Permite asignar o cambiar el estudiante asociado
     * @param estudiante_asociado (Estudiante asociado)
     */
    public void setEstudiante_asociado(Estudiantes estudiante_asociado){
        this.estudiante_asociado = estudiante_asociado;
    }
    /**
     * Devuelve la descripcion del tramite
     * @return descripcion
     */
    public String getDescripcion(){
        return descripcion;
    }
    /**
     * Permite asignar o cambiar la descripcion del tramite
     * @param descripcion
     */
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    /**
     * Devuelve la fecha de registro del tramite
     * @return fecha de resgistro
     */
    public Date getFecha_registro(){
        return fecha_registro;
    }
    /**
     * Permite modificar o asignar una fecha de registro
     * @param fecha_registro
     */
    public void setFecha_registro(Date fecha_registro){
        this.fecha_registro = fecha_registro;
    }
}


