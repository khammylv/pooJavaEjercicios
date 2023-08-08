package alumno;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class sistemaAlumnos {
    private  ArrayList <alumno> alumnos;
    public sistemaAlumnos() {
        alumnos = new ArrayList<>();
    }

    public  void agregarAlumno(alumno alumno) {
        
        alumnos.add(alumno);
    }

    public void agregarCalificacion(String nombre,double calificacion){
        for(alumno alumno : alumnos){
            if(alumno.getNombre().equals(nombre)){
                String mensaje = alumno.agregarNotas(calificacion);
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }
    }

    public  void mostrarDatosPantalla(){
        for(alumno alumno : alumnos){
            alumno.mostrarDatos();
        }
    }
    
   

    // public static void menuAlumnos(){
    //     String menu = "Sistema de alumnos\n"
    //     + "1. Agregar un nuevo alumno\n"
    //     + "2. Agregar calificacion a un alumno\n"
    //     + "3. Mostar informacion de los alumnos\n"
    //     + "\n Ingrese el numero correspondiente a la accion que desea ejercutar", opcion;
    //     opcion = JOptionPane.showInputDialog(null, menu); 
    //     //acciones(opcion);
    // }

    // private static void acciones(String opcion){
    //     int edad;
    //     String nombre;
    //     double cal;
    //     switch(opcion) {
    //          case "1":
    //             nombre = inputName(); 
    //             edad = inputEdad();
    //             agregarAlumno(nombre,edad);
    //             mostrarDatosPantalla();
    //             break;

    //         case "2": 
    //           break;
              
    //         case "3": 
    //             mostrarDatosPantalla();
    //         break;  
    //     }
    // }
}
