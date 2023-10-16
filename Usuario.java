import java.util.ArrayList;

public class Usuario extends Admin {
    //Atributos
    private ArrayList<String> listaAmigos; // Lista de Amigos
    private ArrayList<String> listaDeseados; // Lista de Amigos
    private ArrayList<String> favoritos; //Articulos Favoritos
    //Constructor
    public Usuario(String nombreUsuario, String password, String correo, String formaDePago, ArrayList<String> listaAmigos,
                    ArrayList<String> favoritos) {
        super(nombreUsuario, password, correo, formaDePago);
        this.listaAmigos = new ArrayList<>();
        this.listaDeseados = new ArrayList<>();
        this.favoritos = new ArrayList<>();
    }
    //Getters
    public ArrayList<String> getListaAmigos() {return listaAmigos;}
    public ArrayList<String> getListaDeseados() {return listaDeseados;}
    public ArrayList<String> getFavoritos() {return favoritos;}
}

