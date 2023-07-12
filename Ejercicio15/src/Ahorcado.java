public class Ahorcado {
    /**
     * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
     * como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
     * cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
     * con los parámetros que sean necesarios:
     *  Constructores, tanto el vacío como el parametrizado.
     */

    private int letrasEjcontradas;
    private int jugadasMaximas;
    private char[] palabraObjetivo;

    public Ahorcado(String palabra, int jugadasMaximas) {
        this.letrasEjcontradas = 0;
        this.jugadasMaximas = jugadasMaximas;
        this.palabraObjetivo = palabra.toCharArray();
    }

    public Ahorcado() {
    }

    public int getLetrasEjcontradas() {
        return letrasEjcontradas;
    }

    public void setLetrasEjcontradas(int letrasEjcontradas) {
        this.letrasEjcontradas = letrasEjcontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public char[] getPalabraObjetivo() {
        return palabraObjetivo;
    }

    public void setPalabraObjetivo(char[] palabraObjetivo) {
        this.palabraObjetivo = palabraObjetivo;
    }
}
