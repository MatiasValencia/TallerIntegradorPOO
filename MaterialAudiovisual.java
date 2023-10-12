public class MaterialAudiovisual {
    private String titulo;
    private int anio;
    private int precio;

    public MaterialAudiovisual(String titulo, int anio, int precio) {
        this.titulo = titulo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getTitulo() {return titulo;}
    public int getAnio() {return anio;}
    public int getPrecio() {return precio;}
}