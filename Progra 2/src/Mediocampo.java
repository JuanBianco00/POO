public class Mediocampo extends Jugador {
    private int numeroAsistencias;

    public Mediocampo(String nombre, String apellido, int edad, boolean esTitular, int numeroAsistencias) {
        super(nombre, apellido, edad, esTitular);
        this.numeroAsistencias = numeroAsistencias;
    }

    @Override
    public String toString() {
        return "Mediocampo: " + getNombre() + " " + getApellido() + ", Asistencias: " + numeroAsistencias;
    }
}
