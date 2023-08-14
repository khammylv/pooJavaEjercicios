package hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Hotel {
    
    private String nombreHotel;
    private  ArrayList <Habitacion> habitacion;
    private int [] habitacionesDisponible = {1,2,3,4,5,6,7,8,9,10};

    public Hotel(String nombreHotel) {
      this.nombreHotel = nombreHotel;
      habitacion = new ArrayList<>();
    }
      public void agregarHabitacion(Habitacion habitacion) {
       //habitacion.agregar();
       
       //habitacion.add(habitacion);  
        
        
     }
    
    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }
    
     
    
    public int[] getHabitacionesDisponible() {
        return habitacionesDisponible;
    }


    public void setHabitacionesDisponible(int[] habitacionesDisponible) {
        this.habitacionesDisponible = habitacionesDisponible;
    }

   

     protected void removeHabitacion(int a){
        habitacionesDisponible =  removeElement(habitacionesDisponible, a);
     }

    private int[] removeElement(int[] habitacionesDisponible, int a) {
        return Arrays.stream(habitacionesDisponible)
                .filter(i -> i != a)
                .toArray();
    }
    


    public void display() {
        System.out.print("Hotel:" + nombreHotel);
        System.out.println("Habitaciones disponibles: " + Arrays.toString(habitacionesDisponible));
        for(Habitacion habitaciones :habitacion){
           habitaciones.vista();
        }
        
    }


    
}
