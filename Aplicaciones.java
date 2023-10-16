import java.util.ArrayList;

public class Aplicaciones extends Software {
    //Atributos
    private String tipoPrograma;
    //Constructor
    public Aplicaciones(String titulo, int anioPublicacion, int precio, int tamanioDatos, ArrayList<String> idiomas,
                        String tipoPrograma) {
        super(titulo, anioPublicacion, precio, tamanioDatos, idiomas);
        this.tipoPrograma = tipoPrograma;
    }
    //Getters
    public String getTipoPrograma() {return tipoPrograma;}
}
