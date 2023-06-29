import model.Circunferencia;
import model.ServiceCirculo;

public class Main {

    /**
     * 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
     * tipo real. A continuación, se deben crear los siguientes métodos:
     * a) Método constructor que inicialice el radio pasado como parámetro.
     * b) Métodos get y set para el atributo radio de la clase Circunferencia.
     * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
     * objeto.
     * d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
     * e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
     *
     */
    public static void main(String[] args) {
        ServiceCirculo service = new ServiceCirculo();
        service.crearCircunferencia();
        double area =  service.calcularArea();
        double perimetro = service.calcularPerimetro();
        System.out.println("El area del circulo es de: " + Math.round(area) + " y el perimero es: " + Math.round(perimetro));

    }
}