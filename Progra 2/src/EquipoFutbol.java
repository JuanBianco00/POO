public class EquipoFutbol {
    private String nombre;
    private String pais;
    private Tecnico tecnico;
    private Arquero arquero;
    private Defensor[] defensores;
    private Mediocampo[] mediocampos;
    private Delantero[] delanteros;

    public EquipoFutbol(String nombre, String pais, Tecnico tecnico, Arquero arquero,
                        Defensor[] defensores, Mediocampo[] mediocampos, Delantero[] delanteros) {
        this.nombre = nombre;
        this.pais = pais;
        this.tecnico = tecnico;
        this.arquero = arquero;
        this.defensores = defensores;
        this.mediocampos = mediocampos;
        this.delanteros = delanteros;
    }

    public void imprimir() {
        System.out.println("Equipo: " + nombre + " (" + pais + ")");
        System.out.println(tecnico.toString());
        System.out.println(arquero.toString());

        for (Defensor d : defensores)
            System.out.println(d.toString());

        for (Mediocampo m : mediocampos)
            System.out.println(m.toString());

        for (Delantero d : delanteros)
            System.out.println(d.toString());
    }
}
