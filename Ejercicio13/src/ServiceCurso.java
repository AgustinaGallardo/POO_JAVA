import java.util.Scanner;

public class ServiceCurso {

    /**
     *   método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
     *      *      * que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
     *      *      * en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
     *      *      * nombre de cada alumno.
     */
    Scanner sc = new Scanner(System.in);
    public String[] cargarAlumnos(){
        String[] alumnos = new String[5];
        String apellido = "";

        for(int i =0; i < alumnos.length; i++){
            System.out.println("Ingrese el nombre del alumno: " + (i+1) + ": ");
            apellido = sc.nextLine();
            alumnos[i] = apellido;
        }
        return alumnos;
    }

    /**
     *  *  Método crearCurso(): el método crear curso, le pide los valores de los atributos al
     *      *      * usuario y después se le asignan a sus respectivos atributos para llenar el objeto
     *      *      * Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
     *      *      * al atributo alumnos
     */
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso = sc.nextLine();
        System.out.println("Ingrese la cantidad de horas por dia");
        int cantidadHoras = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la cantidad de horas por semana");
        int horasPorSemana = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese 1 si el turno es mañana o 2 si es por la tarde");
        int turno = sc.nextInt();
        boolean turnoM = true;
        sc.nextLine();
        System.out.println("Ingrese el precio por hora");
        double precioPorHora = sc.nextDouble();
        if(turno != 1){
            turnoM = false;
        }
        String[] alumnos = cargarAlumnos();
        return new Curso(nombreCurso,cantidadHoras,horasPorSemana,turnoM,precioPorHora,alumnos);
    }

    /**
     *   Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
     *   en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
     *   día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
     *   se repite el encuentro.
     */
    public void  calcularGananciaSemanal(){
        Curso c = crearCurso();
        int catidadHorasPorDia = c.getCantidadHorasPorDia();
        double precio = c.getPrecioPorHora();
        double horasXprecio = catidadHorasPorDia * precio;
        double porAlumnos = horasXprecio * c.getAlumnos().length;
        double porSemana = porAlumnos * c.getCantidadHorasPorSemana();
        System.out.println("La ganancia en una semana por curso es de: " + porSemana);
    }


}
