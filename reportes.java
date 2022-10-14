import java.io.Console;
import java.util.ArrayList;

import Clases.Calificacion;
import Usuarios.*;

public class reportes {
    
    public static void historialAcademico(ArrayList<Estudiantes> estudiantes) {
        Console console = System.console();
        estudiantes.get(0).imprimirLista(estudiantes);
        System.out.println("Digite el carnet de un estudiante para ver su historial academico");
        String carnet = console.readLine("Carnet");
        Estudiantes estudianteElegido = metodos.buscarEstudiante(estudiantes, carnet);
        ArrayList<String> lista = new ArrayList<>();
        for (Calificacion c: estudianteElegido.getCalificaciones()) {
            //
        }
    }
}
