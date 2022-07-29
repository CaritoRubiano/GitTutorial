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
        System.out.println("Escriba el nombre del estudiante:");
        Scanner consola1 = new Scanner(System.in);
        System.out.println("Genero del estudiante:");
        Scanner consola2 = new Scanner(System.in);
        System.out.println("Edad del estudiante:");
        Scanner consola3 = new Scanner(System.in);
        System.out.println("Carrera del estudiante:");
        Scanner consola4 = new Scanner(System.in);
        Student student1 = new Student(consola1.nextLine(),consola2.nextLine(),consola3.nextLine(),consola4.nextLine());
        System.out.println("Datos del estudiante "+ student1.toString());
    }
    
}
