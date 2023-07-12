import java.util.Calendar;
import java.util.Scanner;

public class AlquilerService {
    private Alquiler alquiler;
    private PeliculaService servicePeli;
    private int contador = 0;
    private Pelicula[] peliculasAlquiladas = new Pelicula[100];
    private Alquiler[] listaDeAlquileres = new Alquiler[100];
    Scanner sc = new Scanner(System.in);

    public AlquilerService(PeliculaService servicePeli) {
        this.servicePeli = servicePeli;
    }

    public Alquiler crearAlquiler(){
         alquiler = new Alquiler();

        System.out.println("Que pelicula quiere alquilar");
        String titulo = sc.nextLine();
        //setear el boolean set pelicula SET
        //
        Pelicula p = servicePeli.getPelicula(titulo);

        System.out.println("Ingrese el dia que alquilo la pelicula");
        int dia = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el mes que alquilo la peli");
        int mes = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el año que alquilo");
        int anio = sc.nextInt();
        sc.nextLine();
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio,mes -1,dia);
        alquiler.setFehcaInicio(fecha);
        System.out.println("Ingrese el dia regreso la pelicula");
        int diaR = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el mes alquilo la peli");
        int mesR = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el año alquilo");
        int anioR = sc.nextInt();
        sc.nextLine();
        Calendar fechaR = Calendar.getInstance();
        fechaR.set(anioR,mesR -1,diaR);
        alquiler.setFechaFin(fechaR);

        System.out.println("Ingrese el precio del alquiler");
        alquiler.setPrecio(sc.nextDouble());
        sc.nextLine();

        alquiler.setPelicula(p);
        agregarPeliculaAlquilada(p);
        agregarAlquiler(alquiler);

        return alquiler;
    }
    public void agregarPeliculaAlquilada(Pelicula p) {
        if(contador < peliculasAlquiladas.length){
            peliculasAlquiladas[contador]= p;
            contador ++;
        }
    }
    public void agregarAlquiler(Alquiler a) {
        if(contador < listaDeAlquileres.length){
            listaDeAlquileres[contador]= a;
            contador ++;
        }
    }
    public void listarAlquileres(){
        for (Alquiler a: listaDeAlquileres
        ) {
            if(a != null){
                System.out.println(a);
            }
        }
    }
    public void listarPeliculasAlquiladas(){
        for (Pelicula p: peliculasAlquiladas
             ) {
            if(p != null){
                System.out.println(p.getTitulo());
            }
        }
    }
/**
 * 
 * Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de
 * interés.)
 */

    public void alquilerPorFecha(Calendar fechaBusqueda){
    boolean encontrado = false;
        for (Alquiler a: listaDeAlquileres) {
            Calendar fechaInicio = alquiler.getFehcaInicio();
            if (fechaInicio.get(Calendar.YEAR) == fechaBusqueda.get(Calendar.YEAR) &&
                    fechaInicio.get(Calendar.MONTH) == fechaBusqueda.get(Calendar.MONTH) &&
                    fechaInicio.get(Calendar.DAY_OF_MONTH) == fechaBusqueda.get(Calendar.DAY_OF_MONTH)
            ) {
                encontrado = true;
                System.out.println("La pelicula alquilada en esa fecha es: " + a.getPelicula().getTitulo() );

            }else {
                System.out.println("No hay ninguna pelicula alquilada en esa fecha");
            }
        }
    }
        public void ingresoTotal() {
        double ingresoTotal = 0;
            for (Alquiler a: listaDeAlquileres
                 ) {
                Calendar fechaInicio = a.getFehcaInicio();
                Calendar fechaFin = a.getFechaFin();
                int diaInicio = fechaInicio.get(Calendar.DAY_OF_MONTH);
                int diaFin = fechaFin.get(Calendar.DAY_OF_MONTH);
                int diasAlquiler = diaFin - diaInicio + 1;

                double costoAlquiler = 10 * diasAlquiler;

                if (diasAlquiler > 3) {
                    int diasExtras = diasAlquiler - 3;
                    double costoExtras = costoAlquiler * 0.1 * diasExtras;
                    costoAlquiler += costoExtras;
                }

                ingresoTotal += costoAlquiler;
            }

            System.out.println("El ingreso total del servicio es: $" + ingresoTotal);
        }



}
