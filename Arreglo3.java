
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;






public class Arreglo3 {
    public static void main(String[] args) {
        
        List<String> NombresPersonas = new ArrayList<>();
        
       
    int NumerosPersonas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de personas"));
    
    for (int i=0;i<NumerosPersonas;i++){
        
      String nombre =  JOptionPane.showInputDialog("ingrese el nombre "+(i+1));
        NombresPersonas.add(nombre);
      
      
      
      
    }
     StringBuilder mensaje= new StringBuilder("Nombres ingresados: \n");
     
     for (int i=0;i<NombresPersonas.size();i++){
         

         mensaje.append(" posición ").append(i+1).append(" : ").append(NombresPersonas.get(i)).append("\n");
         
      
     }
     JOptionPane.showMessageDialog(null, mensaje.toString());
         System.exit(0);
    }
}
