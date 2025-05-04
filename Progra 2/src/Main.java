public class Main {
    public static void main(String[] args) {
        // Crear técnico
        Tecnico tecnico = new Tecnico("Carlos", "Bianchi", 60, true);

        // Crear arquero
        Arquero arquero = new Arquero("Juan", "Pérez", 28, true, 10);

        // Crear defensores (4)
        Defensor[] defensores = {
                new Defensor("Luis", "Martínez", 27, true),
                new Defensor("Carlos", "López", 29, true),
                new Defensor("Pedro", "Gómez", 25, false),
                new Defensor("Sergio", "Fernández", 30, true)
        };

        // Crear mediocampistas (3)
        Mediocampo[] mediocampistas = {
                new Mediocampo("Esteban", "Morales", 26, true, 5),
                new Mediocampo("Matías", "García", 24, false, 3),
                new Mediocampo("Diego", "Suárez", 28, true, 7)
        };

        // Crear delanteros (3)
        Delantero[] delanteros = {
                new Delantero("Lionel", "Messi", 35, true, 30),
                new Delantero("Julián", "Álvarez", 23, true, 20),
                new Delantero("Ángel", "Correa", 27, false, 12)
        };

        // Crear el equipo de fútbol
        EquipoFutbol equipo = new EquipoFutbol(
                "JB Fútbol Club",
                "Argentina",
                tecnico,
                arquero,
                defensores,
                mediocampistas,
                delanteros
        );

        // Imprimir información del equipo
        equipo.imprimir(); // este método deberías implementarlo con System.out.println(...)
    }
}
