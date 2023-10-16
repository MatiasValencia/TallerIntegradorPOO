public class Software {
    //Atributos
    private String titulo;
    private int anioPublicacion;
    private int precio;
    //Constructor
    public Software(String titulo, int anioPublicacion, int precio) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }
    //Getters
    public String getTitulo() {return titulo;}
    public int getAnioPublicacion() {return anioPublicacion;}
    public int getPrecio() {return precio;}
}
