
public class Main {
    public static void main(String[] args) {
        
        CommissionEmployee empleado1 = new CommissionEmployee(
            "Juan", "Perez", "111-11-111", 10000, 0.06);

        
        BasePlusCommissionEmployee empleado2 = new BasePlusCommissionEmployee(
            "Maria", "Gomez", "222-22-222", 5000, 0.04, 300);

        System.out.println("--- Información Empleado 1 ---");
        System.out.println(empleado1);
        System.out.println("Ingresos totales: $" + empleado1.ingresos());

        System.out.println("\n--- Información Empleado 2 ---");
        System.out.println(empleado2); 
        System.out.println("Ingresos totales: $" + empleado2.ingresos());
    }
}
