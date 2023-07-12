import java.util.Calendar;

public class Alquiler {
    private Pelicula pelicula;
    private Calendar fehcaInicio;
    private Calendar fechaFin;
    private double precio;
    public Alquiler() {
    }
    public Alquiler(Pelicula pelicula, Calendar fehcaInicio, Calendar fechaFin, double precio) {
        this.pelicula = pelicula;
        this.fehcaInicio = fehcaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public Calendar getFehcaInicio() {
        return fehcaInicio;
    }
    public void setFehcaInicio(Calendar fehcaInicio) {
        this.fehcaInicio = fehcaInicio;
    }
    public Calendar getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Alquiler{" +
                "pelicula=" + pelicula +
                ", fehcaInicio=" + fehcaInicio +
                ", fechaFin=" + fechaFin +
                ", precio=" + precio +
                '}';
    }

}
