
import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner teclado =  new Scanner(System.in); 
       
        int mayor = 0, menor = 0;
        while (true){
            System.out.println("ingrese su edad ");
            int edad = teclado.nextInt();
        
          if (edad<=-1){
              
              System.out.println("mayores: "+mayor+"\nmenores: "+menor);
              
           break;              
          }
          else if(edad>=18){
              System.out.println("ES MAYOR DE EDAD");
              
              mayor++;
          }
              else { 
              System.out.println("ES MENOR DE EDAD");
              
            menor++;
          }
            System.out.println("precione -1 si quiere salir del procedimiento");
          }
        }
    }
 

