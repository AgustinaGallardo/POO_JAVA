import java.util.Scanner;

public class ServicePersona {


/**
 *  Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
 *      * al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
 *      * Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
 *      * O. Si no es correcto se deberá mostrar un mensaje
 */

 Scanner sc = new Scanner(System.in);
public void crearPersona(Persona p){
    System.out.println("Ingrese su nombre");
    String nombre = sc.nextLine();
    p.setNombre(nombre);
    System.out.println("Ingrese su edad");
    int edad = sc.nextInt();
    p.setEdad(edad);
    System.out.println("Ingrese su altura");
    double altura = sc.nextDouble();
    p.setAltura(altura);
    System.out.println("Ingrese su peso");
    int peso = sc.nextInt();
    p.setPeso(peso);
    String sex = "";
    do{
        System.out.println("Ingrese su sexo H - M - O");
        sex = sc.nextLine();
        p.setSexo(sex);
     }while(!sex.equalsIgnoreCase("H") && !sex.equalsIgnoreCase("M") && !sex.equalsIgnoreCase("O"));
}

/**
 *      *  Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 *      * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
 *      * significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
 *      * Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
 *      * persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
 *      * de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
 *      * función devuelve un 1.*/

public int calcularIMC(Persona p){
    double peso = p.getPeso();
    double altura = p.getAltura();
    double IMC = peso / Math.pow(altura,2);
    if(IMC < 20 ){
        System.out.println("Está por debajo de su peso ideal");
        return -1;
    }else if(IMC >= 20 && IMC <= 25){
        System.out.println("Está en su peso ideal");
        return  0;
    }else {
        System.out.println("Tiene sobre peso");
        return 1;
    }
}
    /**    *  Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
     *      * devuelve un booleano.
     */
public boolean esMayorDeEdad(Persona p){
    boolean mayor = false;
    if(p.getEdad()< 18){
        return mayor;
    }else{
        mayor=true;
        return mayor;
    }
}

}
