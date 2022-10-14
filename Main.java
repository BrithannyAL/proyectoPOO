
/**
 * Importaciones externas al archivo
 */
import java.util.ArrayList;

import Clases.Grupos;
import Clases.Tramites;
import Cursos.*;
import Usuarios.*;
import java.io.Console;

/**
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class Main {
    public static void main(String[] args) {

        // CARGAR DATOS
        ArrayList<Estudiantes> estudiantes = datos.cargarEstudiantes();
        ArrayList<Usuarios> usuarios = datos.cargarUsuarios();
        ArrayList<Profesor> profesores = datos.cargarProfesores();
        ArrayList<Cursos> cursos = datos.cargarCursos();
        ArrayList<Grupos> grupos = datos.cargarGrupos();
        ArrayList<Tramites> tramites = datos.cargarTramites();

        // Procedimiento para iniciar sesión.
        String datos[] = obtenerUsuarioContra();
        Usuarios usuarioLog = Usuarios.validadUsuario(usuarios, datos[0], datos[1]);
        if (usuarioLog != null) {
            if (usuarioLog.getClass() == Coordinador.class) {
                Coordinador coordinadorlog = (Coordinador) usuarioLog;

                while (true) {
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
                            Estudiantes e = coordinadorlog.crearEstudiante();
                            if (e != null) {
                                estudiantes.add(e);
                            }
                            break;
                        case 4:
                            estudiantes = coordinadorlog.actualizarEstudiantes(estudiantes);
                            break;
                        case 5:
                            Cursos c = coordinadorlog.agregarCurso();
                            if (c != null)
                                cursos.add(c);
                            break;
                        case 6:
                            cursos = coordinadorlog.editarCurso(cursos);
                            break;
                        case 7:
                            Grupos g = coordinadorlog.crearGrupo(profesores);
                            if (g != null)
                                grupos.add(g);
                            break;
                        case 8:
                            grupos = coordinadorlog.editarGrupo(grupos, profesores);
                            break;
                        case 9:
                            estudiantes = coordinadorlog.asociarEstudianteCurso(estudiantes, cursos);
                            break;
                        case 10:
                            Tramites t = coordinadorlog.CrearTramite(estudiantes, cursos);
                            if (t != null)
                                tramites.add(t);
                            break;
                        case 11:
                            menuReportesCoordinador(coordinadorlog);
                            break;
                        case 0:
                            System.exit(ejecucion);
                            break;
                    }
                }
            } else if (usuarioLog.getClass() == Profesor.class) {
                Profesor profesorLog = (Profesor) usuarioLog;
                while (true) {
                    byte ejecucion = (byte) menuDeProfesores();
                    switch (ejecucion) {
                        case 1:
                            profesorLog.asignarCalificacion(estudiantes);
                        case 2:
                            profesorLog.ingresarTutoria();
                            break;
                        case 3:
                            profesorLog.ingresarAcompañamiento(estudiantes);
                            break;
                        case 4:
                            menuReportesProfesor(profesorLog);
                        case 0:
                            System.exit(ejecucion);
                    }
                }
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
            System.out.println("||         [2] Editar un usuario                                    ||");
            System.out.println("||         [3] Registrar un estudiante                              ||");
            System.out.println("||         [4] Actualizar información de un estudiante              ||");
            System.out.println("||         [5] Agregar un curso                                     ||");
            System.out.println("||         [6] Editar un curso                                      ||");
            System.out.println("||         [7] Crear un grupo                                       ||");
            System.out.println("||         [8] Editar un grupo                                      ||");
            System.out.println("||         [9] Matricular estudiante a un curso                     ||");
            System.out.println("||         [10] Registrar un nuevo tramite                          ||");
            System.out.println("||         [11] Menú de reportes                                    ||");
            System.out.println("||         [0] Para salir                                           ||");
            System.out.println("======================================================================");

            respuesta = Integer.parseInt(console.readLine("Escriba la opción que desea ejecutar: "));

            if ((0 <= respuesta) && (respuesta <= 11)) {
                inicio = false;
            } else {
                System.out.println("OPCIÓN INVÁLIDA: INTENTE DE NUEVO");
            }
        }
        return respuesta;
    }

    public static byte imprimirMenuReportesCoordinador() {
        boolean inicio = true;
        byte respuesta = 0;
        Console console = System.console();
        while (inicio) {
            System.out.println("======================================================================");
            System.out.println("||         Bienvenido al menú de reportes!                          ||");
            System.out.println("||         [1] Historial académico                                  ||");
            System.out.println("||         [2] Reporte de RN                                        ||");
            System.out.println("||         [3] Reporte de levantamiento de requisitos               ||");
            System.out.println("||         [0] Para salir                                           ||");
            System.out.println("======================================================================");

            respuesta = Byte.parseByte(console.readLine("Escriba la opción que desea ejecutar: "));

            if ((0 <= respuesta) && (respuesta <= 3)) {
                inicio = false;
            } else {
                System.out.println("OPCIÓN INVÁLIDA: INTENTE DE NUEVO");
            }
        }
        return respuesta;
    }

    public static void menuReportesCoordinador(Coordinador coordinadorLog) {
        byte ejecucion = imprimirMenuReportesCoordinador();
        boolean inicio = true;
        while (inicio == true) {
            switch (ejecucion) {
                case 0:
                    inicio = false;
                    break;
            }
        }
    }

    public static byte imprimirMenuReportesProfesor() {
        boolean inicio = true;
        byte respuesta = 0;
        Console console = System.console();
        while (inicio) {
            System.out.println("======================================================================");
            System.out.println("||         Bienvenido al menú de reportes!                          ||");
            System.out.println("||         [1] Reporte de RN                                        ||");
            System.out.println("||         [2] Reporte de levantamiento de requisitos               ||");
            System.out.println("||         [0] Para salir                                           ||");
            System.out.println("======================================================================");

            respuesta = Byte.parseByte(console.readLine("Escriba la opción que desea ejecutar: "));

            if ((0 <= respuesta) && (respuesta <= 2)) {
                inicio = false;
            } else {
                System.out.println("OPCIÓN INVÁLIDA: INTENTE DE NUEVO");
            }
        }
        return respuesta;
    }

    public static void menuReportesProfesor(Profesor profesorLog) {
        byte ejecucion = imprimirMenuReportesProfesor();
        boolean inicio = true;
        while (inicio == true) {
            switch (ejecucion) {
                case 0:
                    inicio = false;
                    break;
            }
        }
    }

    public static int menuDeProfesores() { // Menu con las opciones de un profesor
        boolean inicio = true;
        int op = 0;
        Console console = System.console();
        while (inicio) {
            System.out.println("======================================================================");
            System.out.println("||              Bienvenido al menú de profesores!                   ||");
            System.out.println("||              [1] Para asignar una calificación                   ||");
            System.out.println("||              [2] Para agregar una tutoria                        ||");
            System.out.println("||              [3] Para ingresar un acompañamiento                 ||");
            System.out.println("||              [3] Menú de reportes                                ||");
            System.out.println("||              [0] Para salir                                      ||");
            System.out.println("======================================================================");

            op = Integer.parseInt(console.readLine("Escriba la opción que desea ejecutar: "));

            if ((0 <= op) && (op <= 3)) {
                inicio = false;
            } else {
                System.out.println("OPCIÓN INVÁLIDA: INTENTE DE NUEVO");
            }
        }
        return op;
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
