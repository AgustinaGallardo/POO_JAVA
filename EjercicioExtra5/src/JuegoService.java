import java.util.Scanner;

public class JuegoService {
    private Juego j = new Juego();
    Scanner sc = new Scanner(System.in);
    public JuegoService() {
        String[] nombresMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        j.setMeses(nombresMeses);
        j.setMesSecreto(nombresMeses[6]);
    }
    public void comenzarJuego(){
        System.out.println("Buenvenido al juego de adivinar el mes");
        System.out.println("Ingrese el mes secreto");
        String secreto = "";
        String mesSecreto = j.getMesSecreto();
        do{
             secreto = sc.nextLine();
        if(secreto.equalsIgnoreCase(mesSecreto)){
            System.out.println("Mes correcto");
        }else{
            System.out.println("mes incorrecto");
            System.out.println("Fin de juego");
        }
    }while(!secreto.equalsIgnoreCase(mesSecreto));
    }
}
