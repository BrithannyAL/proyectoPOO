package Usuarios;

import java.util.Date;
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

    public static Profesor buscarProfesor(ArrayList<Profesor> profesores, String nombreProfesor) {
        for (Profesor p: profesores) {
            if (p.nombre.contains(nombreProfesor)) {
                return p;
            }
        }
        return null;
    }
}
