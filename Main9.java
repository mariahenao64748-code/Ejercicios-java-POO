public class Main9 {
    public static void main(String[] args) {
        
        Paciente p1 = new Paciente("1023456789", "Laura Gómez", 30, 'B');

        System.out.println(p1); 

        p1.marcarAtendido(); 

        System.out.println("Después de atención: " + p1.isAtendido());
    }
}
