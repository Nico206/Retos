package taller1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in); 
        System.out.println("Por favor inserte dos numeros");
        double num1,num2;
        int operacion;
        num1= lectura.nextDouble();
        num2= lectura.nextDouble();
        System.out.println("Por favor seleccione lo que quiere hacer con los numeros=");
        System.out.println("1. Suma, 2. Resta, 3.Multiplicación, 4.Division, 5.Potenciacion ,6. radicacion");
        operacion= lectura.nextInt();

        switch (operacion){
            case 1:
            System.out.println("Ha seleccionado suma");
                double suma;
                suma=num1 + num2;
                System.out.println("La suma de los numeros es " + suma);

                break;
            case 2:
                System.out.println("Ha seleccionado Resta");
                double resta;
                resta=num1 - num2;
                System.out.println("La resta de los numeros es " + resta);

                break;
            case 3:
                System.out.println("Ha seleccionado Multiplicacion");
                double multi;
                multi=num1 * num2;
                System.out.println("La multiplicacion de los numeros es " + multi);

                break;
            case 4:
            System.out.println("Ha seleccionado Division");
                double divi;
                divi= num1 / num2;
                System.out.println("La Division de los numeros es " + divi);

                break;
            case 5:
            System.out.println("Ha seleccionado Potenciacion");
                double potenci;
                potenci= Math.pow(num1, num2);
                System.out.println("La Potenciacion de los numeros es " + potenci);

                break;
            case 6:
            System.out.println("Ha seleccionado Radicacion");
                double radica, radica2;
                radica= Math.sqrt( num1);
                radica2= Math.sqrt( num2);
                System.out.println("La Radicacion del numero 1 es " + radica + " La radicacion del segundo numero es " + radica2);

                break;    
            default:
            System.out.println("El  numero no esta en el menu");

        }
        lectura.close();
    }
    
}
