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
        Cafetera caf = new Cafetera();
        sCaf.llenarCafetera(caf);
        sCaf.servirTaza(caf);
        sCaf.agregarCafe(caf);
        sCaf.vaciarCafetera(caf);
        sCaf.llenarCafetera(caf);
        System.out.println(caf.toString());
    }
}