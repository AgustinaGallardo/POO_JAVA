import java.util.Scanner;

public class RectanguloService {
    private Rectangulo r = new Rectangulo();
    public Rectangulo crearRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo");
        r.setAltura(sc.nextInt());
        System.out.println("Ingrese la base");
        r.setBase(sc.nextInt());
        return r;
    }
    public int calcularSuperficie(){
        int sup = r.getAltura() * r.getBase();
        return sup;
    }
    public int calcularPerimetro(){
        int perimetro = (r.getBase() + r.getAltura()) * 2;
        return perimetro;
    }
    public void dibujarRectangulo(){
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
