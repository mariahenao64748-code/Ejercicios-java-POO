


public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double salarioBase; 

    
    public BasePlusCommissionEmployee(String primerNombre, String apellido, String nss, 
                                      double ventasBrutas, double tarifaComision, double salarioBase) {
        
        
        super(primerNombre, apellido, nss, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    @Override
    public double ingresos() {
        return salarioBase + super.ingresos();
    }

    
    @Override
    public String toString() {
        return String.format("Con salario base %s%nSalario Base: %.2f", 
            super.toString(), salarioBase);
    }
}
