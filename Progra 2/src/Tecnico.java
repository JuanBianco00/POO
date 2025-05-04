public class Tecnico extends Persona {
    private int anosExperiencia;
    private boolean esNacional;

    public Tecnico(String nombre, String apellido, int edad, boolean esNacional) {
        super(nombre, apellido, edad);
        this.esNacional = esNacional;
        this.anosExperiencia = 0;
    }

    @Override
    public String toString() {
        return "Técnico: " + getNombre() + " " + getApellido() + " (Nacional: " + esNacional + ")";
    }

    public String getNombre() {
        return "";
    }
}
