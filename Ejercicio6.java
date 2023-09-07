
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CEDENORTE
 */
public class Ejercicio6 {
     public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int i=1, num2, resultado = 0, j=1;
         System.out.println("ingrese un numero");
             num2 = teclado.nextInt();
            
        while ( num2>0){
          
            while (j<=10){

                  resultado = j * num2;
                 
            System.out.println(num2+" * "+j+" = "+resultado);
            
            j++;
            }
              
        System.out.println("ingrese un numero");
             num2 = teclado.nextInt();
        }
        
        
        
        }
}
