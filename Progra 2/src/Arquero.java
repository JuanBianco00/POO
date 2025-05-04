public class Arquero extends Jugador {
    private int golesRecibidos;

    public Arquero(String nombre, String apellido, int edad, boolean esTitular, int golesRecibidos) {
        super(nombre, apellido, edad, esTitular);
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public String toString() {
        return "Arquero: " + getNombre() + " " + getApellido() + ", Goles recibidos: " + golesRecibidos;
    }
}
