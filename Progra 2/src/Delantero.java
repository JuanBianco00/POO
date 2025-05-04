public class Delantero extends Jugador {
    private int golesAnotados;

    public Delantero(String nombre, String apellido, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellido, edad, esTitular);
        this.golesAnotados = golesAnotados;
    }

    @Override
    public String toString() {
        return "Delantero: " + getNombre() + " " + getApellido() + ", Goles: " + golesAnotados;
    }
}
