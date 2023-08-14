package hotel;

public class Cliente {
    private String nombre;
    private int documento;
    private int habitacion;
    
    
    Cliente(String nombre, int documento, int habitacion){

        
        this.nombre = nombre;
        this.documento = documento;
        this. habitacion = habitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }
    public void display() {
    
        System.out.println("nombre: " + nombre);
        System.out.println("documento: " + documento);
        System.out.println("habitacion: " + habitacion);

    
    }

}
