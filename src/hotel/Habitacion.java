package hotel;

import java.util.ArrayList;

public class Habitacion {
     //private boolean disponible;
     //private String nameHotel;
     private ArrayList<Integer> habitaciones;


    public Habitacion() {
        //this.nameHotel = nameHotel;
        this.habitaciones = new ArrayList<Integer>();
        
    }
    
  
     public ArrayList<Integer> getHabitaciones() {
        return habitaciones;
    }




    public void setHabitaciones(ArrayList<Integer> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    public boolean isHabitaciones(int num) {
        boolean msg = false;
         for(int i = 0; i < habitaciones.size(); i++) {
            if(habitaciones.get(i) == num){
                msg = true;
            }
                
        
         }

         if(msg){
            return true;
          }else{
             return false;
          }
    }



    public void reser(int numero) {
        
        habitaciones.add(numero);
    }

    


   
    
    public boolean agregar(int num){
        if(num <= 10 && num > 0){
            
            return true;
        }else{
            return false;
        }
     }
    
     public void vista(){
        //System.out.println("Name Hotel: " + nameHotel);
        System.out.println("lista de habitaciones: " + habitaciones);
     }


    

}
