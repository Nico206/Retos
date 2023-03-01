package taller1;

import java.util.Scanner;
public class cajaregister{
    
    public static void main(String[] args) {
         int precio, cantidad, contador,subtotal,acumulador, pagar,total;
         String exit;
         Scanner lectura= new Scanner(System.in);
        contador=0;
        acumulador=0;
         for (int x=1 ; x<=5; x++){

            System.out.println("Digite el precio del producto");
            precio= lectura.nextInt();
            
            System.out.println("Digite la cantidad del producto");
             cantidad = lectura.nextInt();
            
            subtotal= precio * cantidad;
            contador=contador+1;
            acumulador=acumulador+subtotal;
         }
     
         System.out.println("El total a pagar es " + acumulador);

         System.out.println("Ingrese el billete con el cual va a pagar");
         pagar= lectura.nextInt();
         total= pagar - acumulador;

         System.out.println("Pagaste con " + pagar + " Y tu cambio es de " + total);

         System.out.println("¿Ya eres parte de La telefonia movil exito?");
         lectura.nextLine();
         exit= lectura.nextLine();
         if ( exit.equalsIgnoreCase("si") ){
                System.out.println("Gracias por estar con nosotros, con esta compra obtuviste " + contador + " minutos");
         }else{

                System.out.println("No pierdas mas minutos, adquiere ya tu telefonia movil exito");
         }
         
         lectura.close();
    }
}
 