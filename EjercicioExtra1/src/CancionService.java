import java.util.Scanner;
public class CancionService {
    AutorService service = new AutorService();
    private Autor a;
    private Cancion c = new Cancion();
    Scanner sc = new Scanner(System.in);

    public CancionService() {
        a = service.crearAutor();
    }

    public Cancion crearCancion(){
        System.out.println("Ingrese el nombre de la cancion");
        String nombre = sc.nextLine();
        c.setAutor(a);
        c.setTitulo(nombre);
    return c;
    }
    public void mostrarCancion(){
        Cancion c = crearCancion();
        System.out.println(c.toString());
    }
}
