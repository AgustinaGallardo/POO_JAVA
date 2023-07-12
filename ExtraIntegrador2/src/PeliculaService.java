import java.util.Calendar;
import java.util.Scanner;

public class PeliculaService {
    private Pelicula p;
    private int contador = 0;
    private Pelicula[] listaPeliculas = new Pelicula[100];
    Scanner sc = new Scanner(System.in);
    public Pelicula crearPelicula(){
        p = new Pelicula();
        System.out.println("Ingrese el nombre de la pelicula");
        String titulo = sc.nextLine();
        p.setTitulo(titulo);
        System.out.println("Ingrese el genero");
        p.setGenero(sc.nextLine());
        System.out.println("Ingrese la duracion");
        p.setDuracion(sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese el año de estreno");
        sc.nextInt();
        sc.nextLine();
        agregarPelicula(p);
        return p;
    }
    public void agregarPelicula(Pelicula p){
        System.out.println("***                           ***");
        if(contador < listaPeliculas.length){
            listaPeliculas[contador] = p;
            System.out.println("Se agrego " + p.getTitulo() + " a la lista de peliculas.");
        }else{
            System.out.println("No se pudo agregar " + p.getTitulo() + " a la lista de peliculas.");
        }
        contador++;
        System.out.println("***                           ***");
    }
    public void listarPeliculas(){
        System.out.println("***                           ***");
        System.out.println(" Las peliculas disponibles son: ");
        for (Pelicula p : listaPeliculas) {
            if (p != null){
                System.out.println( p.getTitulo());
            }
        }
        System.out.println("***                           ***");
    }
    public void existePelicula(String titulo){
        boolean encontrada = false;
        for (Pelicula p : listaPeliculas) {
            if (p != null && titulo.equalsIgnoreCase(p.getTitulo())) {
                encontrada = true;
                break;
            }
        }
            if(encontrada){
                System.out.println("***                           ***");
                System.out.println(titulo + " se encuentra en la lista de peliculas.");
                System.out.println("***                           ***");
            } else {
                System.out.println("***                           ***");
                System.out.println(titulo + " no se encuentra en la lista de peliculas.");
                System.out.println("***                           ***");
            }
    }

    public void exiteGenero(String titulo){
        boolean existe = false;
        for (Pelicula p : listaPeliculas) {
            if (titulo.equalsIgnoreCase(p.getGenero())) {
                existe = true;
                break;
            }
        }
            if(existe){
                System.out.println("***                           ***");
                System.out.println( "Se encuentra en la lista de peliculas.");
                System.out.println("***                           ***");
            }else{
                System.out.println("***                           ***");
                System.out.println("No se encuentra en la lista de pliculas.");
                System.out.println("***                           ***");
            }
    }
    public Pelicula getPelicula(String titulo) {
        for (Pelicula p : listaPeliculas) {
            if (p != null && p.getTitulo().equalsIgnoreCase(titulo)) {
                return p;
            }
        }
        System.out.println("No se encuentra disponible en este momento");
        return null;
    }




}
