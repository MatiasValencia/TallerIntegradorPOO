import java.util.ArrayList; //Se importa ArrayList

public class BibliotecaPrsnl {
    //Atributos
    private ArrayList<String> articulosComprados;
    
    //Constructor
    public BibliotecaPrsnl(ArrayList<String> articulosComprados, ArrayList<String> favoritos) {
        this.articulosComprados = new ArrayList<>();
        this.favoritos = new ArrayList<>();
    }
    //Getters
    public ArrayList<String> getArticulosComprados() {return articulosComprados;}
    public ArrayList<String> getFavoritos() {return favoritos;}
    //Como son ArrayLists, no se necesitan setters
}
