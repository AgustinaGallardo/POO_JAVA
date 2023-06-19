import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ServiceCadena service = new ServiceCadena();
        Scanner sc = new Scanner(System.in);

        System.out.println("Que frase quiere ingresar");
        String frase = sc.nextLine();

        service.crearCadena(frase);
        int vocales  = service.mostrarVocales(frase);
        System.out.println("La cadena tiene " + vocales + " vocales");

        String invertida = service.invertirFrase(frase);
        System.out.println("La cadena invertida es: " +invertida);

        System.out.println("Que letra quiere contar cuantas veces se repite en la frase");
        String letraStr = sc.nextLine();
        char letra = letraStr.charAt(0);
        service.vecesRepetido(letra, frase);

        System.out.println("Ingrese otra frase para comparar las longitudes");
        String fraseNueva = sc.nextLine();
        service.compararLongitud(frase,fraseNueva);

        System.out.println("Ingrese alguna frase para unir con la frase ingresada");
        String nueva = sc.nextLine();
        service.unirFrase(frase,nueva);

        System.out.println("Por cual letra le gustaria reemplazar la a de la frase");
        String let = sc.nextLine();
        service.reemplazar(let,frase);

        System.out.println("Ingrese que letra le gustaria saber si contenida en la frase");
        String contiene = sc.nextLine();
        boolean esta = service.contiene(contiene, frase);
        System.out.println("Esta contenida: " + esta);








    }
}