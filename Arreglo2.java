
import java.util.Scanner;


//SANTIAGO ZAPATA

public class Arreglo2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
         System.out.println("Digite cuantas personas va a ingresar");
        int personas = teclado.nextInt();
       teclado.nextLine();
        String [] nombres = new String[personas];
       
     for (int i=0;i<personas;i++){   
        System.out.print("Ingrese el nombre ");
        nombres[i] = teclado.nextLine();
        
                }
     
        System.out.println("Los nombres ingresados son: ");
        
     for (int i=0;i<nombres.length;i++){
            
         System.out.println(nombres[i]);
     }   
     }
}
