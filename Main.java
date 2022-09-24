import java.sql.Date;
import java.util.ArrayList;

/**
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class Main {
    public static void main(String[] args) {

        Date fecha = new Date(2003,02,7);


        Estudiantes [] listaEstudiantes = new Estudiantes[10];


        Estudiantes  est = new Estudiantes("A","1",fecha,(short)1,true,"SC");

        listaEstudiantes[0] =  new Estudiantes("A","1",fecha,(short)1,true,"SC");

        Estudiantes.setEstudiantes("A","1",fecha,(short)1,true,"SC");




    }
}
