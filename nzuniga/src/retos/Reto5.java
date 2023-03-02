package retos;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
              String nombre,apellido;

              System.out.println("por favor digite su nombre");
              nombre= lectura.nextLine();
              System.out.println("La longitud de su nombre es de " + nombre.length());
              System.out.println("por favor digite su apellido");
              apellido= lectura.nextLine();
              System.out.println("La longitud de su apellido es de " + apellido.length());

              System.out.println("Su nombre en mayusculas es " + nombre.toUpperCase());
              System.out.println("Su apellido en minisculas es " + apellido.toLowerCase());
               
              String nameComlete= nombre + " " + apellido;
              System.out.println("Su nombre completo es " + nameComlete);

              System.out.println("Su abreviacion es " + nombre.charAt(0) + apellido.charAt(0));

         lectura.close();
    }
}
