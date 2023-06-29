import java.util.Scanner;
public class ServicePersona {
private Persona p;
    public ServicePersona() {
        p = new Persona();
        crearPersona();
    }
    Scanner sc = new Scanner(System.in);
    public void crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        p.setNombre(nombre);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        sc.nextLine();
        p.setEdad(edad);
        System.out.println("Ingrese su altura");
        double altura = sc.nextDouble();
        sc.nextLine();
        p.setAltura(altura);
        System.out.println("Ingrese su peso");
        int peso = sc.nextInt();
        sc.nextLine();
        p.setPeso(peso);
        String sex = "";
        do{
            System.out.println("Ingrese su sexo H - M - O");
            sex = sc.nextLine();
            p.setSexo(sex);
         }while(!sex.equalsIgnoreCase("H") && !sex.equalsIgnoreCase("M") && !sex.equalsIgnoreCase("O"));
    }
    public int calcularIMC(){
        double peso = p.getPeso();
        double altura = p.getAltura();
        double IMC = peso / Math.pow(altura,2);
        if(IMC < 20 ){
            System.out.println("Está por debajo de su peso ideal");
            return -1;
        }else if(IMC >= 20 && IMC <= 25){
            System.out.println("Está en su peso ideal");
            return  0;
        }else {
            System.out.println("Tiene sobre peso");
            return 1;
        }
    }
    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if(p.getEdad()< 18){
            return mayor;
        }else{
            mayor=true;
            return mayor;
        }
    }
}
