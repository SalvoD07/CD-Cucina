public class Contorno extends Piatto{
    private String tipo;

    public Contorno(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void Preparare() {
        System.out.println(tipo + " preparato");
    }

    public String getTipo() {
        return tipo;
    }
}
