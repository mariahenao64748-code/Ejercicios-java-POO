public class Pelicula {
    
    private String titulo;
    private int anio;
    private String clasificacion;
    private int copias;
    private int alquiladas;

    
    public Pelicula() {
        this.titulo = "Sin título";
        this.anio = 2000;
        this.clasificacion = "G";
        this.copias = 1;
        this.alquiladas = 0;
    }

    
    public Pelicula(String titulo, int anio, String clasificacion, int copias, int alquiladas) {
        this.titulo = titulo;
        this.anio = (anio >= 1900) ? anio : 1900;
        this.clasificacion = clasificacion;
        this.copias = (copias >= 0) ? copias : 0;
        this.alquiladas = (alquiladas >= 0 && alquiladas <= copias) ? alquiladas : 0;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public int getCopias() {
        return copias;
    }

    public int getAlquiladas() {
        return alquiladas;
    }

    
    private int edadMinima(String clasificacion) {
        switch (clasificacion.toUpperCase()) {
            case "G": return 0;
            case "PG13": return 13;
            case "R": return 17;
            default: return 0; 
        }
    }

    
    public boolean alquilar(int edadCliente) {
        int edadMinima = edadMinima(clasificacion);

        if (edadCliente < edadMinima) {
            System.out.println("❌ No puede alquilar: edad insuficiente para clasificación " + clasificacion);
            return false;
        }

        if (alquiladas < copias) {
            alquiladas++;
            return true;
        } else {
            System.out.println("❌ No hay copias disponibles de " + titulo);
            return false;
        }
    }

    
    public boolean devolver() {
        if (alquiladas > 0) {
            alquiladas--;
            return true;
        } else {
            return false;
        }
    }

    
    @Override
    public String toString() {
        return titulo + " (" + clasificacion + ") | disp: " + (copias - alquiladas) + "/" + copias;
    }
}

