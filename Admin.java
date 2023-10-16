public class Admin {
    //Atributos
    private String nombreUsuario;
    private String password;
    private String correo;
    private String formaDePago;

    //Constructor
    public Admin(String nombreUsuario, String password, String correo, String formaDePago) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.correo = correo;
        this.formaDePago = formaDePago;
    }

    //Getters y Setters
    public String getNombreUsuario() {return nombreUsuario;}
    public String getPassword() {return password;}
    public String getCorreo() {return correo;}
    public String getFormaDePago() {return formaDePago;}
    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}
    public void setPassword(String password) {this.password = password;}
    public void setCorreo(String correo) {this.correo = correo;}
    public void setFormadePago(String formaDePago) {this.formaDePago = formaDePago;}
}
