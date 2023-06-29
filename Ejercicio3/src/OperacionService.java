import java.util.Scanner;

public class OperacionService {
    private Operacion o = new Operacion();

    public Operacion crearOperacion(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingrese un numero");
        o.setNum1(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese otro numero");
        o.setNum2(sc.nextInt());
        return o;
    }
    public double calcularSuma(){
        double suma = o.getNum1() + o.getNum2();
        return suma;
    }
    public double calcularResta(){
        double resta = o.getNum1() - o.getNum2();
        return resta;
    }
    public double calcularMulti(){
        double multi = o.getNum1() * o.getNum2();
        return multi;
    }
    public double calcularDiv(){
        double div = o.getNum1() / o.getNum2();
        return div;
    }

}
