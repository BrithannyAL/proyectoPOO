package Cursos;

/**
 * Describe los cursos del sistema para gestión de registros académicos del TEC
 * 
 * @author Brithanny Arguello, Stiven Chacón y Jorge Gonzales
 */
abstract public class Cursos {
    /**
     * Atributos
     */
    protected String codigo; // Código del curso
    protected String nombre; // Nombre del curso
    protected int creditos; // Cantidad de créditos del curso
    protected int horasLectivas; // Cantidad de horas de clase
    protected String[] requisitos; // Cursos que se deben aprobar primero
    protected String[] corequisitos; // Cursos a llevar en el mismo semestre

    /**
     * Constructutor para la creación de instansias de la clase cursos
     * 
     * @param cod (String) Código del curso
     * @param nom (String) Nombre/título del curso
     * @param i   (short) Cantidad de creditos del curso
     * @param j   (short) Cantidad de horas lectivas
     * @param req (String[]) Lista de requisitos que se deben aprobar primero
     * @param cor (String[]) Lista de cursos de deben ser llevados al mismo tiempo
     */
    public Cursos(String cod, String nom, int creditos, int horasLectivas, String[] req, String[] cor) {
        this.codigo = cod;
        this.nombre = nom;
        this.creditos = creditos;
        this.horasLectivas = horasLectivas;
        this.requisitos = req;
        this.corequisitos = cor;
    }

    /**
     * Obtiene el codigo de los cursos de la clase
     * 
     * @return codigo (String)
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Permite asignar el código a un curso de la clase
     * 
     * @param codigo (String)
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre de un cursos de la clase
     * 
     * @return nombre (String)
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite asignarle el nombre a un cursos de la clase
     * 
     * @param nombre (String)
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad de creditos de un curso de la clase
     * 
     * @return creditos (String)
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Permite asignarle la cantidad de creditos a un curso de la clase
     * 
     * @param creditos (short)
     */
    public void setCreditos(short creditos) {
        this.creditos = creditos;
    }

    /**
     * Obtiene la cantidad de horas de clase de un curso de la clase
     * 
     * @return horasLectivas (short)
     */
    public int getHorasLectivas() {
        return horasLectivas;
    }

    /**
     * Permite asignarle la cantidad de horas de clase de un curso de la clase
     * 
     * @param horasLectivas (short)
     */
    public void setHorasLectivas(short horasLectivas) {
        this.horasLectivas = horasLectivas;
    }

    /**
     * Obtiene la lista de requisitos de un curso de la clase
     * Los requisitos de una clase son los cursos que deben aprobarse antes de
     * matricular el curso actual
     * 
     * @return requisitos (String[])
     */
    public String[] getRequisitos() {
        return requisitos;
    }

    /**
     * Permite asignarle la lista de requisitos a un curso de la clase
     * 
     * @param requisitos (String[])
     */
    public void setRequisitos(String[] requisitos) {
        this.requisitos = requisitos;
    }

    /**
     * Obtener la lista de corequisitos de un curso de la clase
     * La lista de corequisitos son los cursos de deben matricularse en el mismo
     * semestre el curso actual
     * 
     * @return corequisitos (String[])
     */
    public String[] getCorequisitos() {
        return corequisitos;
    }

    /**
     * Permite asignarle la lista de corequisitos a un curso de la clase
     * 
     * @param corequisitos (String[])
     */
    public void setCorequisitos(String[] corequisitos) {
        this.corequisitos = corequisitos;
    }
}