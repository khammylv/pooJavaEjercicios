package conversor;

public class operaciones {

   private static double peso = 4028.85;
   private static double dolar = 1.10;
  
   
    protected static double dolarPeso(double num){
    double cambio = num * peso;  
    
    return cambio;
   }

   protected static double pesoDolar(double num){
    double cambio = num / peso;
    return cambio;
   }

   protected static double dolarEuro(double num){
    double cambio = num / dolar;
    return cambio;

   }

   protected static double euroDolar(double num){
     double cambio = num * dolar;
     return cambio;
   }

}
