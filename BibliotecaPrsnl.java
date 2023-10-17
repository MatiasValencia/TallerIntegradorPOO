import java.util.ArrayList;

public class BibliotecaPrsnl {
    //Atributos
    private ArrayList<BibliotecaGral> articulosComprados;
    //Constructor
    public BibliotecaPrsnl(ArrayList<BibliotecaGral> articulosComprados) {
        this.articulosComprados = new ArrayList<BibliotecaGral>();
    }
    //Getter
    public ArrayList<BibliotecaGral> getArticulosComprados() {return articulosComprados;}
}
