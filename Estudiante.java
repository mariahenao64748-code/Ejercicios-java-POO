public class Estudiante {
    
    private String id;
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    
    public Estudiante() {
        this.id = "000";
        this.nombre = "Sin nombre";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
    }

    
    public Estudiante(String id, String nombre, double nota1, double nota2, double nota3) {
        this.id = id;
        this.nombre = nombre;
        this.nota1 = validarNota(nota1);
        this.nota2 = validarNota(nota2);
        this.nota3 = validarNota(nota3);
    }

    
    private double validarNota(double nota) {
        if (nota < 0.0) return 0.0;
        if (nota > 5.0) return 5.0;
        return nota;
    }

    
    public void setNota1(double nota1) {
        this.nota1 = validarNota(nota1);
    }

    public void setNota2(double nota2) {
        this.nota2 = validarNota(nota2);
    }

    public void setNota3(double nota3) {
        this.nota3 = validarNota(nota3);
    }

    
    public double getPromedio() {
        double promedio = (nota1 + nota2 + nota3) / 3;
        return Math.round(promedio * 10.0) / 10.0;
    }

    
    public boolean aprobado() {
        return getPromedio() >= 3.0;
    }

    
    @Override
    public String toString() {
        String estado = (aprobado()) ? "Aprobado" : "Reprobado";
        return "ID: " + id + " | Prom: " + getPromedio() + " | " + estado + ".";
    }
}

