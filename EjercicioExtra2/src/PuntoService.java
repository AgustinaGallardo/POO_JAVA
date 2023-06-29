import java.util.Scanner;
/**  Generar un objeto puntos
 *   usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
 *   los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
 *   que existe entre los dos puntos que existen en la clase Puntos.
 */

public class PuntoService {

    private Punto punto;

    public PuntoService() {
        punto = new Punto();
        crearPuntos();
    }

    Scanner sc = new Scanner(System.in);
    public Punto crearPuntos(){
        System.out.println("Ingrese el lado x del primer punto");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el lado y del primer punto");
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el lado x2 del primer punto");
        int x2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el lado x2 del primer punto");
        int y2 = sc.nextInt();
        sc.nextLine();
        return new Punto(x,y,x2,y2);
    }
    public void calcularDistancia(){
        Punto p = crearPuntos();
        int x = p.getX();
        int y = p.getY();
        int x2 = p.getX2();
        int y2 = p.getY2();
        double primerT = Math.pow((x2 - x), 2);
        double segundoT = Math.pow((y2 - y), 2);
        double total = primerT + segundoT;
        double raiz = Math.sqrt(total);
        System.out.println("La distancia que hay entre los putnos es de: " + raiz);
    }
}
