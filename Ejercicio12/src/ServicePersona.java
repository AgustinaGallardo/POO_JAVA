import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ServicePersona {
    /**
     *  crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
     *   usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
     *  fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
     */
    Scanner sc = new Scanner(System.in);
    public void crearPersona(Persona p){
        System.out.println("Ingrese el nombre");
        p.setNombre(sc.nextLine());
        System.out.println("Ingrese el año de nacimiento");
        int anio = sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = sc.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        int dia = sc.nextInt();
        sc.nextLine();

        Calendar fecha = Calendar.getInstance();
        fecha.set(Calendar.YEAR, anio);
        fecha.set(Calendar.MONTH, mes - 1); // Los meses en Calendar están basados en 0, por lo que se resta 1
        fecha.set(Calendar.DAY_OF_MONTH, dia);

        p.setFecha_nac(fecha);
    }

    /**
     *   Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
     *    en cuenta que para conocer la edad de la persona también se debe conocer la fecha
     *    actual.
     */
    public int calcularEdad(Persona p){
        Calendar fecha = p.getFecha_nac();
        int year = fecha.get(Calendar.YEAR);

        Calendar fechaActual = Calendar.getInstance();

        return  fechaActual.get(Calendar.YEAR) - fecha.get(Calendar.YEAR);
    }

    /**
     *   Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
     *       edad y retorna true en caso de que el receptor tenga menor edad que la persona que
     *       se recibe como parámetro, o false en caso contrario.
     */

    public boolean menorQue(int edad, Persona p){
        Calendar edadP = p.getFecha_nac();
        Calendar fechaActual = Calendar.getInstance();
        int yearNacimiento = edadP.get(Calendar.YEAR);
        int yearActual = fechaActual.get(Calendar.YEAR);

        int edadActual = yearActual - yearNacimiento;

        return edadActual < edad;
    }
    /**
     *   Metodo mostrarPersona(): este método muestra la persona creada en el método
     *      * anterior.
     */
    public void mostrarPersona(Persona p){
        System.out.println(p.toString());
    }

}
