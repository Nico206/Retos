package taller1;

import java.util.Scanner;

public class Edad {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int age;
        age= lectura.nextInt();
        if (age >= 18){
            System.out.println("BIenvenido siga que si hay");

        }else{
            System.out.println("Si no tienes los 18, eso es cárcel (no, no, no)Si no son mayores de edades, pa' tu casa a ver Pocoyo (Pato)");
        }

        lectura.close();

     }
}
