public class Main10 {
    public static void main(String[] args) {
        
        Sensor s1 = new Sensor("S-01", 15.0, 30.0);

        
        s1.activar();

        
        s1.actualizarLectura(31.4);

        
        System.out.println(s1);
    }
}
