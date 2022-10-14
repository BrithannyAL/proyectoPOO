import java.util.ArrayList;

import Clases.Grupos;
import Clases.Tramites;
import Cursos.*;
import Usuarios.*;

public class datos {

    public static ArrayList<Cursos> cargarCursos() {
        ArrayList<Cursos> cursos = new ArrayList<>();

        cursos.add(new Virtual(
                "IC1400", "Fundamentos de organización de computadoras", (short) 3, (short) 4,
                null, null, new String[] { "Miércoles" }, "1:30 PM", "4:05 PM"));
        cursos.add(new VirtualAsincronico(
                "MA1403", "Matemática discreta", (short) 4, (short) 4,
                null, null, "TecDigital"));
        cursos.add(new VirtualSincronico(
            "IC2101", "Programación orientada a objetos", (short) 3, (short) 9,
                new String[] { "Introducción a la programación", "Taller de programación" },
                null, new String[] { "Lunes" }, "7:55 AM", "11:30 AM", "ZOOM"));

        return cursos;
    }
    
    public static ArrayList<Estudiantes> cargarEstudiantes() {

        ArrayList<Cursos> cursos = new ArrayList<>();
        cursos = cargarCursos();

        ArrayList<Estudiantes> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiantes("Veronica", "1", metodos.obtenerFecha("2003-4-12"),
                (short) 19, "Femenino", "Santa Rosa de Pocosol"));
        estudiantes.add(new Estudiantes("Juan", "2", metodos.obtenerFecha("2003-6-12"),
                (short) 19, "Masculino", "Santa Clara"));
        estudiantes.add(new Estudiantes("Pedro", "3", metodos.obtenerFecha("2003-3-5"),
                (short) 19, "Masculino", "Fortuna"));
        estudiantes.add(new Estudiantes("Maria", "4", metodos.obtenerFecha("2003-2-6"),
                (short) 19, "Femenino", "Florencia"));
        estudiantes.add(new Estudiantes("Angel", "5", metodos.obtenerFecha("2003-7-23"),
                (short) 19, "Masculino", "CQ"));

        estudiantes.get(0).setCalificaciones(cursos.get(0), 78);
        estudiantes.get(0).setCalificaciones(cursos.get(1), 90);
        estudiantes.get(0).setCalificaciones(cursos.get(2), 87);

        return estudiantes;
    }

    public static ArrayList<Usuarios> cargarUsuarios() {
        ArrayList<Usuarios> usuarios = new ArrayList<>();

        usuarios.add(new Coordinador("A", new String[] { "123", "456" }, "a@", "a", "123"));
        usuarios.add(new Profesor("D", new String[] { "123", "456" }, "D@", "d", "123"));
        usuarios.add(new Coordinador("B", new String[] { "123", "456" }, "b@", "b", "123"));
        usuarios.add(new Profesor("E", new String[] { "123", "456" }, "E@", "e", "123"));
        usuarios.add(new Coordinador("C", new String[] { "123", "456" }, "c@", "c", "123"));
        usuarios.add(new Profesor("F", new String[] { "123", "456" }, "F@", "f", "123"));

        return usuarios;
    }

    public static ArrayList<Profesor> cargarProfesores() {
        ArrayList<Profesor> profesores = new ArrayList<>();

        profesores.add(new Profesor("D", new String[] { "123", "456" }, "D@", "d", "123"));
        profesores.add(new Profesor("E", new String[] { "123", "456" }, "E@", "e", "123"));
        profesores.add(new Profesor("F", new String[] { "123", "456" }, "F@", "f", "123"));

        return profesores;
    }

    public static ArrayList<Grupos> cargarGrupos() {
        ArrayList<Grupos> grupos = new ArrayList<>();
        ArrayList<Profesor> profesores = cargarProfesores();

        grupos.add(new Grupos(
            profesores.get(0), metodos.obtenerFecha("2022-7-24"),
                metodos.obtenerFecha("2022-11-24"), (short) 1));
        grupos.add(new Grupos(
            profesores.get(1), metodos.obtenerFecha("2022-7-24"),
                metodos.obtenerFecha("2022-11-24"), (short) 2));
        grupos.add(new Grupos(
            profesores.get(2), metodos.obtenerFecha("2022-7-24"),
                metodos.obtenerFecha("2022-11-24"), (short) 3));

        return grupos;
    }

    public static ArrayList<Tramites> cargarTramites(){
        ArrayList<Tramites> tramites = new ArrayList<>();
        return tramites;
    }
}
