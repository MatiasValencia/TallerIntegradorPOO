import java.util.ArrayList;

public class Usuario extends Admin {
    //Atributos
    private BibliotecaPrsnl bibliotecaPrsnl;
    public ArrayList<Usuario> listaAmigos; // Lista de Amigos
    private ArrayList<BibliotecaGral> listaDeseados; // Lista de Amigos
    private ArrayList<BibliotecaGral> favoritos; //Articulos Favoritos
    //Constructor
    public Usuario(String nombreUsuario, String password, String correo, String formaDePago, Usuario usuario2,
                    BibliotecaPrsnl bibliotecaPrsnl, ArrayList<Usuario> listaAmigos,
                    ArrayList<BibliotecaGral> listaDeseados, ArrayList<BibliotecaGral> favoritos) {
        super(nombreUsuario, password, correo, formaDePago, usuario2);
        this.bibliotecaPrsnl = bibliotecaPrsnl;
        this.listaAmigos = new ArrayList<Usuario>();
        this.listaDeseados = new ArrayList<BibliotecaGral>();
        this.favoritos = new ArrayList<BibliotecaGral>();
    }
    //Getters
    public BibliotecaPrsnl getBibliotecaPrsnl() {return bibliotecaPrsnl;}
    public ArrayList<Usuario> getListaAmigos() {return listaAmigos;}
    public ArrayList<BibliotecaGral> getListaDeseados() {return listaDeseados;}
    public ArrayList<BibliotecaGral> getFavoritos() {return favoritos;}

    //Customers
    public void agregarAmigo(Usuario amigo) {
        listaAmigos.add(amigo);
        System.out.println(amigo + " fue agregado a su lista de amigos.");
    }
    public void eliminarAmigo(Usuario amigo) {
        listaAmigos.remove(amigo);
        System.out.println(amigo + " fue eliminado de su lista de amigos.");
    }
    public void agregarFavorito(BibliotecaGral favorito) {
        favoritos.add(favorito);
        System.out.println(favorito + " fue agregado a su lista de favoritos.");
    }
    public void eliminarFavorito(BibliotecaGral favorito) {
        favoritos.remove(favorito);
        System.out.println(favorito + " fue eliminado de su lista de favoritos.");
    }
    public void agregarDeseado(BibliotecaGral deseado) {
        listaDeseados.add(deseado);
        System.out.println(deseado + " fue agregado a su lista de deseados.");
    }
    public void eliminarDeseado(BibliotecaGral deseado) {
        listaDeseados.remove(deseado);
        System.out.println(deseado + " fue eliminado de su lista de deseados.");
    }
    public void regalarContenido(BibliotecaGral deseado, Usuario usuario2) {
        usuario2.listaDeseados.add(deseado);
        listaDeseados.remove(deseado);
        System.out.println(deseado + " fue agregado a la lista de " + usuario2);
    }
}

