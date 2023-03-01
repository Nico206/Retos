package taller1;

 import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite dos numeros");
        int numOne;
        int numTwo;
        numOne= lectura.nextInt();   
        numTwo= lectura.nextInt();
        
        if (numOne>numTwo){
            System.out.println("El "  + numOne  + " es mayor que "  + numTwo);
            int suma;
            suma= numOne + numTwo;
            System.out.println("El valor de la suma de los numeros son " + suma); 

            }else if (numTwo > numOne){ 
            System.out.println("El "  + numTwo  + " es mayor que "  + numOne);
            int resta;
            resta= numTwo - numOne;
            System.out.println("El valor de la resta de los es " + resta);
            
            } else {
                System.out.println("EL" + numTwo + " es igual que " + numOne);
                int multi;
                multi= numTwo * numOne;
                System.out.println("La multiplicacion de los dos es " + multi);

             }
                 

        lectura.close();
    }
    
}

