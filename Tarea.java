
import java.util.Scanner;



/**
 *
 * @author Santiago
 */
public class Tarea {
     public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[5];
        
        for (int i = 0; i < 5; i++) {
              
            
            System.out.println("Por favor ingrese 5 numeros");
        numero[i]= teclado.nextInt();
        
        }
         System.out.println("*PUNTO 1* \n");
        for (int i = 0; i < 5; i++) {
            
            System.out.println(" Numero "+(i+1)+" es: "+numero[i]+"\n");
            
        } System.out.println("*PUNTO 2* \n");
         System.out.println("Los numero invertidos son: ");
         for (int i = 4; i >= 0; i--) {
            
            System.out.println(" Numero "+(i+1)+" es: "+numero[i]+"\n");
            
        } System.out.println("¨*PUNTO 3* \n");
        
           System.out.println("Los numero positivos son: ");
        for (int i = 0; i < 5; i++) {
            
            if (numero[i]>=0)
            System.out.println(numero[i]+"\n");
            
        } System.out.println("*PUNTO 4* \n");
          System.out.println("Los numero negativos son: ");
        for (int i = 0; i < 5; i++) {
            
            if (numero[i]<=0)
            System.out.println(numero[i]+"\n");
        }  System.out.println("*PUNTO 5* \n");
        System.out.println("Los pares son: ");
        for (int i = 0; i < 5; i++) {
         int residuo = numero[i]%2;
         if (residuo == 0)
            System.out.println(+numero[i]+"\n");
            
        } System.out.println("*PUNTO 6* \n");
        System.out.println("Los impares son: ");
        for (int i = 0; i < 5; i++) {
         int residuo = numero[i]%2;
         if (residuo != 0)
            System.out.println(+numero[i]+"\n");
            
        }
        
        System.out.println("*PUNTO 7* \n");
        int[] numero2 = new int[50];
        int suma = 0;
        for (int i = 0; i < 50; i++) {
           
            numero2[i]= i+1;
           suma += numero2[i]; 
           
        }
        int media = suma/50;
       
        System.out.println("la suma de los numero del 1 al 50 es: "+suma+"\nY su media es : "+media);
        
        
        
        
     }
   
}
