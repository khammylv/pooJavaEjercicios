package alumno;

import javax.swing.JOptionPane;

public class menu {
    sistemaAlumnos sistema = new sistemaAlumnos();

     public static String inputName(){
        String input = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
        return input;
    }
    public static int inputEdad(){
        String input = JOptionPane.showInputDialog("Ingrese la edad del alumno:");
        int edad = Integer.parseInt(input);
        return edad;
    }

    public static double inputCalificacion(){
       String input = JOptionPane.showInputDialog("Ingrese la calificacion del usuario:");
       double calificacion = Double.parseDouble(input);
       return calificacion;
    }
    
    public static  void mostrarAlumnos(){
        // int edad = inputEdad();
        // String nombre = inputName();
        
        
        
        
        
        // alumno al1 = new alumno(nombre, edad);

        // sistema.agregarAlumno(al1);
        // double calificacion = inputCalificacion();
        // sistema.agregarCalificacion(nombre,calificacion);
        // double calificacion2 = inputCalificacion();
        // sistema.agregarCalificacion(nombre,calificacion2);
        // double calificacion3 = inputCalificacion();
        // sistema.agregarCalificacion(nombre,calificacion3);
        // double calificacion4 = inputCalificacion();
        // sistema.agregarCalificacion(nombre,calificacion4);
        // double calificacion5 = inputCalificacion();
        // sistema.agregarCalificacion(nombre,calificacion5);

        // sistema.mostrarDatosPantalla();
    }
}
