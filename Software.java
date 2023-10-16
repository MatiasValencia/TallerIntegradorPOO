import java.util.ArrayList;

public class Software {
    //Atributos
    private String titulo;
    private int anioPublicacion;
    private int precio;
    private int tamanioDatos;
    private ArrayList<String> idiomas;
    //Constructor
    public Software(String titulo, int anioPublicacion, int precio, int tamanioDatos, ArrayList<String> idiomas) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
        this.tamanioDatos = tamanioDatos;
        this.idiomas = new ArrayList<String>();
    }
    //Getters
    public String getTitulo() {return titulo;}
    public int getAnioPublicacion() {return anioPublicacion;}
    public int getPrecio() {return precio;}
    public int getTamanioDatos() {return tamanioDatos;}
    public ArrayList<String> getIdiomas() {return idiomas;}
}
