public class Vehiculo {
    
    private String placa;
    private String marca;
    private double capacidadTanqueLitros;
    private double combustibleActual;
    private double kmPorLitro;

    
    public Vehiculo() {
        this.placa = "XXX000";
        this.marca = "Desconocida";
        this.capacidadTanqueLitros = 40.0;
        this.combustibleActual = 0.0;
        this.kmPorLitro = 10.0;
    }

    
    public Vehiculo(String placa, String marca, double capacidadTanqueLitros, double combustibleActual, double kmPorLitro) {
        this.placa = placa;
        this.marca = marca;
        this.capacidadTanqueLitros = (capacidadTanqueLitros > 0) ? capacidadTanqueLitros : 40.0;
        this.kmPorLitro = (kmPorLitro > 0) ? kmPorLitro : 10.0;
        if (combustibleActual < 0) this.combustibleActual = 0;
        else if (combustibleActual > this.capacidadTanqueLitros) this.combustibleActual = this.capacidadTanqueLitros;
        else this.combustibleActual = combustibleActual;
    }

    
    public void recargar(double litros) {
        if (litros > 0) {
            if (combustibleActual + litros <= capacidadTanqueLitros) {
                combustibleActual += litros;
            } else {
                combustibleActual = capacidadTanqueLitros; 
            }
        } else {
            System.out.println(" Cantidad de litros inválida.");
        }
    }

    
    public void conducir(double km) {
        if (km <= 0) {
            System.out.println(" La distancia debe ser positiva.");
            return;
        }

        double consumo = km / kmPorLitro;

        if (consumo <= combustibleActual) {
            combustibleActual -= consumo;
        } else {
            System.out.println(" No hay suficiente combustible para recorrer esa distancia.");
        }
    }

    
    public double autonomia() {
        return Math.round(combustibleActual * kmPorLitro * 10.0) / 10.0;
    }

    @Override
    public String toString() {
        return placa + " | Autonomía: " + autonomia() + " km.";
    }
}

