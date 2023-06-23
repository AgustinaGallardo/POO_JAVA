import java.util.Arrays;

public class Movil {
    /**
     * Crear una entidad Movil con los atributos
     *      * marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
     *      * un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
     *      * correspondiente al código. A continuación, se implementarán los siguientes métodos:
     *      *  Un constructor por defecto.
     *      *  Un constructor con todos los atributos como parámetro.
     *      *  Métodos getters y setters de cada atributo
     */
    private String marca;
    private double precio;
    private int memoriaRam;

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", memoriaRam=" + memoriaRam +
                ", almacenamiento=" + almacenamiento +
                ", codigo=" + Arrays.toString(codigo) +
                '}';
    }

    private int almacenamiento;

    public Movil() {
    }

    public Movil(String marca, double precio, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    private int[] codigo = new int[7];

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
}
