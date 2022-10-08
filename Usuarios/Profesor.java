package Usuarios;


import java.util.ArrayList;



import Clases.*;
/**
 * Clase que describe a los usuarios de tipo Profesor
 * Clase heredada de la clase Usuarios
 * 
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
public class Profesor extends Usuarios {
    /**
     * Constructor de la clase que se hereda de Usuarios
     * 
     * @param nom (String) nombre completo del profesor
     * @param tel (String[]) lista de telefonos
     * @param cor (String) correo
     * @param usu (String) usuario
     * @param con (String) contraseña
     */
    public Profesor(String nom, String[] tel, String cor, String usu, String con) {
        super(nom, tel, cor, usu, con);
    }


    ArrayList<Tutoria> lt = new ArrayList<>();
        
    public void ingresarTutoria(short s, short p){
        
        if((s>=1)&&(s<=16)&&(p>=1))
        {
            lt.add(new Tutoria(s,p));
        }
       for(Tutoria lt : lt)
       System.out.println("\nSesion de semana:" + lt.getSesion() + "\nTotal de asistencia:"+ lt.getAsistencia()); 


    }
}