import java.util.ArrayList;

public class Admin {
    //Atributos
    private String nombreUsuario;
    private String password;
    private String correo;
    private String formaDePago;
    private Usuario usuario;
    private BibliotecaGral biblioteca;

    //Constructor
    public Admin(String nombreUsuario, String password, String correo, String formaDePago, Usuario usuario) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.correo = correo;
        this.formaDePago = formaDePago;
        this.usuario = usuario;
    }

    //Getters y Setters
    public String getNombreUsuario() {return nombreUsuario;}
    public String getPassword() {return password;}
    public String getCorreo() {return correo;}
    public String getFormaDePago() {return formaDePago;}
    public Usuario getUsuario() {return usuario;}
    public BibliotecaGral getBiblioteca() {return biblioteca;}
    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}
    public void setPassword(String password) {this.password = password;}
    public void setCorreo(String correo) {this.correo = correo;}
    public void setFormadePago(String formaDePago) {this.formaDePago = formaDePago;}
    public void setUsuario(Usuario usuario) {this.usuario = usuario;}

    //Customers
    public void agregarArticulo(BibliotecaGral biblioteca, ArrayList<BibliotecaGral> articulos, String articulo) {
        biblioteca.articulos.add(articulo);
        System.out.println(articulo + " fue agregado a la biblioteca general.");
    }
    public void eliminarArticulo(BibliotecaGral biblioteca, ArrayList<BibliotecaGral> articulos, String articulo) {
        biblioteca.articulos.remove(articulo);
        System.out.println(articulo + " fue eliminado de la biblioteca general.");
    }
    public void banearAmigos(Usuario usuario, ArrayList<Usuario> listaAmigos, Usuario usuarioPorBanear) {
        usuario.listaAmigos.remove(usuarioPorBanear);
        System.out.println(usuarioPorBanear + "fue baneado.");
    }
}
