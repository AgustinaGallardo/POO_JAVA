import java.util.Scanner;

public class OperacionService {
    /**
     * d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
     *      * en los atributos del objeto.
     *      * e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
     *      * f) Método restar(): calcular la resta de los números y devolver el resultado al main
     *      * g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
     *      * fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
     *      * Si no, se hace la multiplicación y se devuelve el resultado al main
     *      * h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
     *      * una división por cero, el método devuelve 0 y se le informa al usuario el error se le
     *      * informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
     */


    public Operacion crearOperacion(Operacion o){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingrese un numero");
        o.setNum1(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese otro numero");
        o.setNum2(sc.nextInt());
        return o;
    }

    public double calcularSuma(Operacion o){
        double suma = o.getNum1() + o.getNum2();
        return suma;
    }
    public double calcularResta(Operacion o){
        double resta = o.getNum1() - o.getNum2();
        return resta;
    }
    public double calcularMulti(Operacion o){
        double multi = o.getNum1() * o.getNum2();
        return multi;
    }
    public double calcularDiv(Operacion o){
        double div = o.getNum1() / o.getNum2();
        return div;
    }

}
