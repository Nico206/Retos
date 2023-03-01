package retos;
import java.util.Scanner;
public class Reto4 {

    public static void main(String[] args) {
      Scanner lectura = new Scanner(System.in);
        System.out.println("Para jugar piedra, papel o tijera... identifiquelo con su numero");
        System.out.println("piedra es 1");
        System.out.println("papel es 2");
        System.out.println("tijera es 3");
     int resp;
     resp= lectura.nextInt();
      int resul = 3, numero;
      for( int i =2; i <5; i++) {
          numero = (int) (Math.random() * (3) +1);
          resul = numero;
      }
       if (resul == 1) {
      System.out.println(" la maquina ha escojido piedra");

         } else if (resul == 2) {
              System.out.println(" la maquina ha escojido papel");

              }  else if (resul == 3) {
                   System.out.println(" la maquina ha escojido tijeras ");

                  } 
        if (resul == resp) {
            System.out.println("Es un empate");

             } else if (resp == 1 && resul == 3){
                 System.out.println("Usted ha ganado ");

                 }  else if (resp == 2 && resul == 3){
                                  System.out.println("Usted pierde");

                    } else if (resp == 2 && resul == 1){
                        System.out.println("Usted pierde ");               
                                          
                        }else if (resp == 1 && resul == 2){
                             System.out.println("Usted pierde");

                              }else if (resp == 3 && resul == 2){
                                System.out.println("Usted ha ganado ");

                                } else if (resp == 3 && resul == 1){
                                    System.out.println("Usted pierde");
                                                                      
                                 }           
               
                       
                            
                                   
                                          
                                                  
                                                               
                                                                    
            
      lectura.close();
    }
}
