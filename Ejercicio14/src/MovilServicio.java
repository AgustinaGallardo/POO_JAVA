import java.util.Scanner;

public class MovilServicio {

    /**
     *  Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
     *    instanciar un objeto Celular y poder cargarlo en nuestro programa.
     */

    Scanner sc = new Scanner(System.in);
    public Movil cargarCelular(){
        System.out.println("Ingrese la marca del celular");
        String marca = sc.nextLine();
        System.out.println("Ingrese el precio del movil");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese la cantidad de memoria ram");
        int memoria = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la cantidad de almacenamiento");
        int almacenamiento = sc.nextInt();
        sc.nextLine();
        int[] codigo = ingresarCodigo();
        return new Movil(marca,precio,memoria,almacenamiento,codigo);
    }


    /**
     *  Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
     * números de un celular. Para ello, puede utilizarse un bucle repetitivo
     *
     */


    public int[] ingresarCodigo(){
        int[] codigo = new int[7];
        for(int i =0; i< codigo.length;i++){
            System.out.println("Ingrese el codigo " + (i + 1) + " para ir cargando elcodigo");
            int c = sc.nextInt();
            sc.nextLine();
            codigo[i] = c;
        }
        return codigo;
    }

    public void mostrarMovil(){
        Movil m = cargarCelular();
        System.out.println(m.toString());
    }
}
