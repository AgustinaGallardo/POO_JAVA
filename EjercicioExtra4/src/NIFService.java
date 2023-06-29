import java.util.Scanner;

public class NIFService {
    private NIF nif = new NIF();
    Scanner sc = new Scanner(System.in);
    public void crearNif(){
        System.out.println("Ingrese su numero de dni");
        long dni = sc.nextLong();
        char letra = calcularLetra();
        nif.setDni(dni);
        nif.setLetra(letra);
        mostrar();
    }
    private char calcularLetra() {
       long dni =  nif.getDni();
        char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = (int) (dni % 23);
        return letras[resto];
    }
    /**
     * *  Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
     *      *      * en mayúscula; por ejemplo: 00395469-F).
     */
    public void mostrar(){
        long dni = nif.getDni();
        String dniFormatted = String.format("%08d", dni); // Formatear con ceros iniciales
        String letra = String.valueOf(nif.getLetra());
        System.out.println(dniFormatted + " - " + letra);
    }
}
