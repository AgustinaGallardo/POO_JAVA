import java.util.Scanner;

public class ServiceCafetera {
    Cafetera caf = new Cafetera();
    Scanner sc = new Scanner(System.in);
    public void agregarCafe(){
        System.out.println("Ingrese la cantidad de cafe");
        int capCaf = sc.nextInt();
        int cantTotal = (capCaf + caf.getCapacidadActual());
        if(caf.getCapacidadMaxima() < cantTotal){
            capCaf += caf.getCapacidadActual();
            caf.setCapacidadActual(capCaf);
        }else{
            System.out.println("No entra todo el contenido en la cafetera");
            caf.setCapacidadActual(caf.getCapacidadMaxima());
        }
    }
    /**
     *    Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
     *      * máxima.
     */

        public void llenarCafetera(){
            caf.setCapacidadActual(caf.getCapacidadMaxima());
        }
    /**
     *  Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
     *      * tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
     *      * cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
     *      * método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
     *      * cuanto quedó la taza.
     */

    public void servirTaza(){
        System.out.println("Ingrese el tamaño de la taza vacia");
        int taza = sc.nextInt();
        int resto = 0;

        if(caf.getCapacidadActual()>taza) {
            caf.setCapacidadActual(caf.getCapacidadActual()-taza);
            System.out.println("La taza se lleno ");
        }else{
            System.out.println("No hay cafe suficiente");
            System.out.println("La taza quedo en " + resto);
           caf.setCapacidadActual(0);
        }
    }
    /** Método vaciarCafetera(): pone la cantidad de café actual en cero.
     *
     */
    public void vaciarCafetera(){
        caf.setCapacidadActual(0);
        System.out.println(" Se vacio la cafetera");
    }


}
