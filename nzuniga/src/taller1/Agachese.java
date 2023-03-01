package taller1;

import java.util.Scanner;

public class Agachese {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite la cantidad de productos comprados");
        int cantidadP;
        cantidadP= lectura.nextInt();
        int total;
        total= cantidadP*10000;
        System.out.println("El valor de la compra es " + total);

        System.out.println("Ingrese el valor con el que paga");
        int valorPaga;
        valorPaga= lectura.nextInt();
        int cambio;
        cambio= valorPaga - total;
        System.out.println("Su cambio es " + cambio);

        
        lectura.close();
    }

    
}
