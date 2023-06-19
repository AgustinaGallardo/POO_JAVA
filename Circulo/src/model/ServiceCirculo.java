package model;

import java.util.Scanner;

public class ServiceCirculo {

    public Circunferencia crearCircunferencia(Circunferencia c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la circunferencia del circulo");
        double radio = sc.nextDouble();
        c.setRadio(radio);
        return c;
    }
    public double calcularArea(Circunferencia c){
     double radio = c.getRadio();
     double area = 3.1416 * Math.pow(radio,2);
        return area;
    }

    public double calcularPerimetro(Circunferencia c){
        double radio = c.getRadio();
        double perimetro = 3.14 * 2 * radio;
        return perimetro;
    }


}
