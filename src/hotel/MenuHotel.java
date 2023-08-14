package hotel;

import javax.swing.JOptionPane;

public class MenuHotel {

    public static void menuHotel1() {
        String menu = "Lista de Hoteles\n"
                + "1. Lindo Hotel 1\n"
                + "2. Lindo Hotel 2\n"
                + "3. Lindo Hotel 3\n"
                + "4. Lindo Hotel 4\n"
                + "\n Ingrese el numero correspondiente a la accion que desea ejercutar", opcion;
        opcion = JOptionPane.showInputDialog(null, menu);

        acciones(opcion);
    }

    public static String inputName() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        return nombre;
    }

    // public static String inputHotel(){
    // String hotel = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
    // return hotel;
    // }

    public static int inputDocumento() {
        String input = JOptionPane.showInputDialog("Ingrese el documento del usuario:");
        int documento = Integer.parseInt(input);

        return documento;
    }

    public static int inputHabitacion() {
        String input = JOptionPane.showInputDialog("Ingrese la habitacion del usuario:");
        int habitacion = Integer.parseInt(input);
        return habitacion;
    }

    public static int numeroClientes() {
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de clientes:");
        int numero = Integer.parseInt(input);
        return numero;
    }

    public static void acciones(String opcion) {
        switch (opcion) {

            case "1":
                agregarCliente("Lindo hotel 1");
                break;

            case "2":
                agregarCliente("Lindo hotel 2");

                break;

            case "3":
                agregarCliente("Lindo hotel 3");

                break;

            case "4":
                agregarCliente("Lindo hotel 4");
                break;
        }
    }

    public static void agregarCliente(String hotel) {
        Hotel hotel1 = new Hotel(hotel);
        int contador = 1;
        int numClientes = numeroClientes();
        Reserva reservation = new Reserva();
        Habitacion habit = new Habitacion();
        while (contador <= numClientes) {

            int habitacion = inputHabitacion();
            
            if (habit.agregar(habitacion)) {
                if (!habit.isHabitaciones(habitacion)) {
                    habit.reser(habitacion);
                    String name = inputName();
                    int documento = inputDocumento();
                    Cliente cliente = new Cliente(name, documento, habitacion);
                    hotel1.removeHabitacion(habitacion);
                    reservation.agregarCliente(cliente);
                    contador++;

                } else {
                    JOptionPane.showMessageDialog(null, "habitacion no disponible");
                }

            } else {
                JOptionPane.showMessageDialog(null, "habitacion no valida");
            }
            // if(habit.agregar(habit.agregar(habitacion)){
            // String name = inputName();
            // int documento = inputDocumento();
            // Cliente cliente = new Cliente(name, documento, habitacion);
            // hotel1.removeHabitacion(habitacion);
            // reservation.agregarCliente(cliente);
            // contador ++;
            // }else{
            // JOptionPane.showMessageDialog(null, "habitacion no disponible");
            // }

        }

        System.out.println(hotel1.getNombreHotel());
        reservation.MostrarPantalla();

    }

}
