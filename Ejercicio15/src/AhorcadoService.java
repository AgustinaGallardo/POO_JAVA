import java.util.Objects;
import java.util.Scanner;

public class AhorcadoService {
    Scanner scan = new Scanner(System.in);
    private Ahorcado a;
    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra para jugar");
        String palabra = scan.nextLine();
        System.out.println("Ingrese la cantidad de juagadas maxima");
        int jugadasMax = scan.nextInt();
        scan.nextLine();
        return a = new Ahorcado(palabra, jugadasMax);
    }
    public void buscarLetra() {
        boolean encontrada = false;
        System.out.println("Ingrese que letra quiere buscar");
        String letra = scan.nextLine().toLowerCase();

        if (letra.isEmpty()) {
            System.out.println("No se ha ingresado ninguna letra. Intenta nuevamente.");
            return;
        }
        char[] palabra = a.getPalabraObjetivo();
            for (char c : palabra) {
                if (Character.toLowerCase(c)==letra.charAt(0)) {
                    encontrada = true;
                    break;
                }
            }
            if (encontrada) {
                System.out.println("La letra '" + letra + "' se encuentra en la palabra");
                encontrada(letra);
            } else {
                System.out.println("La letra '" + letra + "' no se encuentra en la palabra");
                int jugadasMaximas = a.getJugadasMaximas();
                jugadasMaximas--;
                a.setJugadasMaximas(jugadasMaximas);
            }
        }
    public boolean encontrada(String letra){
        char[] palabra = a.getPalabraObjetivo();
        int encontrada = 0;
        for (char c:palabra) {
            if (Character.toLowerCase(c) == letra.charAt(0)) {
                encontrada++;
            }
        }
        System.out.println("La letra '" + letra + "' se encuentra " + encontrada + " veces en la palabra.");
        int letrasEncontradas = a.getLetrasEjcontradas() + encontrada;
        a.setLetrasEjcontradas(letrasEncontradas);
        int letrasFaltantes = palabra.length - letrasEncontradas;
        System.out.println("Letras encontradas: " + letrasEncontradas);
        System.out.println("Letras faltantes: " + letrasFaltantes);
        return encontrada > 0;
    }
    public void longitud() {
        char[] palabra = a.getPalabraObjetivo();
        int longitud = palabra.length;
        System.out.println("La longitud de la palabra objetivo es: " + longitud);
    }
    public int intentos(){
        int jugadasMaximas = a.getJugadasMaximas();
        int letrasEncontradas = a.getLetrasEjcontradas();
        int oportunidadesRestantes = jugadasMaximas - letrasEncontradas;
        System.out.println("Oportunidades restantes: " + oportunidadesRestantes);
        return oportunidadesRestantes;
    }
      public void juego(){
          bienvenida();
          crearJuego();
          longitud();
          int intentosRestantes;
          do {
              buscarLetra();
              intentosRestantes = intentos();
              longitud();
              if (intentosRestantes <= 0) {
                  break;
              }
          }while(true);
          despedida();
      }
      public void bienvenida(){
          System.out.println("¡Bienvenido al juego del ahorcado!");
          System.out.println("Comenzando el juego...");
      }
      public void despedida(){
          System.out.println("Hasta la proxima");
      }

}
