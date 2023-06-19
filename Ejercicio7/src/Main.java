import java.util.Scanner;

public class Main {
    /**

     * A continuación, en la clase main hacer lo siguiente:
     * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
     * los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
     * tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
     * persona es mayor de edad.
     * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
     * distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
     * cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
     * también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
     * @param args
     *

     *         */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantMayores = 0;
        int cantMenores = 0;
        int cantPesoIdeal = 0;
        int cantSobrePeso = 0;
        int cantFaltaPeso = 0;
        int IMC =0;
        boolean mayor = false;

        System.out.println("Cuantas personas va a ingresar al sistema");
        int per = sc.nextInt();

          for(int i =0; i < per ; i ++){
              Persona p =  new Persona();
              ServicePersona service = new ServicePersona();
              service.crearPersona(p);
               IMC = service.calcularIMC(p);
               mayor = service.esMayorDeEdad(p);
              switch (IMC) {
                  case 0:
                      cantPesoIdeal++;
                      break;
                  case -1:
                      cantFaltaPeso++;
                      break;
                  case 1:
                      cantSobrePeso++;
                      break;
              }

              if(mayor){
                  cantMayores++;
              }else{
                  cantMenores++;
              }

              int porcenMayores = (cantMayores * 100) / per;
              int porcenMenores = (cantMenores * 100) / per;
              int porPesoIdeal = (cantPesoIdeal * 100) / per;
              int porSobrePeso = (cantSobrePeso * 100) / per;
              int porFaltaPeso = (cantFaltaPeso * 100) / per;


      }
    }
}