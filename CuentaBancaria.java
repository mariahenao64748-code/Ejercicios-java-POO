public class CuentaBancaria {
    
    private String titular;
    private String numero;
    private double saldo;
    private boolean activa;

    // Constructor por defecto
    public CuentaBancaria() {
        this.titular = "Sin titular";
        this.numero = "0000";
        this.saldo = 0.0;
        this.activa = true;
    }

    
    public CuentaBancaria(String titular, String numero, double saldo, boolean activa) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = (saldo >= 0) ? saldo : 0.0; 
        this.activa = activa;
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    

    public boolean isActiva() {
        return activa;
    }

    
    public void bloquear() {
        this.activa = false;
    }

    public void activar() {
        this.activa = true;
    }

    public boolean depositar(double monto) {
        if (!activa || monto <= 0) {
            return false;
        }
        saldo += monto;
        return true;
    }

    public boolean retirar(double monto) {
        if (!activa || monto <= 0 || monto > saldo) {
            return false; 
        }
        saldo -= monto;
        return true;
    }

    
    @Override
    public String toString() {
        return "Cuenta " + numero + " | Saldo: " + String.format("%,.2f", saldo);
    }
}

