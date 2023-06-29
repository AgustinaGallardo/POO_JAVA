public class RaicesService {


    Raices r = new Raices();

    public RaicesService() {
        r.setA(4);
        r.setB(8);
        r.setC(2);
    }

    public double getDiscriminante(){
       double a = r.getA();
       double b = r.getB();
       double c = r.getC();
        double  discriminate = (b*b)-4*a*c;
    return discriminate;
    }
    /***  Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
     *      * que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(){
        double discriminate = getDiscriminante();
        boolean tiene;
        if(discriminate >= 0){
            tiene = true;
        }else{
            tiene=false;
        }
        return tiene;
    }
    /**
     * Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
     * que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(){
        double discriminate = getDiscriminante();
        boolean tiene;
        tiene = discriminate == 0;
        return tiene;
    }
    /**  Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
     *     posibles soluciones.
     */
    public void obtenerRaices(){
        double discriminante = getDiscriminante();
        double a = r.getA();
        double b = r.getB();
        double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        System.out.println("Raíz 1: " + raiz1);
        System.out.println("Raíz 2: " + raiz2);
    }
      public void obtenerRaiz(){
        double b = r.getB();
        double a = r.getA();
        double raiz = -b / (2 * a);
        System.out.println("Raíz única: " + raiz);
    }
/**
 *   *  Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
 *  *      * pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
 *         obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
 *  *      de no existir solución, se mostrará un mensaje.
 */
    public void calcular(){
        double discriminante = getDiscriminante();
        if (tieneRaices()) {
            obtenerRaices();
        } else if(tieneRaiz()){
            obtenerRaiz();
        }else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}
