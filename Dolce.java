public class Dolce extends Piatto{
    private String tipo;

    public Dolce(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void Preparare() {
        System.out.println(tipo + "preparato");
    }
}
