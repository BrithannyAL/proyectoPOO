package Usuarios;

/**
 * Importaciones externas.
 */
import java.io.Console;
import java.util.Date;
import java.util.ArrayList;

import Clases.Grupos;
import Cursos.*;

/**
 * Clase que describe el usuario de tipo coordinador y sus respectivas funciones
 * (comportamientos)
 * Clase que hereda la clase Usuarios
 * 
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
public class Coordinador extends Usuarios {
    /**
     * Constructor de la clase que se hereda de Usuarios
     * 
     * @param nom (String) nombre completo
     * @param tel (String[]) lista de telefonos
     * @param cor (String) correo
     * @param usu (String) usuario
     * @param con (String) contraseña
     */
    public Coordinador(String nom, String[] tel, String cor, String usu, String con) {
        super(nom, tel, cor, usu, con);
    }

    public Usuarios crearUsuario() {
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

    public ArrayList<Usuarios> editarUsuario(ArrayList<Usuarios> usuarios) {
        Console console = System.console();
        String nombre = console.readLine("Escriba el nombre del usuario que desea editar: ");

        for (Usuarios u : usuarios) {
            if (u.getNombre().equals(nombre)) {
                System.out.println("¿Desea editar el nombre del usuario?");
                byte opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO  " ));
                if (opcion == 1) {
                    u.setNombre(console.readLine("Nuevo nombre del usuario: "));
                }

                System.out.println("¿Desea editar los telefonos del usuario?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO  " ));
                if (opcion == 1) {
                    u.setTelefonos();
                }

                System.out.println("¿Desea editar el correo del usuario?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO  "));
                if (opcion == 1) {
                    u.setCorreo(console.readLine("Nuevo correo del usuario: "));
                }

                System.out.println("¿Desea editar el nombre usuario?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO  "));
                if (opcion == 1) {
                    u.setUsuario(console.readLine("Nuevo nombre usuario: "));
                }

                System.out.println("¿Desea editar la contraseña del usuario?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO  "));
                if (opcion == 1) {
                    u.setContrasenia(console.readLine("Nueva contraseña para el usuario: "));
                }
            }
        }
        return usuarios;
    }

    public Estudiantes crearEstudiante() {
        System.out.println("Escriba todo los solicitadi para crear el nuevo estudiante:");
        System.out.println("===========================================================");
        Console console = System.console();
        String nombre = console.readLine("Escriba el nombre completo: ");
        String Carnet = console.readLine("Digite el carnet: ");
        System.out.println("Digite la fecha en formato (YY-MM-DD)");
        Date nacimiento = metodos.obtenerFecha(console.readLine("Fecha de nacimiento: "));
        short edad = Short.parseShort(console.readLine("Digite la edad del estudiante: "));
        String genero = console.readLine("Genero (Famenino/Masculino): ");
        String lugarProcedencia = console.readLine("Escriba el lugar donde vive el estudiante: ");
        return new Estudiantes(nombre, Carnet, nacimiento, edad, genero, lugarProcedencia);
    }

    public ArrayList<Estudiantes> actualizarEstudiantes(ArrayList<Estudiantes> estudiantes) {
        for (Estudiantes e: estudiantes) {
            e.toString();
        }
        Console console = System.console();
        String carnet = console.readLine("Digitel el carnet del estudiante que desea actualizar");
        for (Estudiantes e: estudiantes) {
            if (e.getCarnet().equals(carnet)) {
                int opcion = Integer.parseInt(console.readLine("¿Desea actualizar la edad del estudiante? (1. Sí / 2. No)"));
                if (opcion == 1) {
                    e.setEdad(Short.parseShort(console.readLine("Digite la nueva edad del estudiante: ")));
                }

                opcion = Integer.parseInt(console.readLine("¿Desea actualizar el lugar donde vive? (1. Sí / 2. No)"));
                if (opcion == 1) {
                    e.setLugarProcedencia(console.readLine("Digite el lugar donde vive: "));
                }
            }
        }
        return estudiantes;
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

    public Cursos agregarCurso() {
        System.out.println("1.  Para agragar un curso de modalidad virtual.");
        System.out.println("2.  Para agragar un curso de modalidad virtual asincrónico.");
        System.out.println("3.  Para agragar un curso de modalidad virtual sincrónico.");
        Console console = System.console();
        int tipoCurso = Integer.parseInt(console.readLine("Tipo de curso que desea agrega: "));

        System.out.println("----------------------------------------------------------------");
        System.out.println("Escriba todos los datos necesarios para la creación del curso:");

        String codigo = console.readLine("Escriba el código del curso: ");
        String nombre = console.readLine("Escriba el título del curso: ");
        short creditos = Short.parseShort(console.readLine("Escriba la cantidad de créditos que vale el curso: "));
        short horasLectivas = Short.parseShort(console.readLine("Escriba la cantidad de horas lectivas del curso: "));

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
                String[] diasV = obtenerLista("día");
                String horaInicialV = console.readLine("Hora de inicio: ");
                String horaFinalV = console.readLine("Hora final: ");
                return new Virtual(
                        codigo, nombre, creditos, horasLectivas, requisitos, corequisitos, diasV, horaInicialV,
                        horaFinalV);
            case 2:
                String medioComunicacion = console.readLine("Plataforma para compartir el material: ");
                return new VirtualAsincronico(
                        codigo, nombre, creditos, horasLectivas, requisitos, corequisitos, medioComunicacion);
            case 3:
                System.out.println("Agregue los días en los que será impartido el curso");
                String[] diasVS = obtenerLista("día");
                String horaInicialVS = console.readLine("Hora de inicio: ");
                String horaFinalVS = console.readLine("Hora final: ");
                String plataformaVS = console.readLine("Plataforma para impartir la clase: ");
                return new VirtualSincronico(
                        codigo, nombre, creditos, horasLectivas, requisitos, corequisitos,
                        diasVS, horaInicialVS, horaFinalVS, plataformaVS);
            default:
                break;
        }
        return null;
    }

    public ArrayList<Cursos> editarCurso(ArrayList<Cursos> cursos) {
        Console console = System.console();
        System.out.println("1. Para editar un curso virtual");
        System.out.println("2. Para editar un curso virtual asincrónico");
        System.out.println("3. Para editar un curso virtual sincrónico");
        byte tipoCurso = Byte.parseByte(console.readLine("Tipo de curso de desea editar: "));

        String codigoCurso = console.readLine("Escriba el código del curso que desea editar: ");

        for (Cursos c : cursos) {
            if (c.getCodigo().equals(codigoCurso)) {
                System.out.println("¿Desea editar el título del curso?");
                byte opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    c.setNombre(console.readLine("Nuevo título para el usuario: "));
                }

                System.out.println("¿Desea editar la cantidad de créditos del curso?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    c.setCreditos(Short.parseShort(console.readLine("Nueva cantidad de créditos para el usuario: ")));
                }

                System.out.println("¿Desea editar la cantidad de horas lectivas del curso?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    c.setHorasLectivas(
                            Short.parseShort(console.readLine("Nueva cantidad de horas lectivas para el usuario: ")));
                }

                System.out.println("¿Desea editar los cursos requisitos?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    System.out.println("Digite los nuevos cursos requisitos para este curso:");
                    c.setRequisitos(obtenerLista("cequisitos"));
                }

                System.out.println("¿Desea editar los cursos corequisitos?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    System.out.println("Digite los nuevos cursos corequisitos para este curso:");
                    c.setCorequisitos(obtenerLista("corequisitos"));
                }

                switch (tipoCurso) {
                    case 1:
                        Virtual cursoVirtual = (Virtual) c;
                        System.out.println("¿Desea editar los días que se imparte el curso?");
                        opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                        if (opcion == 1) {
                            System.out.println("Digite los nuevos días en que se imparten las clases del curso:");
                            cursoVirtual.setDias(obtenerLista("días"));
                        }

                        System.out.println("¿Desea editar la hora de inicio de la clase del curso?");
                        opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                        if (opcion == 1) {
                            System.out.println("Escriba la hora en el formato (HH:MM AM/PM)");
                            String horaInicial = console.readLine("Digite la hora inicial:");
                            cursoVirtual.setHoraInicio(horaInicial);
                        }

                        System.out.println("¿Desea editar la hora final de la clase del curso?");
                        opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                        if (opcion == 1) {
                            System.out.println("Escriba la hora en el formato (HH:MM AM/PM)");
                            String horaFinal = console.readLine("Digite la hora final:");
                            cursoVirtual.setHoraFinal(horaFinal);
                        }
                        break;
                    case 2:
                        VirtualAsincronico cursoVirtualAsincronico = (VirtualAsincronico) c;
                        System.out.println("¿Desea cambiar la plataforma de comunicación del curso?");
                        opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                        if (opcion == 1) {
                            String medioComuniacion = console.readLine("Digite el nuevo medio de comunicación:");
                            cursoVirtualAsincronico.setMedioComunicacion(medioComuniacion);
                        }
                    case 3:
                        VirtualSincronico cursoVirtualSincronico = (VirtualSincronico) c;
                        System.out.println("¿Desea editar los días que se imparte el curso?");
                        opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                        if (opcion == 1) {
                            System.out.println("Digite los nuevos días en que se imparten las clases del curso:");
                            cursoVirtualSincronico.setDias(obtenerLista("días"));
                        }

                        System.out.println("¿Desea editar la hora de inicio de la clase del curso?");
                        opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                        if (opcion == 1) {
                            System.out.println("Escriba la hora en el formato (HH:MM AM/PM)");
                            String horaInicial = console.readLine("Digite la hora inicial:");
                            cursoVirtualSincronico.setHoraInicio(horaInicial);
                        }

                        System.out.println("¿Desea editar la hora final de la clase del curso?");
                        opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                        if (opcion == 1) {
                            System.out.println("Escriba la hora en el formato (HH:MM AM/PM)");
                            String horaFinal = console.readLine("Digite la hora final:");
                            cursoVirtualSincronico.setHoraFinal(horaFinal);
                        }

                        System.out.println("¿Desea cambiar la plataforma en la que se imparte el curso?");
                        opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                        if (opcion == 1) {
                            String plataforma = console.readLine("Digite la nueva plataforma:");
                            cursoVirtualSincronico.setPlataforma(plataforma);
                        }
                    default:
                        break;
                }
            }
        }
        return cursos;
    }

    public Grupos crearGrupo(ArrayList<Profesor> profesores) {
        Console console = System.console();
        System.out.println("=======================================================================");
        String nombreProfesor = console.readLine("Profesor asignado para el grupo: ");
        Profesor profe = metodos.buscarProfesor(profesores, nombreProfesor);
        System.out.println("Digite la fecha en el formato (DD-MM-YY)");
        String fecha = console.readLine("Digite la fecha de inicio del grupo: ");
        Date fechaInicial = metodos.obtenerFecha(fecha);
        fecha = console.readLine("Digite la fecha final del grupo: ");
        Date fechaFinal = metodos.obtenerFecha(fecha);
        short numeroGrupo = Short.parseShort(console.readLine("Digite el número de grupo: "));
        Grupos nuevoGrupo = new Grupos(profe, fechaInicial, fechaFinal, numeroGrupo);
        for (Profesor p: profesores) {
            if (p.getNombre().equals(profe.getNombre())) {
                p.setGrupos(nuevoGrupo);
            }
        }
        return nuevoGrupo;
    }

    public ArrayList<Grupos> editarGrupo(ArrayList<Grupos> grupos, ArrayList<Profesor> profesores) {
        Console console = System.console();
        short editarGrupoNumero = Short.parseShort(console.readLine("Número del grupo que desea editar: "));
        for (Grupos g : grupos) {
            if (g.getNumeroGrupo() == editarGrupoNumero) {
                System.out.println("¿Desea cambiar al profesor asignado para el grupo?");
                int opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    Profesor profe = metodos.buscarProfesor(
                        profesores, console.readLine("Nombre del profesor que desea asignar: "));
                    g.setProfesor(profe);
                }

                System.out.println("¿Desea cambiar la fecha inicial del grupo?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    System.out.println("Escriba la fecha en el formato (YY-MM-DD)");
                    Date fechaInicial = metodos.obtenerFecha(
                        console.readLine("Digite la nueva fecha inicial del grupo: "));
                    g.setFecha_inicio(fechaInicial);
                }

                System.out.println("¿Desea cambiar la fecha final del grupo?");
                opcion = Byte.parseByte(console.readLine("1. SÍ / 2. NO"));
                if (opcion == 1) {
                    System.out.println("Escriba la fecha en el formato (YY-MM-DD)");
                    Date fechaInicial = metodos.obtenerFecha(
                        console.readLine("Digite la nueva fecha final del grupo: "));
                    g.setFecha_inicio(fechaInicial);
                }
            }

        }
        return grupos;
    }

    public ArrayList<Estudiantes> asociarEstudianteCurso(ArrayList<Estudiantes> estudiantes, ArrayList<Cursos> cursos) {
        Console console = System.console();
        Estudiantes encontrado = null;
        String estudiante = console.readLine("Carnet del estudiante que va a matricular el curso: ");
        for (Estudiantes e: estudiantes) {
            if (e.getCarnet().equals(estudiante)) {
                encontrado = e;
                for (Cursos c: cursos) {
                    c.toString();
                }
                String codigo = console.readLine("Digitel el código del curso que desea matricular: ");
                for (Cursos c: cursos) {
                    if (c.getCodigo().equals(codigo)) {
                        e.setCursos(c);
                    }
                }

                System.out.println("-EL ESTUDIANTE SE MATRICULÓ CORRECTAMENTE-");
                return estudiantes;
            }
        }
        if (encontrado == null) {
            System.out.println("ATENCIÓN: EL ESTUDIANTE NO SE ENCUENTRA REGISTRADO");
        }
        return estudiantes;
    }
}