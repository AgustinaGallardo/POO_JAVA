import java.util.Calendar;

public class Pelicula {
    private String titulo;
    private int anio;
    private String genero;
    private double duracion;
    private boolean alquilada; // si esta alquilada la pongo en true
    public Pelicula() {
    }
    public Pelicula(String titulo, int anio, String genero, double duracion) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.duracion = duracion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
