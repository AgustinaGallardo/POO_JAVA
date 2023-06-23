import java.util.Arrays;
import java.util.Random;

public class Main {

    /**
     * 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
     * de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
     * programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
     * Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
     * ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
     * 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
     * 20.
     */
    public static void main(String[] args) {
        double[] arregloA = new double[5];
        double[] arregloB = new double[3];
        Random random = new Random();
        System.out.println("El primer arreglo esta formado por los sigueintes numeros: ");
        for(int i = 0; i < arregloA.length; i++){
            arregloA[i] = random.nextDouble();
            System.out.println(arregloA[i]);
        }
        Arrays.sort(arregloA);
        System.out.println("El segundo arreglo esta formado por: ");
        for(int i = 0; i < arregloB.length; i++){
            arregloB[i] = arregloA[i];
            System.out.println(arregloB[i]);
        }



    }
}