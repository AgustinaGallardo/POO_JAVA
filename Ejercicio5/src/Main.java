import java.util.Scanner;

public class Main {

    /**
     * 5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
     * numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
     * Las operaciones asociadas a dicha clase son:
     * a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
     * b) Agregar los métodos getters y setters correspondientes
     * c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
     * d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
     * y se la sumara a saldo actual.
     * e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
     * la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
     * pondrá el saldo actual en 0.
     * f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
     * usuario no saque más del 20%.
     * g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
     * h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaService service = new CuentaService();
        Cuenta c = new Cuenta();

       service.crearCuenta(c);

       service.consultarDatos(c);

        System.out.println("Quiere una extraccion rapida SI/NO");
        String extra = sc.nextLine();

        if(extra.equalsIgnoreCase("SI"))
        {
            service.extraccionRapida(c);
        }

        System.out.println("Quiere depositar dinero SI/NO");
        String deposito = sc.nextLine();

        if(deposito.equalsIgnoreCase("SI"))
        {
            service.ingresoCuenta(c);
        }

        System.out.println("quiere retirar dinero SI/NO");
        String retiro = sc.nextLine();

        if(retiro.equalsIgnoreCase("SI")){
            service.retirarDinero(c);
        }

        System.out.println("quiere ver el saldo SI/NO");
        String saldo = sc.nextLine();

        if(saldo.equalsIgnoreCase("SI")){
            service.verSaldo(c);
        }

        System.out.println("ADIOS");






    }
}