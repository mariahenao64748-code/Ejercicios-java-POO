public class Main2 {
    public static void main(String[] args) {
        // Crear una cuenta con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("Camila Henao", "123-4", 1000000, true);

        // Mostrar estado inicial
        System.out.println(cuenta);

        // Depositar dinero
        cuenta.depositar(250000);
        System.out.println("Después de depositar:");
        System.out.println(cuenta);

        // Retirar dinero
        cuenta.retirar(100000);
        System.out.println("Después de retirar:");
        System.out.println(cuenta);

        // Bloquear cuenta y probar operación
        cuenta.bloquear();
        System.out.println("Cuenta bloqueada. Intentando operar...");
        boolean exito = cuenta.depositar(50000);
        System.out.println("¿Depósito exitoso? " + exito);
        System.out.println(cuenta);
    }
}

