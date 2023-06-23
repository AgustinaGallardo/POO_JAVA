public class Cancion {
    /**
     * 1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
     * definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
     * vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
     * además definir los métodos getters y setters correspondientes.
     */

    private String titulo;
    private Autor autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Cancion() {
        titulo = "";
        autor = new Autor();
    }

    public Cancion(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor+
                '}';
    }
}
