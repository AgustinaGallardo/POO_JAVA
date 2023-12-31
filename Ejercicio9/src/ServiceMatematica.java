public class ServiceMatematica {

    Matematica m = new Matematica();

    public ServiceMatematica() {
        m.setNum1(Math.random());
        m.setNum2(Math.random());
    }

    public double devolverMayor(){
        double num1 = m.getNum1();
        double num2 = m.getNum2();
        if(num1 > num2){
            System.out.println("El numero mayor es: " + num1);
            return num1;
        }else{
            System.out.println("El numero mayor es: " + num2);
            return num2;
        }
    }
    /**
     *  * b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
     *      * elevado al menor número. Previamente se deben redondear ambos valores.
     *
     */

    public void calcularPotencia(){
        double base = devolverMayor();
        double expo = Math.min(m.getNum1(), m.getNum2());
        long baseR = Math.round(base);
        long expoR = Math.round(expo);

        double result = Math.pow(baseR,expoR);
        System.out.println("La potencia de los numeros " + m.getNum1() + " y " + m.getNum2() + " es iguala : " + result);
    }


/**
 * c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
 * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

public void calcularRaiz(){
    double menor = Math.min(m.getNum1(),m.getNum2());
    double menorAbs = Math.abs(menor);

    double raiz = Math.sqrt(menorAbs);

    System.out.println("La raiz es " + raiz);
}



}
