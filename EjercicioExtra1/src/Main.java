public class Main {
    /**
     * 1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
     * definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
     * vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
     * además definir los métodos getters y setters correspondientes.
     */
    public static void main(String[] args) {
        CancionService cancionService = new CancionService();
        cancionService.mostrarCancion();
    }
}