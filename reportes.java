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
        String nombre = estudianteElegido.getNombre();
        int ponderado = 0;
        int suma = 0;
        int totalCreditos = 0;
        System.out.println("Historial académico de " + nombre);
        for (Calificacion c: estudianteElegido.getCalificaciones()) {
            System.out.println("Curso:" + c.getCurso().getNombre());
            System.out.println("Nota del curso: " + c.getNota());
            System.out.println();
            suma = suma + (c.getNota()*c.getCurso().getCreditos());
            totalCreditos = totalCreditos + c.getCurso().getCreditos();
        }
        ponderado = suma / totalCreditos;
        System.out.println("Ponderado del estudiante: " + ponderado);
    }
}
