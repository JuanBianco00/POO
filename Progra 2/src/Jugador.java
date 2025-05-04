public abstract class Jugador extends Persona {
    private boolean esTitular;

    public Jugador(String nombre, String apellido, int edad, boolean esTitular) {
        super(nombre, apellido, edad);
        this.esTitular = esTitular;
    }

    public boolean isTitular() {
        return esTitular;
    }

    public abstract String toString();
}
