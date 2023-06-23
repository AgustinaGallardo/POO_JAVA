import java.util.Scanner;

public class CancionService {
    Scanner sc = new Scanner(System.in);
    public Cancion crearCancion(Autor a){
        System.out.println("Ingrese el nombre de la cancion");
        String nombre = sc.nextLine();
        return new Cancion(nombre,a);
    }

    public void mostrarCancion(Autor a){
        Cancion c = crearCancion(a);
        System.out.println(c.toString());
    }
}
