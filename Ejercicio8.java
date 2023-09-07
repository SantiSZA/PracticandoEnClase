
import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num, num2, pares = 0, par  ;
        while (true){
        System.out.println("escribe un numero inicial");
        num = teclado.nextInt();
        System.out.println("escribe un numero final");
         num2 = teclado.nextInt();
            if (num>num2){
                System.out.println("el numero inicial es mayor al final, no se puede seguir"); 
                break;
            }
            else 
         
         for (int i = num; i <= num2;i++ ){
             
             par = i%2;
             
             if(par == 0){
                 pares+=i;
                     
                     
                 }
                 
             }
            
             System.out.println("la suma de los pares es: "+pares);
             pares = 0;
         }
       
    }  
    }


