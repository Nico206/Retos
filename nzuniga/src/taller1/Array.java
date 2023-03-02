package taller1;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);

        //Declarar array en dos pasos
        int [] vector1; //declarado
        vector1= new int[10];
        int [] prueba2= new int[5];
        //Declarar en 1 pasos
        //int [] vector2=new int[10];

        int [] vector2={30,50,25,85,12,6,32,41,23,63};
        vector1[5]=6;

        System.out.println(vector1[5]);


        for(int p=0;p<=4 ;p++){
            System.out.println(vector2[p]);
        }

        for (int dato : vector2) {
            System.out.print(dato + " ");
        }

        //si no se sabe el tamaña del array
        for(int p=0;p<prueba2.length;p++){
            
        }
        lectura.close();
    }

        
    }

 
