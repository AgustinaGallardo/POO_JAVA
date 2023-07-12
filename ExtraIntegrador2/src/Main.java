import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * System.out.println("Ingrese la fecha en el formato DD MM AAAA");
 * int dia = Integer.parseInt(sc.next());
 * int mes = Integer.parseInt(sc.next());
 * int anio = Integer.parseInt(sc.next());
 * Date fecha = new Date(anio-1900, mes-1, dia);
 * System.out.println(fecha);    }
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeliculaService peliculaService = new PeliculaService();
        AlquilerService alquilerService = new AlquilerService(peliculaService);
        int num = -1;
        System.out.println("Bienvenidos al alquiler de peliculas");

        do {
            System.out.println("Ingrese el numero que necesita:");
            System.out.println("1: Ingresar una pelicula nueva");
            System.out.println("2: Listar las peliculas disponibles");
            System.out.println("3: Alquilar una pelicula");
            System.out.println("4: Ver todas las peliculas alquiladas");
            System.out.println("5: Ver todos los alquileres");
            System.out.println("6: Buscar una pelicula");
            System.out.println("7: Buscar un genero");
            System.out.println("8: Buscar un alquiler por fecha");
            System.out.println("9: Conocer el ingreso total de los alquileres");
            System.out.println("0: para salir");
             num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 1:
                    peliculaService.crearPelicula();
                    break;
                case 2:
                    peliculaService.listarPeliculas();
                    break;
                case 3:
                    alquilerService.crearAlquiler();
                    break;
                case 4:
                    alquilerService.listarPeliculasAlquiladas();
                    break;
                case 5:
                    alquilerService.listarAlquileres();
                    break;
                case 6:
                    System.out.println("Ingrese el titulo de la pelicula que busca");
                    String titulo = sc.nextLine();
                    peliculaService.existePelicula(titulo);
                    break;
                case 7:
                    System.out.println("Ingrese el genero que busca");
                    String genero = sc.nextLine();
                    peliculaService.exiteGenero(genero);
                    break;
                case 8:

                    /**
                     *  se espera que la fecha se ingrese en el formato "dd/MM/yyyy".
                     *  Luego, se crea un objeto SimpleDateFormat con el mismo formato
                     *  y se utiliza para analizar la cadena de fecha ingresada en un objeto Date.
                     *  A continuación, se establecen los valores del objeto Calendar utilizando el
                     *  método setTime y finalmente se llama al método buscarAlquilerPorFecha pasando
                     *  el objeto Calendar como argumento.
                     * Si el usuario ingresa una fecha en un formato incorrecto, se captura la excepción Exception
                     * y se muestra un mensaje de error.
                     */


                    System.out.println("Ingrese la fecha en la que busca el alquiler (dd/MM/yyyy):");
                    String fechaStr = sc.nextLine();

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Calendar fechaBusqueda = Calendar.getInstance();

                    try {
                        fechaBusqueda.setTime(dateFormat.parse(fechaStr));
                        alquilerService.alquilerPorFecha(fechaBusqueda);
                    } catch (Exception e) {
                        System.out.println("Fecha ingresada en un formato inválido.");
                    }
                    alquilerService.alquilerPorFecha(fechaBusqueda);
                case 9:
                    alquilerService.ingresoTotal();
            }
        }while(num != 0);
        System.out.println("Adios, Muchas gracias!!");
    }
}