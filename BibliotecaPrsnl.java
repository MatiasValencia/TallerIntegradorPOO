import java.util.ArrayList; //Se importa ArrayList

public class BibliotecaPrsnl {
    //Atributos
    private ArrayList<String> articulosComprados;
    //Constructor
    public BibliotecaPrsnl(ArrayList<String> articulosComprados) {
        this.articulosComprados = new ArrayList<String>();
    }
    //Getters
    public ArrayList<String> getArticulosComprados() {return articulosComprados;}
}
