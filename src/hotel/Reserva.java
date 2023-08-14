package hotel;

import java.util.ArrayList;

public class Reserva {
    private  ArrayList <Cliente> clientes;
    
   public Reserva(){
       clientes = new ArrayList<Cliente>(); 
    }

    
    public  void agregarCliente(Cliente cliente) {
        
         
         clientes.add(cliente);
         
      }
     
      public void MostrarPantalla(){
         for(Cliente cliente : clientes){
            cliente.display();
         }
      }

}
