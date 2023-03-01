package taller1;
import java.util.Scanner;
public class contador {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        String leer;
        int contaH, contaM;
        
        contaH=0;
        contaM=0;

        for (int x=1;x<=10; x++){
            System.out.println("ingrese si usted es mujer o hombre");
            leer= lectura.nextLine();

            if (leer.equalsIgnoreCase("Hombre")){
                contaH=contaH+1;

                 }else{
                    contaM=contaM+1;
            } 
        }
        System.out.println("El total de hombres es " + contaH + " Y la cantidad de mujeres es " + contaM);
        
        
        lectura.close();
    }
}
