/**
 * Importaciones externas del archivo.
 */
package Clases;

import java.sql.Date;
import java.util.ArrayList;
import Usuarios.Estudiantes;

/**
 * 
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
public class Acompañamientos {
    /**
     * Atrinbutos
     */
    private Date fecha; // Fecha en la que se realiza el acompanamiento
    private String tipoReporte; // Tipo de reporte realizado
    private ArrayList<Estudiantes> estudiantes; // Estudiantes que usaron el acompanamiento
    private String notaDescriptiva; // Nota que describe el acompanamiento

    /**
     * Contructor de la clase grupo
     * 
     * @param f  (Date)
     * @param tr (String)
     * @param nd (String)
     */
    public Acompañamientos(Date f, String tr, String nd) {
        this.fecha = f;
        this.tipoReporte = tr;
        this.notaDescriptiva = nd;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public ArrayList<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getNotaDescriptiva() {
        return notaDescriptiva;
    }

    public void setNotaDescriptiva(String notaDescriptiva) {
        this.notaDescriptiva = notaDescriptiva;
    }

    public void registroDeTiempoAdicionalEnEvaluaciones() {

    }

    public void adecuacionDeEvaluaciones() {

    }

    public void reporteDeIncidencia() {

    }
}