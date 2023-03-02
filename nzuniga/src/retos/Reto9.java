package retos;

import java.util.Random;
import java.util.Scanner;

public class Reto9 {
    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in);
        int total, play,money,eleccion, doble, contador;
        Random moneda= new Random();
        total=0;
        contador=0;
        System.out.println("Bienvenido al casino, siga al casillerazo");
        play=1;
        do{
            System.out.println("¿Cuanto dinero quiere apostar ahora?");
            money = lectura.nextInt();

            System.out.println("Por favor escoja 1. cara 2. Sello ");
            eleccion = lectura.nextInt();
            
            int N = 1 +  moneda.nextInt(2);
        
            if (eleccion==1 && N==1){
                System.out.println("Recuerda que 1 es cara y 2 es sello");
                System.out.println("En la moneda salio " + N + " Y tu elegiste " + eleccion);
                System.out.println("Felicidades ganoo");
                doble= money * 2;
                System.out.println("Ganaste " + doble);
                total=total + doble;




                }else if (eleccion ==2 && N==2){
                    System.out.println("Recuerda que 1 es cara y 2 es sello");
                    System.out.println("En la moneda salio " + N + " Y tu elegiste " + eleccion);
                    System.out.println("Felicidades ganoo");
                    doble= money * 2;
                    System.out.println("Ganaste " + doble);
                    total=total + doble;
                    System.out.println(total);


                    }else {
                        System.out.println("En la moneda salio " + N + " Y usted escojio " + eleccion);
                        System.out.println("Perdedorrrrrrrrrrr");
                        total= total - money;
                        
                        }


            
            System.out.println("Quiere seguir jugando  1. si 2. no");            
            play= lectura.nextInt();
            contador= contador + 1;
        }while(play==1);

        System.out.println("Jugaste " + contador  + " veces");
        System.out.println("Y acumulaste una cantidad de " + total);


        lectura.close();
    }
    
}
