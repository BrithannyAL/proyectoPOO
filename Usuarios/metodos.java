package Usuarios;

import java.util.Date;

import Cursos.Cursos;

import java.util.ArrayList;
import java.util.Calendar;

public class metodos {
    
    public static Date obtenerFecha(String fecha) {
        String[] valoresFecha = fecha.split("-");
        int dia = Integer.parseInt(valoresFecha[0]);
        int mes = (Integer.parseInt(valoresFecha[1])) - 1;
        int anio = (Integer.parseInt(valoresFecha[2])) - 1900;
        Calendar c = Calendar.getInstance();
        c.set(anio, mes, dia);
        Date nuevaFecha = c.getTime();
        return nuevaFecha;
    }

    public static short obtenerEdad(Date fecha) {
        fecha.getTime();
        System.out.println();
        return 0;
    }

    public static Profesor buscarProfesor(ArrayList<Profesor> profesores, String nombreProfesor) {
        for (Profesor p: profesores) {
            if (p.nombre.contains(nombreProfesor)) {
                return p;
            }
        }
        return null;
    }

    public static Estudiantes buscarEstudiante(ArrayList<Estudiantes> estudiantes, String nombreEstudiante) {
        for (Estudiantes e: estudiantes) {
            if (e.getNombre().equals(nombreEstudiante)) {
                return e;
            }
        }
        return null;
    }

    public static Cursos buscarCursos(ArrayList<Cursos> cursos, String codigo) {
        for (Cursos c: cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }
}
