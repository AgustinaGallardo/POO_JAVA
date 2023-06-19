import java.util.Scanner;

public class CuentaService {
    /**
     * d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
     *      * y se la sumara a saldo actual.
     *      * e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
     *      * la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
     *      * pondrá el saldo actual en 0.
     *      * f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
     *      * usuario no saque más del 20%.
     *      * g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
     *      * h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
     * @return
     */

    Scanner sc = new Scanner(System.in);
    Cuenta cuenta = new Cuenta();
    public Cuenta crearCuenta(Cuenta c){
        System.out.println("Ingrese su dni");
        c.setDni(sc.nextBigInteger());
        System.out.println("Ingrese el numero de cuenta");
        c.setNroCuenta(sc.nextInt());
        System.out.println("Ingrese el saldo");
        c.setSaldo(sc.nextInt());
        return c;
    }
    public void ingresoCuenta(Cuenta c){
        System.out.println("Cuanto dinero quiere depositar");
        int ingreso = sc.nextInt();
        int saldo = c.getSaldo();
        c.setSaldo(ingreso+saldo);
        System.out.println(c);
    }
    public void retirarDinero(Cuenta c){
        System.out.println("Cuánto quiere retirar");
        int retiro = sc.nextInt();
        int saldo = c.getSaldo();
        if (retiro <= saldo) {
            c.setSaldo(saldo - retiro);
            System.out.println(c);
        } else {
            c.setSaldo(0);
            System.out.println("La cuenta quedó en 0. Solo puede retirar: " + saldo);
        }
    }
    public void extraccionRapida(Cuenta c){
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
    public void verSaldo(Cuenta c){
        System.out.println("El saldo de la cuenta es de: " + c.getSaldo());
    }
    public void consultarDatos(Cuenta c){
        System.out.println(c.toString());
    }
}
