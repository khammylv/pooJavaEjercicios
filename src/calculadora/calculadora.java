package calculadora;
import javax.swing.JOptionPane;

public class calculadora {
 
   public static void menuCalc(){
     String menu = "Calculadora\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multilplicacion\n"
                    + "4. Division\n"
                    + "\n Ingrese el numero correspondiente a la accion que desea ejercutar", opcion;
     opcion = JOptionPane.showInputDialog(null, menu);   
     
     acciones(opcion);
   }           


  private static int valoruno(){
    String numero1 = JOptionPane.showInputDialog("Ingrese el primer numero");
    int num1 = Integer.parseInt(numero1);
    return num1;
  }

   private static int valordos(){
    String numero2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
    int num2 = Integer.parseInt(numero2);
    return num2;
  }

  private static void acciones(String opcion){
    int num1, num2;
    

    switch(opcion) {
        case "1": 
            num1 = valoruno();
            num2 = valordos();
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + operaciones.sumar(num1,num2)); 
            break;
        
        case "2": 
            num1 = valoruno();
            num2 = valordos();
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + operaciones.restar(num1,num2)); 
            break;
            
        case "3":
            num1 = valoruno();
            num2 = valordos();
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + operaciones.mult(num1,num2)); 
            break; 
            
        case "4":
            num1 = valoruno();
            num2 = valordos();
            JOptionPane.showMessageDialog(null, "El resultado de la division es: " + operaciones.div(num1,num2)); 
            break;   
    }
  }
}


