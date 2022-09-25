import java.util.Date;
/**
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class Main {
    public static void main(String[] args) {
        /* CARGAR DATOS DE ESTUDIANTES */
        Estudiantes [] listaEstudiantes = new Estudiantes[10];
        listaEstudiantes[0] = new Estudiantes("Veronica","1",new Date(2003, 4, 12),
            (short) 19,true,"Santa Rosa de Pocosol");
        listaEstudiantes[1] = new Estudiantes("Juan","2",new Date(2003, 6, 12),
            (short) 19,false,"Santa Clara");
        listaEstudiantes[2] = new Estudiantes("Pedro","3",new Date(2003, 3, 5),
            (short) 19,false,"Fortuna");
        listaEstudiantes[3] = new Estudiantes("Maria","4",new Date(2003, 2, 6),
            (short) 19,true,"Florencia");
        listaEstudiantes[4] = new Estudiantes("Angel","5",new Date(2003, 7, 23),
            (short) 19,true,"CQ");

        
    }
}
