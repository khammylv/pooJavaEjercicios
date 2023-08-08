package conversor;

import javax.swing.JOptionPane;

public class conversor {
    protected conversor() {
       
    }  

    public static void menuCon(){
        String menu = "Conversor de moneda\n"
        + "1. Dolar a Peso\n"
        + "2. Peso a Dolar\n"
        + "3. Dolar a Euro\n"
        + "4. Euro a dolar\n"
        + "\n Ingrese el numero correspondiente a la accion que desea ejercutar", opcion;
        opcion = JOptionPane.showInputDialog(null, menu);
        acciones(opcion);  
    }

    private static double valorMoneda(){
        String numero1 = JOptionPane.showInputDialog("Ingrese el valor a convertir:");
        double moneda = Double.parseDouble(numero1); 
        return moneda;
    }

    private static void acciones(String opcion){
        double moneda;

        switch(opcion) {

           case "1":
             moneda = valorMoneda();
             JOptionPane.showMessageDialog(null, operaciones.dolarPeso(moneda));
             break;
            
           case "2":
               moneda = valorMoneda();
               JOptionPane.showMessageDialog(null, operaciones.pesoDolar(moneda));
               break;
        
           case "3":
               moneda = valorMoneda();
               JOptionPane.showMessageDialog(null, operaciones.dolarEuro(moneda));
               break;
        
           case "4":
               moneda = valorMoneda();
               JOptionPane.showMessageDialog(null, operaciones.euroDolar(moneda));
               break;      
        }
    }
}
