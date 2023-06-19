import java.util.Scanner;

public class RectanguloService {
/**
 * La clase incluirá un método para crear el rectángulo
 *      * con los datos del Rectángulo dados por el usuario. También incluirá un método para
 *      * calcular la superficie del rectángulo y un método para calcular el perímetro del
 *      * rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
 *      * asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
 *      * setters y constructores correspondientes.
 *      * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */

public Rectangulo crearRectangulo(){
    Scanner sc = new Scanner(System.in);
    Rectangulo rec = new Rectangulo();
    System.out.println("Ingrese la altura del rectangulo");
    rec.setAltura(sc.nextInt());
    System.out.println("Ingrese la base");
    rec.setBase(sc.nextInt());
    return rec;
}


public int calcularSuperficie(Rectangulo r){
    int sup = r.getAltura() * r.getBase();
    return sup;
}

public int calcularPerimetro(Rectangulo r){
    int perimetro = (r.getBase() + r.getAltura()) * 2;
    return perimetro;

}
public void dibujarRectangulo(Rectangulo r){

    for (int i = 0 ; i < r.getAltura(); i++){
        for(int j = 0 ; j < r.getBase();j++) {
            if (i == 0 || i == r.getAltura() - 1 || j == 0 || j == r.getBase() - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
            System.out.println();
        }



}


}
