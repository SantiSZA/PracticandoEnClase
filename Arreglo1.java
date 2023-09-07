
import java.util.Scanner;


public class Arreglo1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        int [] numeros = new int[5];
        
     for (int i=0;i<numeros.length;i++){   
        System.out.print("numero: "+(i+1)+" : ");
        numeros[i] = teclado.nextInt();
   
                }
     
        System.out.println("Los numeros ingresados son: ");
     for (int j=0;j<numeros.length;j++){
         
         System.out.println("numero "+numeros[j]+ " esta en la posicion "+j);
         
     }
    }
}
