public class Sensor {
    
    private String id;
    private double ultimaLecturaC;
    private double umbralAlto;
    private double umbralBajo;
    private boolean activo;

    
    public Sensor() {
        this.id = "S-00";
        this.ultimaLecturaC = 0.0;
        this.umbralBajo = 0.0;
        this.umbralAlto = 100.0;
        this.activo = false;
    }

    
    public Sensor(String id, double umbralBajo, double umbralAlto) {
        this.id = id;
        if (umbralBajo < umbralAlto) {
            this.umbralBajo = umbralBajo;
            this.umbralAlto = umbralAlto;
        } else {
            
            this.umbralBajo = 0.0;
            this.umbralAlto = 100.0;
        }
        this.ultimaLecturaC = 0.0;
        this.activo = false;
    }

    
    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }

    
    public void actualizarLectura(double nuevaLectura) {
        if (activo) {
            this.ultimaLecturaC = nuevaLectura;
        }
    }

    
    public boolean enAlarma() {
        return ultimaLecturaC < umbralBajo || ultimaLecturaC > umbralAlto;
    }

    
    @Override
    public String toString() {
        return id + " | " + ultimaLecturaC + "°C | Alarma: " + enAlarma();
    }
}
