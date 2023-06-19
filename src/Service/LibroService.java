package Service;

import Model.Libro;

import java.util.Scanner;

public class LibroService {
    public Libro cargarLibro(){
        Libro libro = new Libro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro");
        libro.setISBN(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el titulo");
        libro.setTitulo(sc.nextLine());
        System.out.println("Ingrese la cantidad de paginas");
        libro.setNroPaginas(sc.nextInt());
        sc.nextLine();
        System.out.println("ingrese el autor del libro");
        libro.setAutor(sc.nextLine());
        return libro;
    }

}
