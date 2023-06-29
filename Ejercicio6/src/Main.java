public class Main {
    /**
     *
     *
     * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
     * (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
     * cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
     * métodos:
     *  Constructor predeterminado o vacío
     *  Constructor con la capacidad máxima y la cantidad actual
     * @param args
     */
    public static void main(String[] args) {
        ServiceCafetera sCaf  = new ServiceCafetera();
        sCaf.llenarCafetera();
        sCaf.servirTaza();
        sCaf.agregarCafe();
        sCaf.vaciarCafetera();
        sCaf.llenarCafetera();
    }
}