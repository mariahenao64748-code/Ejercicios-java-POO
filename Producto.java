public class Producto {
    
    private String codigo;
    private String nombre;
    private int stock;
    private double precioUnitario;
    private boolean activo;

    
    public Producto() {
        this.codigo = "P00";
        this.nombre = "Sin nombre";
        this.stock = 0;
        this.precioUnitario = 0.0;
        this.activo = true;
    }

    
    public Producto(String codigo, String nombre, int stock, double precioUnitario, boolean activo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = (stock >= 0) ? stock : 0;
        this.precioUnitario = (precioUnitario >= 0) ? precioUnitario : 0.0;
        this.activo = activo;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    
    public String getPrecioUnitario() {
        return String.format("$%.2f", precioUnitario);
    }

    public boolean isActivo() {
        return activo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        }
    }

   
    public boolean ingresar(int cantidad) {
        if (!activo || cantidad <= 0) {
            return false;
        }
        stock += cantidad;
        return true;
    }

    public boolean vender(int cantidad) {
        if (!activo || cantidad <= 0 || cantidad > stock) {
            return false;
        }
        stock -= cantidad;
        return true;
    }

    public void descontinuar() {
        this.activo = false;
    }

    
    @Override
    public String toString() {
        return codigo + " - " + nombre + " | stock: " + stock + " | " + getPrecioUnitario();
    }
}
