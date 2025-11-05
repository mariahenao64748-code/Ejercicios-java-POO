import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReservaHotel {
    
    private String huesped;
    private LocalDate ingreso;
    private LocalDate salida;
    private double tarifaNoche;
    private boolean confirmada;

    
    public ReservaHotel() {
        this.huesped = "Sin nombre";
        this.ingreso = LocalDate.now();
        this.salida = ingreso.plusDays(1);
        this.tarifaNoche = 100.0;
        this.confirmada = false;
    }

    
    public ReservaHotel(String huesped, LocalDate ingreso, LocalDate salida, double tarifaNoche) {
        this.huesped = huesped;
        if (salida.isAfter(ingreso)) {
            this.ingreso = ingreso;
            this.salida = salida;
        } else {
            
            this.ingreso = LocalDate.now();
            this.salida = ingreso.plusDays(1);
        }
        this.tarifaNoche = (tarifaNoche > 0) ? tarifaNoche : 100.0;
        this.confirmada = false;
    }

    
    public long noches() {
        return ChronoUnit.DAYS.between(ingreso, salida);
    }

    
    public double total() {
        return Math.round(noches() * tarifaNoche * 100.0) / 100.0;
    }

    
    public void confirmar() {
        if (!confirmada) {
            confirmada = true;
        }
    }

    
    public boolean cancelar() {
        if (!confirmada) {
            return true; 
        }
        long horasRestantes = ChronoUnit.HOURS.between(LocalDate.now().atStartOfDay(), ingreso.atStartOfDay());
        if (horasRestantes >= 48) {
            confirmada = false;
            return true;
        }
        return false;
    }

    
    public String getHuesped() { return huesped; }
    public LocalDate getIngreso() { return ingreso; }
    public LocalDate getSalida() { return salida; }
    public double getTarifaNoche() { return tarifaNoche; }
    public boolean isConfirmada() { return confirmada; }

    
    public void setIngreso(LocalDate ingreso) {
        if (ingreso != null && salida.isAfter(ingreso) && !confirmada) {
            this.ingreso = ingreso;
        }
    }

    public void setSalida(LocalDate salida) {
        if (salida != null && salida.isAfter(ingreso) && !confirmada) {
            this.salida = salida;
        }
    }

    public void setTarifaNoche(double tarifaNoche) {
        if (tarifaNoche > 0 && !confirmada) {
            this.tarifaNoche = tarifaNoche;
        }
    }

    @Override
    public String toString() {
        return noches() + " noches | $" + String.format("%.2f", total());
    }
}

