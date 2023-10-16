import java.util.ArrayList;

public class Navegadores extends Software {
    //Atributos
    private Boolean tieneVPN;
    private Boolean tieneAdBlocker;
    //Constructor
    public Navegadores(String titulo, int anioPublicacion, int precio, int tamanioDatos, ArrayList<String> idiomas,
                        Boolean tieneVPN, Boolean tieneAdBlocker) {
        super(titulo, anioPublicacion, precio, tamanioDatos, idiomas);
        if (tieneVPN == true) {
            this.tieneVPN = tieneVPN;
        } else {
            this.tieneVPN = null;
        }
        if (tieneAdBlocker == true) {
            this.tieneAdBlocker = tieneAdBlocker;
        } else {
            this.tieneAdBlocker = null;
        }
    }

    public Boolean getTieneVPN() {return tieneVPN;}
    
}
