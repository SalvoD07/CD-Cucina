public class Sugo extends Piatto{
    private String tipo;

    public Sugo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void Preparare() {
        System.out.println(tipo + " preparato");
        System.out.println();
    }

    public String getTipo() {
        return tipo;
    }
}
