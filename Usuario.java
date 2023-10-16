import java.util.ArrayList;

public class Usuario extends Admin {
    //Atributos
    private ArrayList<String> bibliotecaPrsnl;
    public ArrayList<Usuario> listaAmigos; // Lista de Amigos
    private ArrayList<String> listaDeseados; // Lista de Amigos
    private ArrayList<String> favoritos; //Articulos Favoritos
    //Constructor
    public Usuario(String nombreUsuario, String password, String correo, String formaDePago, Usuario usuario2,
                    ArrayList<String> bibliotecaPrsnl, ArrayList<Usuario> listaAmigos, ArrayList<String> favoritos) {
        super(nombreUsuario, password, correo, formaDePago, usuario2);
        this.bibliotecaPrsnl = new ArrayList<String>();
        this.listaAmigos = new ArrayList<Usuario>();
        this.listaDeseados = new ArrayList<String>();
        this.favoritos = new ArrayList<String>();
    }
    //Getters
    public ArrayList<String> getBibliotecaPrsnl() {return bibliotecaPrsnl;}
    public ArrayList<Usuario> getListaAmigos() {return listaAmigos;}
    public ArrayList<String> getListaDeseados() {return listaDeseados;}
    public ArrayList<String> getFavoritos() {return favoritos;}

    //Customers
    public void agregarAmigo(Usuario amigo) {
        listaAmigos.add(amigo);
        System.out.println(amigo + " fue agregado a su lista de amigos.");
    }
    public void eliminarAmigo(Usuario amigo) {
        listaAmigos.remove(amigo);
        System.out.println(amigo + " fue eliminado de su lista de amigos.");
    }
    public void agregarFavorito(String favorito) {
        favoritos.add(favorito);
        System.out.println(favorito + " fue agregado a su lista de favoritos.");
    }
    public void eliminarFavorito(String favorito) {
        favoritos.remove(favorito);
        System.out.println(favorito + " fue eliminado de su lista de favoritos.");
    }
    public void agregarDeseado(String deseado) {
        listaDeseados.add(deseado);
        System.out.println(deseado + " fue agregado a su lista de deseados.");
    }
    public void eliminarDeseado(String deseado) {
        listaDeseados.remove(deseado);
        System.out.println(deseado + " fue eliminado de su lista de deseados.");
    }
    public void regalarContenido(String deseado, Usuario usuario2) {
        usuario2.listaDeseados.add(deseado);
        listaDeseados.remove(deseado);
        System.out.println(deseado + " fue agregado a la lista de " + usuario2);
    }
}

