import java.util.ArrayList;

public class Juegos extends Software{
    //Atributos
    private String genero;
    private String clasificacion;
    //Constructor
    public Juegos(String titulo, int anioPublicacion, int precio, int tamanioDatos, ArrayList<String> idiomas,
                 String genero, String clasificacion) {
        super(titulo, anioPublicacion, precio, tamanioDatos, idiomas);
        this.genero = genero;
        this.clasificacion = clasificacion;
    }
    //Getters
    public String getGenero() {return genero;}
    public String getClasificacion() {return clasificacion;}
}
