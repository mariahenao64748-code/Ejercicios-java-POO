public class Main6 {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Toyota", 50, 35, 7); // 7 km/L y 35 L

        System.out.println(v1); 

        v1.conducir(50); 
        System.out.println("Después de conducir 50 km:");
        System.out.println(v1);

        v1.recargar(10); 
        System.out.println("Después de recargar 10 L:");
        System.out.println(v1);
    }
}

