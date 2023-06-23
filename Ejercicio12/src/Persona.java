import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
    private String nombre;
    private Calendar fecha_nac;
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = dateFormat.format(fecha_nac.getTime());

        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fecha_nac=" + fechaFormateada +
                '}';
    }
    public Calendar getFecha_nac() {
        return fecha_nac;
    }
    public void setFecha_nac(Calendar fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    public Persona() {
    }
    public Persona(String nombre, Calendar fecha_nac) {
        this.nombre = nombre;
        this.fecha_nac = fecha_nac;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
