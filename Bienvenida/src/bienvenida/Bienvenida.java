package bienvenida;
import java.util.Scanner;

/**
 *
 * @author crubiano
 */
public class Bienvenida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido al Tutorial de Git y GitHub ");
        System.out.println("Escribe nombre del estudiante:");
        Scanner consola = new Scanner(System.in);
        Student student1 = new Student(consola.nextLine());
        System.out.println("Datos del estudiante "+ student1.toString());
    }
    
}
