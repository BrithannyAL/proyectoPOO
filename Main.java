
/**
 * Importaciones externas al archivo
 */
import java.util.ArrayList;
import java.util.Date;

import Clases.Grupos;
import Cursos.*;
import Usuarios.*;
import Usuarios.metodos;
import java.io.Console;

/**
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class Main {
    public static void main(String[] args) {

        Profesor p1 = new Profesor("P1", new String[] { "666" }, "p1@", "p1", "123");

        // CARGAR DATOS DE ESTUDIANTES
        ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
        new Estudiantes("A", "a", new Date(2003 / 6 / 12), (short) 12, true, "SC");
        listaEstudiantes.add(new Estudiantes("Veronica", "1", metodos.obtenerFecha("2003-4-12"),
                (short) 19, true, "Santa Rosa de Pocosol"));
        listaEstudiantes.add(new Estudiantes("Juan", "2", metodos.obtenerFecha("2003-6-12"),
                (short) 19, false, "Santa Clara"));
        listaEstudiantes.add(new Estudiantes("Pedro", "3", metodos.obtenerFecha("2003-3-5"),
                (short) 19, false, "Fortuna"));
        listaEstudiantes.add(new Estudiantes("Maria", "4", metodos.obtenerFecha("2003-2-6"),
                (short) 19, true, "Florencia"));
        listaEstudiantes.add(new Estudiantes("Angel", "5", metodos.obtenerFecha("2003-7-23"),
                (short) 19, true, "CQ"));

        // CARGAR USUARIOS
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        usuarios.add(new Coordinador("A", new String[] { "123", "456" }, "a@", "a", "123"));
        usuarios.add(new Profesor("D", new String[] { "123", "456" }, "D@", "d", "123"));
        usuarios.add(new Coordinador("B", new String[] { "123", "456" }, "b@", "b", "123"));
        usuarios.add(new Profesor("E", new String[] { "123", "456" }, "E@", "e", "123"));
        usuarios.add(new Coordinador("C", new String[] { "123", "456" }, "c@", "c", "123"));
        usuarios.add(new Profesor("F", new String[] { "123", "456" }, "F@", "f", "123"));

        ArrayList<Profesor> listaProfesores = new ArrayList<>();
        listaProfesores.add(new Profesor("D", new String[] { "123", "456" }, "D@", "d", "123"));
        listaProfesores.add(new Profesor("E", new String[] { "123", "456" }, "E@", "e", "123"));
        listaProfesores.add(new Profesor("F", new String[] { "123", "456" }, "F@", "f", "123"));

        // CARGAR CURSOS
        ArrayList<Cursos> cursos = new ArrayList<>();
        cursos.add(new Virtual(
                "IC1400", "Fundamentos de organización de computadoras", (short) 3, (short) 4,
                null, null, new String[] { "Miércoles" }, "1:30 PM", "4:05 PM"));
        cursos.add(new VirtualAsincronico(
                "MA1403", "Matemática discreta", (short) 4, (short) 4,
                null, null, "TecDigital"));
        cursos.add(new VirtualSincronico("IC2101", "Programación orientada a objetos", (short) 3, (short) 9,
                new String[] { "Introducción a la programación", "Taller de programación" },
                null, new String[] { "Lunes" }, "7:55 AM", "11:30 AM", "ZOOM"));

        // CARGAR DATOS GRUPOS
        ArrayList<Grupos> grupos = new ArrayList<>();
        grupos.add(new Grupos(
                listaProfesores.get(0), metodos.obtenerFecha("2022-7-24"),
                metodos.obtenerFecha("2022-11-24"), (short) 1));
        grupos.add(new Grupos(
                listaProfesores.get(1), metodos.obtenerFecha("2022-7-24"),
                metodos.obtenerFecha("2022-11-24"), (short) 2));
        grupos.add(new Grupos(
                listaProfesores.get(2), metodos.obtenerFecha("2022-7-24"),
                metodos.obtenerFecha("2022-11-24"), (short) 3));

        // Procedimiento para iniciar sesión.
        String datos[] = obtenerUsuarioContra();
        Usuarios usuarioLog = Usuarios.validadUsuario(usuarios, datos[0], datos[1]);
        if (usuarioLog != null) {
            if (usuarioLog.getClass() == Coordinador.class) {
                Coordinador coordinadorlog = (Coordinador) usuarioLog;
                byte ejecucion = (byte) menuDeCordinadores();
                switch (ejecucion) {
                    case 1:
                        Usuarios u = coordinadorlog.crearUsuario();
                        if (u != null)
                            usuarios.add(u);
                        break;
                    case 2:
                        usuarios = coordinadorlog.editarUsuario(usuarios);
                        break;
                    case 3:
                        Cursos c = coordinadorlog.agregarCurso();
                        if (c != null)
                            cursos.add(c);
                        break;
                    case 4:
                        cursos = coordinadorlog.editarCurso(cursos);
                        break;
                    case 5:
                        Grupos g = coordinadorlog.crearGrupo(listaProfesores);
                        if (g != null)
                            grupos.add(g);
                        break;
                    case 6:
                        grupos = coordinadorlog.editarGrupo(grupos, listaProfesores);
                    default:
                        System.out.println("ATENCIÓN: La opción que ha digitado es invalida para el menú.");
                        break;
                }
            } else if (usuarioLog.getClass() == Profesor.class) {
                menuDeProfesores(listaEstudiantes, p1, listaProfesores, datos);
            } else {
                System.out.println("ATENCIÓN: USUARIO NO ENCONTRADO");
            }
        }
    }

    public static int menuDeCordinadores() {
        boolean inicio = true;
        int respuesta = 0;
        Console console = System.console();
        while (inicio) {
            System.out.println("======================================================================");
            System.out.println("||         Bienvenido al menú de coordinadores!                     ||");
            System.out.println("||         [1] Registrar nuevo usuario                              ||");
            System.out.println("||         [2] Para editar un usuario                               ||");
            System.out.println("||         [3] Para agregar un curso                                ||");
            System.out.println("||         [4] Para editar un curso                                 ||");
            System.out.println("||         [5] Para crear un grupo                                  ||");
            System.out.println("||         [6] Para editar un grupo                                 ||");
            System.out.println("||         [7] Para asociar un estudiante a un curso                ||");
            System.out.println("||         [0] Para salir                                           ||");
            System.out.println("======================================================================");

            respuesta = Integer.parseInt(console.readLine("Escriba la opción que desea ejecutar: "));

            if ((0 < respuesta) && (respuesta <= 8)) {
                inicio = false;
            } else {
                System.out.println("OPCIÓN INVÁLIDA: INTENTE DE NUEVO");
            }
        }
        return respuesta;
    }

    public static void menuDeProfesores(ArrayList<Estudiantes> listaEstudiantes, Profesor p1,
            ArrayList<Profesor> listaProfesores, String[] datos) { // Menu con las opciones de un profesor

        Profesor profesor = buscarProfesor(listaProfesores, datos);

        while (true) {
            System.out.println("======================================================================");
            System.out.println("||              Bienvenido al menú de profesores!                   ||");
            System.out.println("||              [1] Para asignar una calificación                   ||");
            System.out.println("||              [2] Para agregar una tutoria                        ||");
            System.out.println("||              [0] Para salir                                      ||");
            System.out.println("======================================================================");

            Console console = System.console();
            String op;
            op = console.readLine("Escriba la opción que desea ejecutar: ");

            if (op.equals("1")) {
                String n;
                String e;
                for (Estudiantes lista : listaEstudiantes) {
                    System.out.println("\nNombre:" + lista.getNombre() + "\nCarnet:" + lista.getCarnet());
                }
                e = console.readLine("Ingrese el carnet del estudiante que desea calificar: ");
                n = console.readLine("Ingrese la nota que desea registrar: ");
                profesor.asignarCalificacion(e, n, profesor);

            } else if (op.equals("2")) {
                String s;
                String p;
                s = console.readLine("Ingrese la semana en la que se lleva a cabo la tutoría: ");
                p = console.readLine("Ingrese la cantidad de personas que asistieron a la tutoría: ");
                profesor.ingresarTutoria(Short.parseShort(s), Short.parseShort(p));

            } else if (op.equals("3")) {
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }
    }

    public static String[] obtenerUsuarioContra() {
        System.out.println("Escriba su usuario y contraseña");
        Console console = System.console(); // Lector de usuario y contrasena para proximamente ser validadas
        String respuesta[] = { console.readLine("Usuario: "), console.readLine("Contraseña: ") };
        return respuesta; // Se retoran las variables de ususario y contrasena
    }

    // MÉTODOS Y FUNCIONES QUE CORRESPONDE AL MENU DE PROFESORES
    public static Profesor buscarProfesor(ArrayList<Profesor> listaUsuarios, String datos[]) {
        for (Profesor p : listaUsuarios) {
            if (datos[0].equals(p.getUsuario()))
                return p;
        }
        return null;
    }
}