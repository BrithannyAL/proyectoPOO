/**
 * Clase de describe a los usuarios que pueden utilizar la plataforma de gestión de registros académicos
 * @author Brithanny Arguello, Steven Chacón y Jorge Gonzáles
 */
abstract public class Usuarios {
    /**
     * Atributos
     */
    private String nombre;          //Nombre completo del usuario
    private String[] telefonos;     //Lista de teléfonos
    private String correo;          //Correo
    private String usuario;         //Usuario con el cual ingresa al sistema
    private String contrasenia;     //Contraseña de su cuenta
    /**
     * Contructor de la clase
     * @param nom (String)
     * @param tel (String[])
     * @param cor (String)
     * @param usu (String)
     * @param con (String)
     */
    public Usuarios(String nom, String[] tel, String cor, String usu, String con){
        this.nombre = nom;
        this.telefonos = tel;
        this.correo = cor;
        this.usuario = usu;
        this.contrasenia = con;
    }
    /**
     * Nos devuelve el nombre completo del usuario
     * @return nombre (String)
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Permite asignarle el nombre completo al usuario 
     * @param nombre (String)
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la lista de teléfonos del usuario
     * @return telefonos (String[])
     */
    public String[] getTelefonos() {
        return telefonos;
    }
    /**
     * Permite asignarle más telefonos al usuario,
     * ya que para ser creado el usuario debe de tener al menos un número de teléfono
     * @param telefonos (String[])
     */
    public void setTelefonos(String[] telefonos) {
        this.telefonos = telefonos;
    }
    /**
     * Obtiene el correo electronico del usuario
     * @return correo (String)
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Permite asignarle o cambiarle el correo al usuario
     * @param correo (String)
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Obtiene el nombre de usuario
     * @return usuario (String)
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Permite asignarle o cambiarle el nombre de usuario
     * @param usuario (String)
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
     * Obtiene la contraseña del usuario
     * @return contrasenia (String)
     */
    public String getContrasenia() {
        return contrasenia;
    }
    /**
     * Permite cambiarle la contraseña al usuario
     * @param contrasenia
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}
