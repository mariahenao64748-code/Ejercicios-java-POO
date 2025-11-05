import java.time.LocalDate;

public class Main8 {
    public static void main(String[] args) {
        
        LocalDate ingreso = LocalDate.of(2025, 10, 20);
        LocalDate salida = LocalDate.of(2025, 10, 23);

        ReservaHotel reserva = new ReservaHotel("Ana Pérez", ingreso, salida, 180.0);

        System.out.println(reserva); 
        reserva.confirmar();
        System.out.println("Reserva confirmada: " + reserva.isConfirmada());
    }
}
