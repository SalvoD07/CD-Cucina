public class Pasta extends Piatto{
    private Sugo sugo;
    private String condimento;

    public Pasta(Sugo sugo) {
        this.sugo = sugo;
        condimento = sugo.getTipo();
    }

    @Override
    public void Preparare() {
        System.out.println("Pasta con" + condimento + "preparata");
    }
}
