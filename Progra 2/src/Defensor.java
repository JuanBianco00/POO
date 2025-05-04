public class Defensor extends Jugador {
    public Defensor(String nombre, String apellido, int edad, boolean esTitular) {
        super(nombre, apellido, edad, esTitular);
    }

    @Override
    public String toString() {
        return "Defensor: " + getNombre() + " " + getApellido();
    }
}
