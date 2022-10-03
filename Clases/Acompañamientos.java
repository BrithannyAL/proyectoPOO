/**
 * Bibliotecas externas
 */
package Clases;
import java.sql.Date;
import java.util.ArrayList;  
/**
 * 
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
public class Acompañamientos {
    /**
     * Atrinbutos
     */
    private Date fecha;                         //Fecha en la que se realiza el acompanamiento
    private String tipoReporte;                 //Tipo de reporte realizado
    private ArrayList<Estudiantes> estudiantes; // Estudiantes que usaron el acompanamiento
    private String notaDescriptiva;             //Nota que describe el acompanamiento
    /**
     * Contructor de la clase grupo
     * @param f (Date)
     * @param tr (String)
     * @param nd (String)
     */
    public Acompañamientos(Date f, String tr, String nd) {
        this.fecha = f;
        this.tipoReporte = tr;
        this.notaDescriptiva = nd;
    }
    //Obtiene la fecha en que se registra un acompanamiento
    public Date getFecha() {
        return fecha;
    }
    //Cambia o modifica la fecha de un acompanamiento
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    //Devuelve el tipo de reporte generado
    public String getTipoReporte() {
        return tipoReporte;
    }
    //Permite cambiar o asignar un tipo de reporte
    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }
    //Obtiene una lista de estudiantes
    public ArrayList<Estudiantes> getEstudiantes() {
        return estudiantes;
    }
    //Modifica o asigna una lista de estudiantes
    public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }
    //Obtiene la nota descriptiva del acompanamiento
    public String getNotaDescriptiva() {
        return notaDescriptiva;
    }
    //Asigna o modifica una nota descriptiva del acompanamiento
    public void setNotaDescriptiva(String notaDescriptiva) {
        this.notaDescriptiva = notaDescriptiva;
    }
    //Funcion para crear un registro del tiempo adicional asignado en evaluaciones
    public void registroDeTiempoAdicionalEnEvaluaciones(){

    }
    //Funcion para asignar una adecuacion en una evalucacion
    public void adecuacionDeEvaluaciones(){

    }
    //Funcion para generar un reporte de incidencia
    public void reporteDeIncidencia(){
        
    }
}