public class Main {

    /**
     * 9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
     * los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
     * constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
     * Math.random para generar los dos números y se guardaran en el objeto con su
     * respectivos set. Deberá además implementar los siguientes métodos:
     *
     *
     */
    public static void main(String[] args) {
        ServiceMatematica service = new ServiceMatematica();
        service.devolverMayor();
        service.calcularPotencia();
        service.calcularRaiz();
    }
}