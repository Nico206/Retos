package taller1;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String [][] nombres={{"Juan","Victor","Santiago"},{"David","Daniela","Juan R"},{"Shirley","Maira","Saira" }};
        
        for(int fila=0;fila<3;fila++){      

                for(int columna=0;columna<3;columna++){
                
                System.out.print(nombres[fila][columna]+"\t");

                }
                System.out.println("");

        }
        lectura.close();
    }
}

