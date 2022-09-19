/**
 * Describe los cursos  del sistema para gestión de registros académicos del TEC
 * @author Brithanny Arguello, Stiven Chacón y
 */
public class Cursos {
    private String codigo;          //Código del curso
    private String nombre;          //Nombre del curso
    private short creditos;         //Cantidad de créditos del curso
    private short horasLectivas;    //Cantidad de horas de clase
    private String[] requisitos;    //Cursos que se deben aprobar primero
    private String[] corequisitos;  //Cursos a llevar en el mismo semestre
    /**
     * Constructutor para la creación de instansias de la clase cursos
     * @param cod (String)
     * @param nom (String)
     * @param cre (short)
     * @param hl (short)
     * @param req (String[])
     * @param cor (String[])
     */
    public Cursos(String cod, String nom, short cre, short hl, String[] req, String[] cor){
        this.codigo = cod;
        this.nombre = nom;
        this.creditos = cre;
        this.horasLectivas = hl;
        this.requisitos = req;
        this.corequisitos = cor;
    }
    /**
     * Obtiene el codigo de los cursos de la clase
     * @return codigo (String)
     */
    public String getCodigo() {
        return codigo;
    }
    /**
     * Permite asignar el código a un curso de la clase
     * @param codigo (String)
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * Obtiene el nombre de un cursos de la clase
     * @return nombre (String)
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Permite asignarle el nombre a un cursos de la clase
     * @param nombre (String)
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la cantidad de creditos de un curso de la clase
     * @return creditos (String)
     */
    public short getCreditos() {
        return creditos;
    }
    /**
     * Permite asignarle la cantidad de creditos a un curso de la clase
     * @param creditos (short)
     */
    public void setCreditos(short creditos) {
        this.creditos = creditos;
    }
    /**
     * Obtiene la cantidad de horas de clase de un curso de la clase
     * @return horasLectivas (short)
     */
    public short getHorasLectivas() {
        return horasLectivas;
    }
    /**
     * Permite asignarle la cantidad de horas de clase de un curso de la clase
     * @param horasLectivas (short)
     */
    public void setHorasLectivas(short horasLectivas) {
        this.horasLectivas = horasLectivas;
    }
    /**
     * Obtiene la lista de requisitos de un curso de la clase
     * Los requisitos de una clase son los cursos que deben aprobarse antes de matricular el curso actual
     * @return requisitos (String[])
     */
    public String[] getRequisitos() {
        return requisitos;
    }
    /**
     * Permite asignarle la lista de requisitos a un curso de la clase
     * @param requisitos (String[])
     */
    public void setRequisitos(String[] requisitos) {
        this.requisitos = requisitos;
    }
    /**
     * Obtener la lista de corequisitos de un curso de la clase
     * La lista de corequisitos son los cursos de deben matricularse en el mismo semestre el curso actual
     * @return corequisitos (String[])
     */
    public String[] getCorequisitos() {
        return corequisitos;
    }
    /**
     * Permite asignarle la lista de corequisitos a un curso de la clase
     * @param corequisitos (String[])
     */
    public void setCorequisitos(String[] corequisitos) {
        this.corequisitos = corequisitos;
    }
}
