import java.sql.Date;
import java.util.ArrayList;

/**
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class Main {
    public static void main(String[] args) {

        /* CARGAR DATOS DE ESTUDIANTES */
        ArrayList<Estudiantes> listaEstudiantes;

        listaEstudiantes.add(new Estudiantes(
            "Veronica",
            "2022888888",
            new Date(2003, 06, 15),
            (short)19,
            true,
            "San Hueco"));
        
    }
}
