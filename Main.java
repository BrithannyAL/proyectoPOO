
/**
 * Importaciones externas al archivo
 */
import java.util.ArrayList;
import java.util.Date;


import Cursos.*;
import Usuarios.*;
import java.io.Console;

/**
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class Main {
    public static void main(String[] args) {


        Profesor p1 = new Profesor("P1", new String [] {"666"}, "p1@", "p1", "123");
        
        // CARGAR DATOS DE ESTUDIANTES
        ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
        new Estudiantes("A", "a", new Date(2003 / 6 / 12), (short) 12, true, "SC");
        listaEstudiantes.add(new Estudiantes("Veronica", "1", new Date(2003 / 4 / 12),
                (short) 19, true, "Santa Rosa de Pocosol"));
        listaEstudiantes.add(new Estudiantes("Juan", "2", new Date(2003 / 6 / 12),
                (short) 19, false, "Santa Clara"));
        listaEstudiantes.add(new Estudiantes("Pedro", "3", new Date(2003 / 3 / 5),
                (short) 19, false, "Fortuna"));
        listaEstudiantes.add(new Estudiantes("Maria", "4", new Date(2003 / 2 / 6),
                (short) 19, true, "Florencia"));
        listaEstudiantes.add(new Estudiantes("Angel", "5", new Date(2003 / 7 / 23),
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
                "IC1400", "Fundamentos de organización de computadoras", 3, 4,
                null, null, new String[] { "Miércoles" }, "1:30pm", "4:05pm"));
        cursos.add(new VirtualAsincronico(
                "MA1403", "Matemática discreta", 4, 4,
                null, null, "TecDigital"));
        cursos.add(new VirtualSincronico("IC2101", "Programación orientada a objetos", 3, 9,
                new String[] { "Introducción a la programación", "Taller de programación" },
                null, new String[] { "Lunes" }, "7:55am", "11.30am", "ZOOM"));

        // Procedimiento para iniciar sesión.
        String datos[] = obtenerUsuarioContra();
        byte tipoUsuario = Coordinador.validadUsuario(usuarios, datos[0], datos[1]);
        if (tipoUsuario == 0) {
            byte ejecucion = Byte.parseByte(menuDeCordinadores());
            switch (ejecucion) {
                case 1:
                    Usuarios e = crearUsuario();
                    if (e != null) {
                        usuarios.add(e);
                    }
                    break;
                case 2:
                    editarUsuario(usuarios);
                    break;
                case 3:
                    //
                    break;
                default:
                    System.out.println("ATENCIÓN: La opción que ha digitado es invalida para el menú.");
                    break;
            }
        } else if (tipoUsuario == 1) {
            menuDeProfesores(listaEstudiantes,p1,listaProfesores,datos); 
        } else {
            System.out.println("ATENCIÓN: USUARIO NO ENCONTRADO");
        }
    }

    public static String menuDeCordinadores() {
        System.out.println("======================================================================");
        System.out.println("||         Bienvenido al menú de coordinadores!                     ||");
        System.out.println("||         [1] Para crear un usuario                                ||");
        System.out.println("||         [2] Para editar un usuario                               ||");
        System.out.println("||         [3] Para agregar un curso                                ||");
        System.out.println("||         [4] Para editar un curso                                 ||");
        System.out.println("||         [5] Para crear un grupo                                  ||");
        System.out.println("||         [6] Para editar un grupo                                 ||");
        System.out.println("||         [7] Para asociar un estudiante a un curso                ||");
        System.out.println("||         [8] Para salir                                           ||");
        System.out.println("======================================================================");

        Console console = System.console();
        return console.readLine("Escriba la opción que desea ejecutar: ");
    }

    public static void menuDeProfesores(ArrayList<Estudiantes> listaEstudiantes,Profesor p1,ArrayList<Profesor> listaProfesores,String[]datos) { // Menu con las opciones de un profesor

        Profesor profesor = buscarProfesor(listaProfesores, datos);
        
        while(true){

        System.out.println("======================================================================");
        System.out.println("||              Bienvenido al menú de profesores!                   ||");
        System.out.println("||              [1] Para asignar una calificación                   ||");
        System.out.println("||              [2] Para agregar una tutoria                        ||");
        System.out.println("||              [3] Para salir                                      ||");
        System.out.println("======================================================================");

        Console console = System.console();
        String op;
        op = console.readLine("Escriba la opción que desea ejecutar: ");

        if(op.equals("1")){
            String n;
            String e;
            
            

            for(Estudiantes lista : listaEstudiantes){
            System.out.println("\nNombre:" + lista.getNombre() + "\nCarnet:"+ lista.getCarnet()); 
                }

            e = console.readLine("Ingrese el carnet del estudiante que desea calificar: ");
            n = console.readLine("Ingrese la nota que desea registrar: ");
            
            profesor.asignarCalificacion(e,n,profesor);


        }else if(op.equals("2")){
            String s;
            String p;
            s = console.readLine("Ingrese la semana en la que se lleva a cabo la tutoría: ");
            p = console.readLine("Ingrese la cantidad de personas que asistieron a la tutoría: ");
        
            profesor.ingresarTutoria(Short.parseShort(s),Short.parseShort(p));

        }else if(op.equals("3")){
            break;
        }else{
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

    // MÉTODOS Y FUNCIONES QUE CORRESPONDEN AL MENU DE COORDINADOR

    public static Usuarios crearUsuario() {
        System.out.println("1. Para crear un usuario coordinador.");
        System.out.println("2. Para crear un usuario profesor.");

        Console console = System.console();
        byte tipoUsuario = Byte.parseByte(console.readLine("Número del tipo de usuario a crear: "));
        System.out.println("=======================================================================");
        String nombre = console.readLine("Nombre Completo del usuario: ");
        String telefonos[] = { console.readLine("Teléfono del usuario: ") };
        String correo = console.readLine("Correo electrónico del usuario: ");
        String usuario = console.readLine("Nombre de usuario: ");
        String contrasenia = console.readLine("Contrasena de usuario: ");

        if (tipoUsuario == 1) {
            return new Coordinador(nombre, telefonos, correo, usuario, contrasenia);
        } else if (tipoUsuario == 2) {
            return new Profesor(nombre, telefonos, correo, usuario, contrasenia);
        } else {
            System.out.println("ATENCIÓN: La opción es inválida.");
            return null;
        }
    }

    public static void editarUsuario(ArrayList<Usuarios> usuarios) {
        Console console = System.console();
        String nombre = console.readLine("Escriba el nombre del usuario que desea editar");

        for (Usuarios u : usuarios) {
            if (u.getNombre().equals(nombre)) {
                System.out.println("¿Desea editar el nombre del usuario?");
                byte opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    u.setNombre(console.readLine("Nuevo nombre del usuario: "));
                }

                System.out.println("¿Desea editar los telefonos del usuario?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    u.setTelefonos();
                }

                System.out.println("¿Desea editar el correo del usuario?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    u.setCorreo(console.readLine("Nuevo correo del usuario: "));
                }

                System.out.println("¿Desea editar el nombre usuario?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    u.setUsuario(console.readLine("Nuevo nombre usuario: "));
                }

                System.out.println("¿Desea editar la contraseña del usuario?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    u.setContrasenia(console.readLine("Nueva contraseña para el usuario: "));
                }
            }
        }
    }

    public static String[] obtenerLista(String elemento) {
        Console console = System.console();
        String[] lista = {};
        boolean inicio = true;
        int cont = 0;
        while (inicio) {
            lista[cont] = console.readLine("Escriba el nombre del " + elemento + ": ");
            int resp = Integer.parseInt(console.readLine("¿Desea agregar otro? (1. Sí / 2. No)"));
            if (resp == 2) {
                inicio = false;
                break;
            }
            cont = +1;
        }
        return lista;
    }
    /**
     * Aun hay que terminarlo, NO TOCARLO
     * @return
     */
    public static Cursos agregarCurso() { 
        System.out.println("1.  Para agragar un curso de modalidad virtual.");
        System.out.println("2.  Para agragar un curso de modalidad virtual asincrónico.");
        System.out.println("1.  Para agragar un curso de modalidad virtual sincrónico.");
        Console console = System.console();
        int tipoCurso = Integer.parseInt(console.readLine("Tipo de curso que desea agrega: "));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Escriba todos los datos necesarios para la creación del curso:");
        String codigo = console.readLine("Escriba el código del curso: ");
        String nombre = console.readLine("Escriba el título del curso: ");
        int creditos = Integer.parseInt(console.readLine("Escriba la cantidad de créditos que vale el curso: "));
        int horasLectivas = Integer.parseInt(console.readLine("Escriba la cantidad de horas lectivas del curso: "));
        int req = Integer.parseInt(console.readLine("¿El curso tiene requisitos? (1. Sí / 2. No)"));
        String[] requisitos = {};
        if (req == 1)
            requisitos = obtenerLista("requisito");
        int cor = Integer.parseInt(console.readLine("¿El curso tiene corequisitos? (1. Sí / 2. No)"));
        String[] corequisitos = {};
        if (cor == 1)
            corequisitos = obtenerLista("correquisito");
        switch (tipoCurso) {
            case 1:
                System.out.println("Agregue los días en los que será impartido el curso");
                String[] dias = obtenerLista("día");
                String horaInicial = console.readLine("Hora de inicio: ");
                String horaFinal = console.readLine("Hora final: ");
                return new Virtual(
                    codigo, nombre, creditos, horasLectivas, requisitos, corequisitos, dias, horaInicial, horaFinal);
                case 2:
                    break;
        
            default:
                break;
        }
        return null;
    }

    public static Profesor buscarProfesor(ArrayList<Profesor> listaUsuarios, String datos[])
    {
        for(Profesor p : listaUsuarios)
    {
        if(datos[0].equals(p.getUsuario()))
            return p;
    }
     return null;   
    }
}