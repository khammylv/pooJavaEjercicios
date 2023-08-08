package alumno;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class alumno {
   private String nombre;
   private int edad;
   private ArrayList<Double> calificaciones;

   public alumno(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
    this.calificaciones = new ArrayList<Double>();
   }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public ArrayList<Double> getCalificaciones() {
    return calificaciones;
}

public void setCalificaciones(ArrayList<Double> calificaciones) {
    this.calificaciones = calificaciones;
}

 protected String agregarNotas(double calificacion){
    if(calificacion <= 10.0 && calificacion > 0.0){
        calificaciones.add(calificacion);
        return "Calificación agregada con exito";
    }else{
        return "Ingresa una nota entre 0.0 y 10.0";
    }
 }
 
 protected double promedioNotas(){
    if(calificaciones.isEmpty()){
        return 0;
    }

    double total = 0;
    for(double calificacion:calificaciones){
        total += calificacion;
    }
    double promedio = total / calificaciones.size();
    return promedio;
 }

 protected String mensaje(double promedio){
    if(promedio >= 5.0){
       return ("Buen trabajo");
    }else{
        return ("Los objetivos no fueron alcanzados, suerte la proxima vez");
    }
 }

 protected void mostrarDatos(){
    String showName = "Nombre: " + nombre + "\n";
    String showEdad = "Edad: " + edad + "\n";
    String showNotas = "Calificaciones: " + calificaciones+ "\n" ;
    String showPromedio = "Promedio: " + promedioNotas() + "\n";
    String showMensaje = "Mensaje: " + mensaje(promedioNotas()) + "\n";
    JOptionPane.showMessageDialog(null, showName + showEdad + showNotas +showPromedio + showMensaje);
     //JOptionPane.showMessageDialog(null, );   
 }
  
}
