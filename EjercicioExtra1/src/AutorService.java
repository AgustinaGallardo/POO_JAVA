import java.util.Scanner;

public class AutorService {
    Scanner sc = new Scanner(System.in);
    public Autor crearAutor(){
        System.out.println("Ingrese el nombre del artista");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la nacionalidad");
        String nac = sc.nextLine();
        return new Autor(nombre,nac);
    }


}
