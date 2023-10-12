public class Admin {
    //Atributos
    private String nombreUsuario;
    private String password;
    private String correo;
    private String formaDePago;

    //Constructor
    public Admin(String nombreUsuario, String correo) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
    }

    //Getters y Setters
    public String getNombreUsuario() {return nombreUsuario;}
    public String getPassword() {return password;}
    public String getCorreo() {return correo;}
    public String getFormaDePago() {return formaDePago;}

    public void setPassword(String password) {this.password = password;}
}
