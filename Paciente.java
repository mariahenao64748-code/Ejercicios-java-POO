public class Paciente {
    
    private String documento;
    private String nombre;
    private int edad;
    private char nivelTriage; 
    private boolean atendido;

    
    public Paciente() {
        this.documento = "Sin documento";
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.nivelTriage = 'E';
        this.atendido = false;
    }

    
    public Paciente(String documento, String nombre, int edad, char nivelTriage) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = (edad >= 0) ? edad : 0;
        setNivelTriage(nivelTriage); 
        this.atendido = false;
    }

    
    public char getNivelTriage() {
        return nivelTriage;
    }

    public void setNivelTriage(char nivelTriage) {
        nivelTriage = Character.toUpperCase(nivelTriage); 
        if (nivelTriage >= 'A' && nivelTriage <= 'E') {
            this.nivelTriage = nivelTriage;
        } else {
            this.nivelTriage = 'E'; 
        }
    }

    
    public int prioridad() {
        return nivelTriage - 'A' + 1;
    }

    
    public void marcarAtendido() {
        this.atendido = true;
    }

    
    public boolean isAtendido() {
        return atendido;
    }

    
    @Override
    public String toString() {
        return "Triage " + nivelTriage + " | Prioridad " + prioridad() + " | Atendido: " + atendido;
    }
}
