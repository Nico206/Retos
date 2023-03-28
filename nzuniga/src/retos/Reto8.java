package retos;
import java.util.Scanner;


public class Reto8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int cantidad, cambio , acumuladorm,acumulador, seguir, 
        precio, descuento, descuentoA, descuentoB, pagof,
        descuentoC, descuentoD, descuentoE;
      
    seguir = 1;
    acumulador = 0;
    acumuladorm = 0;

while (seguir == 1) {
System.out.println("Digite el precio del producto");
precio=lectura.nextInt();
System.out.println("Digite la cantidad del producto");
cantidad=lectura.nextInt();
System.out.println("Desea registrar otro gasto 1. si 2. no");
seguir=lectura.nextInt();

acumuladorm = precio * cantidad ;
acumulador= acumulador + acumuladorm ;
}
System.out.println("Su valor a pagar es " + acumulador);
 
        int suerte = (int)(Math.random()*4+1);
        if (acumulador<50000){
            System.out.println("Su compra es menor que 50000, no tiene descuento");
        } else if (suerte == 1) {
            System.out.println("Has sacado la bolita roja!!! tienes el 10% de descuento");
            descuento= (acumulador * 10) / 100;
            descuentoC= acumulador - descuento;
            System.out.println("Por lo tanto tu valor a pagar es " + descuentoC);
            System.out.println("Con cuanto desea pagar ");
            cambio=lectura.nextInt();
            pagof = cambio - descuentoC;
             System.out.println("Su cambio seria de " + pagof);
        }  else if (suerte == 2) {
            System.out.println("Has sacado la bolita azul!!! tienes el 30% de descuento");
            descuentoA= (acumulador * 30) / 100;
            descuentoD= acumulador - descuentoA;
            System.out.println("Por lo tanto tu valor a pagar es " + descuentoD);
            System.out.println("Con cuanto desea pagar ");
            cambio=lectura.nextInt();
            pagof = cambio - descuentoD;
            System.out.println("Su cambio seria de " + pagof);
        }   else if (suerte == 3) {
            System.out.println("Has sacado la bolita amarilla!!! tienes el 50% de descuento");
            descuentoB= acumulador / 2;
            descuentoE= acumulador - descuentoB;
            System.out.println("Por lo tanto tu valor a pagar es " + descuentoE);
            System.out.println("Con cuanto desea pagar ");
            cambio=lectura.nextInt();
            pagof = cambio - descuentoE;
            System.out.println("Su cambio seria de " + pagof);
        }   else if (suerte == 4) {
            System.out.println("Has sacado la bolita Blanca!!! tienes el 100% de descuento");
        }
 lectura.close();
}
}

