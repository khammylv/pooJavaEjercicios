import calculadora.calculadora;
import conversor.conversor;
import alumno.menu;
import alumno.alumno;
import alumno.sistemaAlumnos;

public class App {
    public static void main(String[] args) throws Exception {
        //calculadora.menuCalc();

        //conversor.menuCon();

        sistemaAlumnos sistema = new sistemaAlumnos();
        
        String nombre = menu.inputName();
        int edad = menu.inputEdad();
        alumno al1 = new alumno(nombre, edad);
        sistema.agregarAlumno(al1);
        double calificacion = menu.inputCalificacion();
        sistema.agregarCalificacion(nombre,calificacion);
        double calificacion2 = menu.inputCalificacion();
        sistema.agregarCalificacion(nombre,calificacion2);
        double calificacion3 = menu.inputCalificacion();
        sistema.agregarCalificacion(nombre,calificacion3);
        double calificacion4 = menu.inputCalificacion();
        sistema.agregarCalificacion(nombre,calificacion4);
        double calificacion5 = menu.inputCalificacion();
        sistema.agregarCalificacion(nombre,calificacion5);
        sistema.mostrarDatosPantalla(); 
        
        

    }
}
