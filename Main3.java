public class Main3 {
    public static void main(String[] args) {
        
        Producto producto = new Producto("P01", "Teclado", 20, 59.9, true);

        
        System.out.println(producto);

        
        producto.vender(2);
        System.out.println("Después de vender 2 unidades:");
        System.out.println(producto);

        
        producto.ingresar(5);
        System.out.println("Después de ingresar 5 unidades:");
        System.out.println(producto);

        
        producto.descontinuar();
        System.out.println("Producto descontinuado:");
        System.out.println(producto);

       
        boolean venta = producto.vender(1);
        System.out.println("¿Venta posible? " + venta);
        System.out.println(producto);
    }
}

