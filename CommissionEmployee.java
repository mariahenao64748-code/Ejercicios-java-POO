
public class CommissionEmployee {
    private String primerNombre;
    private String apellido;
    private String numeroSeguroSocial;
    private double ventasBrutas; 
    private double tarifaComision; 

    
    public CommissionEmployee(String primerNombre, String apellido, String nss, 
                              double ventasBrutas, double tarifaComision) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = nss;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    
    public double ingresos() {
        return tarifaComision * ventasBrutas;
    }

    
    public double getVentasBrutas() { return ventasBrutas; }
    public double getTarifaComision() { return tarifaComision; }
    public String getPrimerNombre() { return primerNombre; }
    public String getApellido() { return apellido; }
    public String getNumeroSeguroSocial() { return numeroSeguroSocial; }

    
    @Override
    public String toString() {
        return String.format("Empleado por comisión: %s %s%nNSS: %s%nVentas Brutas: %.2f%nTarifa: %.2f", 
            primerNombre, apellido, numeroSeguroSocial, ventasBrutas, tarifaComision);
    }
}