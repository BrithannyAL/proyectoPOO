/**
 * Importaciones externas al archivo
 */
import java.util.ArrayList;
import java.util.Date;
import Clases.Coordinador;
import Clases.Estudiantes;
import Clases.Profesor;
import java.io.Console;

/**
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class Main {
    public static void main(String[] args) {

        // CARGAR DATOS DE ESTUDIANTES
        ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
        new Estudiantes("A", "a", new Date(2003, 6, 12), (short) 12, true, "SC");
        listaEstudiantes.add(new Estudiantes("Veronica", "1", new Date(2003, 4, 12),
                (short) 19, true, "Santa Rosa de Pocosol"));
        listaEstudiantes.add(new Estudiantes("Juan", "2", new Date(2003, 6, 12),
                (short) 19, false, "Santa Clara"));
        listaEstudiantes.add(new Estudiantes("Pedro", "3", new Date(2003, 3, 5),
                (short) 19, false, "Fortuna"));
        listaEstudiantes.add(new Estudiantes("Maria", "4", new Date(2003, 2, 6),
                (short) 19, true, "Florencia"));
        listaEstudiantes.add(new Estudiantes("Angel", "5", new Date(2003, 7, 23),
                (short) 19, true, "CQ"));

        // CARGAR COORDINADORES
        ArrayList<Coordinador> listaCoordinador = new ArrayList<>();
        listaCoordinador.add(new Coordinador("A", new String[] { "123", "456" }, "a@", "a", "123"));
        listaCoordinador.add(new Coordinador("B", new String[] { "123", "456" }, "b@", "b", "123"));
        listaCoordinador.add(new Coordinador("C", new String[] { "123", "456" }, "c@", "c", "123"));

        // GARGAR PROFESORES
        ArrayList<Profesor> listaProfesor = new ArrayList<>();
        listaProfesor.add(new Profesor("D", new String[] { "123", "456" }, "D@", "d", "123"));
        listaProfesor.add(new Profesor("E", new String[] { "123", "456" }, "E@", "e", "123"));
        listaProfesor.add(new Profesor("F", new String[] { "123", "456" }, "F@", "f", "123"));

        //Procedimiento para iniciar sesión.
        byte opcion = Byte.parseByte(primerMenu());
        String datos[] = obtenerUsuarioContra();

        if (opcion == 1) {
            if (Coordinador.validadCoordinador(listaCoordinador, datos[0], datos[1]) == true) {
                menuDeCordinadores();
            } else {
                System.out.println("ATENCIÓN: USUARIO NO ENCONTRADO");
            }
        } else if (opcion == 1) {
            if (Profesor.validarProfesor(listaProfesor, datos[0], datos[1]) == true) {
                menuDeProfesores();
            } else {
                System.out.println("ATENCIÓN: USUARIO NO ECNOTRADO");
            }
        }
    }

    public static String primerMenu() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("||                  Bienvenido al sistema!                          ||");
        System.out.println("||         Ingrese 1 si desea ingresar como coordinador             ||");
        System.out.println("||         Ingrese 2 si desea ingresar como profesor                ||");
        System.out.println("----------------------------------------------------------------------");

        Console console = System.console();
        return console.readLine("Número del tipo de usuario con el que va a ingresar: ");
    }

    public static void menuDeCordinadores() {
        System.out.println("======================================================================");
        System.out.println("||            Bienvenido al menú de coordinadores!                  ||");
        System.out.println("||         [1] Para crear un usuario                                ||");
        System.out.println("||         [2] Para editar un usuario                               ||");
        System.out.println("||         [3] Para agregar un curso                                ||");
        System.out.println("||         [4] Para editar un curso                                 ||");
        System.out.println("||         [5] Para crear un grupo                                  ||");
        System.out.println("||         [6] Para editar un grupo                                 ||");
        System.out.println("||         [7] Para asociar un estudiante a un curso                ||");
        System.out.println("======================================================================");
    }

    public static void menuDeProfesores() {
        System.out.println("======================================================================");
        System.out.println("||            Bienvenido al menú de profesores!                     ||");
        System.out.println("||              [1] Para asignar una tutoria                        ||");
        System.out.println("||              [2] Para agregar una tutoria                        ||");
        System.out.println("======================================================================");
    }

    public static String[] obtenerUsuarioContra() {
        System.out.println("Escriba su usuario y contraseña");
        Console console = System.console();
        String respuesta[] = { console.readLine("Usuario: "), console.readLine("Contraseña: ") };
        return respuesta;
    }
}
