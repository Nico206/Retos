package retos;
import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        
       System.out.println("Oprima un numero para lanzar los dados ");
       lectura.nextInt();
       int suma;
       int numero1 = (int)(Math.random()*6+1);
       System.out.println("Su primer dado fue " + numero1);
       int numero2 = (int)(Math.random()*6+1);
       System.out.println("Su segundo dado fue " + numero2);
       
       suma = numero1 + numero2;
       if (suma ==2) {
         System.out.println("Usted  ha ganado");
       } else if (suma == 3) {
         System.out.println("Usted ha ganado");
          } else  if (suma == 11) {
          System.out.println("Usted ha ganado");
            } else if (suma == 12) {
              System.out.println("Usted ha ganado");
                } else if (suma == 7) {
                  System.out.println("Usted ha ganado");
                     } else {
                      System.out.println("Ha perdido");
                       }
      
        lectura.close();
       
    }
}