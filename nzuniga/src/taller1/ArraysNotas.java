package taller1;
import java.util.Scanner;
public class ArraysNotas {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
       
       double total, prom, nota;
       int c;
       total = 0;
     
       System.out.println("Digite la cantidad de notas");
       c = lectura.nextInt();
       float notas[] = new float[c];
       
       for( int p=0;p<notas.length;p++) {
       System.out.println("Dijite una nueva nota");
       nota = lectura.nextDouble();
       
       total = total+ nota;

       }
       prom=  total / c ;
       System.out.println(" su promedio es " + prom);
       if (prom<3) {
        System.out.println("Ud ha reprobado");
       } else if  ( prom >= 3 && prom < 4) {
       
       System.out.println(" Ud paso raspando");
       }

        if (prom>4){
        System.out.println("Aprobaste con buenos resultados");
        } 

    lectura.close();
    }
}

