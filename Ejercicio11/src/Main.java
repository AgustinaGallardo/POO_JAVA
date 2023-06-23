import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    /**
     * 11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
     * clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
     * Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
     * usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
     * deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
     * se puede conseguir instanciando un objeto Date con constructor vacío.
     * Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
     * Ejemplo fecha actual: Date fechaActual = new Date();
     * @param args
     */
    public static void main(String[] args) {

        Date fecha = new Date(1989,07,24);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año actual");
        int anioActual = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese el dia");
        int dia = sc.nextInt();
        Date fechaActual = new Date(anioActual,mes,dia);
        int anios = fecha.getYear();
        int total =  anioActual - anios;
        System.out.println("Los años que hay entre esa fecha y la fecha actual es de: " + total + " años");
        sc.nextLine();

        //OTRA FORMA DE RESOLVERLO:

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Ingrese la fecha (formato dd/MM/yyyy):");
        String fechaString = sc.nextLine();

        try {
            Date fechaOptima = dateFormat.parse(fechaString);
            System.out.println("Fecha ingresada: " + fechaString);
        } catch (ParseException e) {
            System.out.println("Fecha ingresada inválida");
        }
        System.out.println(fechaString);






    }
}