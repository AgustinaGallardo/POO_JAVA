import java.util.Scanner;

public class CuentaService {

    Scanner sc = new Scanner(System.in);
    Cuenta c = new Cuenta();
    public Cuenta crearCuenta(){
        System.out.println("Ingrese su dni");
        c.setDni(sc.nextBigInteger());
        System.out.println("Ingrese el numero de cuenta");
        c.setNroCuenta(sc.nextInt());
        System.out.println("Ingrese el saldo");
        c.setSaldo(sc.nextInt());
        return c;
    }
    public void depositar(){
        System.out.println("Cuanto dinero quiere depositar");
        int ingreso = sc.nextInt();
        sc.nextLine();
        int saldo = c.getSaldo();
        c.setSaldo(ingreso+saldo);
        System.out.println(c);
    }
    public void retirarDinero(){
        System.out.println("Cuánto quiere retirar");
        int retiro = sc.nextInt();
        sc.nextLine();
        int saldo = c.getSaldo();
        if (retiro <= saldo) {
            c.setSaldo(saldo - retiro);
            System.out.println(c);
        } else {
            c.setSaldo(0);
            System.out.println("La cuenta quedó en 0. Solo puede retirar: " + saldo);
        }
    }
    public void extraccionRapida(){
        int saldo = c.getSaldo();
        int retiro = saldo / 5;

        if (retiro <= saldo) {
            int queda = saldo - retiro;
            c.setSaldo(queda);
            System.out.println(c);
        } else {
            System.out.println("No puede retirar más del 20% del saldo.");
        }
    }
    public void verSaldo(){
        System.out.println("El saldo de la cuenta es de: " + c.getSaldo());
    }
    public void consultarDatos(){
        System.out.println(c.toString());
    }
}
