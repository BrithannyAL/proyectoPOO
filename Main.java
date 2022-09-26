import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner; //Agregar esto luego a la bibliografía
/**
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzales
 */
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        String pass;

        // CARGAR DATOS DE ESTUDIANTES 
        ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
        new Estudiantes("A", "a", new Date(2003, 6, 12), (short)12, true, "SC");
        listaEstudiantes.add(new Estudiantes("Veronica","1",new Date(2003, 4, 12),
            (short) 19,true,"Santa Rosa de Pocosol"));
        listaEstudiantes.add(new Estudiantes("Juan","2",new Date(2003, 6, 12),
            (short) 19,false,"Santa Clara"));
        listaEstudiantes.add(new Estudiantes("Pedro","3",new Date(2003, 3, 5),
            (short) 19,false,"Fortuna"));
        listaEstudiantes.add(new Estudiantes("Maria","4",new Date(2003, 2, 6),
            (short) 19,true,"Florencia"));
        listaEstudiantes.add(new Estudiantes("Angel","5",new Date(2003, 7, 23),
            (short) 19,true,"CQ"));

        //CARGAR COORDINADORES
        ArrayList<Coordinador> listaCoordinador  = new ArrayList<>();

        new Coordinador("A" , new String[] {"123", "456"}, "a@", "a", "123");
        listaCoordinador.add(new Coordinador("B" , new String[] {"123", "456"}, "a@", "b", "123"));

        System.out.println("Bienvenido al sistema!" + 
        "\n Ingrese su nombre de usuario: ");
        userName = myObj.nextLine(); 
        System.out.println("Ingrese su contraseña: ");
        pass = myObj.nextLine();   

        if(Coordinador.validadCoordinador(listaCoordinador,userName,pass) == true){
            
        }


    } 
}
