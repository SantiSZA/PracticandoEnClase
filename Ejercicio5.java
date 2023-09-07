
import java.util.Scanner;


/**
 *
 * @author CEDENORTE
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int i=0;
        System.out.println("ingrese un numero");
        int num = teclado.nextInt();
        
        while ( i<=10){
            
            int num2 = num*i;
            
            
            System.out.println(num+" * "+i+" = "+num2);
        
        i++;
        
        
    }
        
        
    }
 
}
