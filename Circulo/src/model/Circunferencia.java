package model;

public class Circunferencia {
    private double radio;

    @Override
    public String toString() {
        return "Circunferencia{" +
                "radio=" + radio +
                '}';
    }

    public double getRadio() {
        return radio;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {

    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
