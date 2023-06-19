public class ServiceCadena {
       public Cadena crearCadena(String frase){
        Cadena c = new Cadena();
        String f = frase.toLowerCase();
        c.setFrase(f);
        c.setLongitud(frase.length());
        return c;
    }

    /**
     * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
     *      *      * frase ingresada.
     */

    public int mostrarVocales(String c){
        int vocales = 0;
        for (char letra : c.toCharArray()) {
            if(letra ==  'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vocales++;
            }

        }
        return vocales;
    }

    /**
     *  * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
     *      *      * ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */

    public String invertirFrase(String c){

        String invertida = "";
        for(int i = c.length() - 1; i >= 0; i--)
        {
            invertida +=  c.charAt(i);
        }
        return invertida;
    }

    /**
     *  c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
     *    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
     *    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */

    public void vecesRepetido(char letra, String frase){
        int conta = 0;
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
public void compararLongitud(String frase, String fraseNueva){
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

public void unirFrase(String frase, String cadena){
    System.out.println( frase + " , " + cadena);
}

/**
 *
 *      * g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
 *      * encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
 *      * la frase resultante.
 */

public void  reemplazar(String letra, String c){
         String reemplazo = c.replaceAll("a",letra);
    System.out.println(reemplazo);
}
/**
 *   h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
 *      ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 *
 */

public boolean contiene(String letra, String c){
    boolean contiene = false;
    for(int i = 0; i< c.length();i++){
        if(letra.equals(c.charAt(i))){
            return true;
        }
    }
    return contiene;
}


}
