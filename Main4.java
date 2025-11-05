public class Main4 {
    public static void main(String[] args) {
        
        Pelicula pelicula = new Pelicula("Matrix", 1999, "R", 3, 2);

        
        System.out.println(pelicula);

       
        pelicula.alquilar(15);

        
        pelicula.alquilar(20);

        
        System.out.println("Después del intento de alquiler:");
        System.out.println(pelicula);

        
        pelicula.devolver();
        System.out.println("Después de devolver una película:");
        System.out.println(pelicula);
    }
}

