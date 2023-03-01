package taller1;

    import java.util.Scanner;
public class Numero3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1;
        num1= lectura.nextInt();
        if (num1>0){
            System.out.println("El numero es positivo");


        }else if ( num1 < 0){
            System.out.println("El numero es negativo");

        }else{
            System.out.println("El numero es neutro");
        }
    
        lectura.close();
    }

}
