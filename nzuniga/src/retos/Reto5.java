package retos;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
              String nombre,apellido, nameComplete;

              System.out.println("por favor digite su nombre");
              nombre= lectura.nextLine();
              System.out.println(nombre.length());
              System.out.println("por favor digite su apellido");
              apellido= lectura.nextLine();
              System.out.println(apellido.length());

              System.out.println(nombre.toUpperCase());
              System.out.println(apellido.toLowerCase());
              nameComplete = nombre + apellido;           






         lectura.close();
    }
}
