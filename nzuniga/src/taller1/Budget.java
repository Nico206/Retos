package taller1;
import java.util.Scanner;
public class Budget {
    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in);
        
        int budget,spein, seguir, totalgas, contador;
        seguir=1;
        totalgas=0;
        budget=100000;
        contador=0;
        while(seguir==1){

            System.out.println("Ingrese el valor del gasto");
            spein= lectura.nextInt();
            totalgas= totalgas+spein;
            budget=budget-spein;
            System.out.println("tu  gasto fue de " + spein);
            System.out.println("Tu sueldo actual es de " + budget );
            System.out.println("Desea registrar otro gasto? 1. si 2. no");
            seguir= lectura.nextInt();  
            contador= contador+ seguir;
            if (contador==3){
                System.out.println("Te pasaste de tus gastos");
                seguir=3;
            }
                 

        }
        System.out.println("Ya no tienes gastos que registrar");
        System.out.println("El tota de tus gastos fue de " + totalgas + " Y quedaste con un presupuesto de " + budget);
        lectura.close();
    }
    
}
