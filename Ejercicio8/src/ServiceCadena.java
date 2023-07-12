import java.util.Scanner;

public class ServiceCadena {
    private Cadena c = new Cadena();

    public ServiceCadena() {
    }
    Scanner sc = new Scanner(System.in);

    public Cadena crearCadena(){
        System.out.println("Que frase quiere ingresar");
        String frase = sc.nextLine();
        String f = frase.toLowerCase();
        c.setFrase(f);
        c.setLongitud(frase.length());
        return c;
    }

    /**
     * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
     *      *      * frase ingresada.
     */

    public void mostrarVocales(){
        int vocales = 0;
        String cadena = c.getFrase();
        for (char letra : cadena.toCharArray()) {
            if(letra ==  'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vocales++;
            }

        }
        System.out.println("La cadena tiene " + vocales + " vocales");

    }

    /**
     *  * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
     *      *      * ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */

    public void invertirFrase(){
        String invertida = "";
        String cadena = c.getFrase();
        for(int i = cadena.length() - 1; i >= 0; i--)
        {
            invertida +=  cadena.charAt(i);
        }
        System.out.println("La cadena invertida es: " + invertida);
    }

    /**
     *  c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
     *    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
     *    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */

    public void vecesRepetido(){
        System.out.println("Que letra quiere contar cuantas veces se repite en la frase");
        String letraStr = sc.nextLine();
        char letra = letraStr.charAt(0);
        int conta = 0;
        String frase = c.getFrase();
        for(int i = 0; i < frase.length() - 1; i++) {
            if (letra ==(frase.charAt(i))){
                conta++;
            }
        }
        System.out.println("La letra " + letra + " se encuentra " + conta + " veces.");
    }

    /**
     *  *
     *  e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
     *   compone la clase con otra nueva frase ingresada por el usuario.
     */
public void compararLongitud(){
    System.out.println("Ingrese otra frase para comparar las longitudes");
    String fraseNueva = sc.nextLine();
    String frase = c.getFrase();
    int fraseN = fraseNueva.length();
    int fraseC = frase.length();
    if(fraseN == fraseC){
        System.out.println("La longitud de las cadenas es la misma");
    }else{
        System.out.println("Las cadenas tienen longitudes distintas");
    }
}

/**
 *  f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
 *      con una nueva frase ingresada por el usuario y mostrar la frase resultante.
 */

public void unirFrase(){
    System.out.println("Ingrese alguna frase para unir con la frase ingresada");
    String nueva = sc.nextLine();
    System.out.println( c.getFrase() + " , " + nueva);
}

/**
 *
 *      * g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
 *      * encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
 *      * la frase resultante.
 */

public void  reemplazar(){
    System.out.println("Por cual letra le gustaria reemplazar la a de la frase");
    String let = sc.nextLine();
    String frase = c.getFrase();
    String reemplazo = frase.replaceAll("a",let);
    System.out.println(reemplazo);
}
/**
 *   h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
 *      ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 *
 */

public void contiene(){
    System.out.println("Ingrese que letra le gustaria saber si esta contenida en la frase");
    String letra = sc.nextLine();
    boolean contiene = false;
    String frase = c.getFrase();
    for(int i = 0; i< frase.length();i++){
        if(letra.equals(frase.charAt(i))){
            contiene = true;
        }
    }
    System.out.println("La letra " +letra+ " se encuentra en la frase? " + contiene);
}

}
