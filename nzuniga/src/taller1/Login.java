package taller1;
    import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String usuac;
        usuac= "nicolas";
        String password;
        password= "123";
        System.out.println(" Ingrese su usuario");
        String usua;
        usua= lectura.nextLine();
        System.out.println("Ingrese su contraseña");
        String contra;
        contra= lectura.nextLine(); 

        if( usuac.equalsIgnoreCase(usua) && password.equalsIgnoreCase(contra) ) {
            System.out.println("Bienvenido al sistema");

        } else if( usuac.equalsIgnoreCase(usua)){ 
            System.out.println("Parece que su contraseña se le ha olvidado");
            
            } else if( password.equalsIgnoreCase(contra)){
                System.out.println("Parece que sus el nombre de su usario se le a olvidado");
                
            } else {

                System.out.println("Su usario y contraseña son incorrectos");

            }
   lectura.close();       
   
}    
}

