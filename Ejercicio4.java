
import java.util.Scanner;

/**
 *
 * @author CEDENORTE
 */
public class Ejercicio4 {
      
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in); 
       
       System.out.println("ingrese un numero");
              int num = teclado.nextInt();
        
          while (num >= 1){
        
            int num2 = num*num;
            
            System.out.println(num2);
            
              System.out.println("ingrese otro numero");
        num = teclado.nextInt();
        
    }  
  
    }
      

}
