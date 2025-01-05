public class Secondo  extends Piatto{
    private String tipo;
    private Contorno contorno;

    public Secondo(String tipo) {
        this.tipo = tipo;
    }

    public Secondo(String tipo, Contorno contorno) {
        this.tipo = tipo;
        this.contorno = contorno;
    }

    @Override
    public void Preparare() {
        if (contorno == null) System.out.println(tipo + "preparato");
        else System.out.println(tipo + "e" +contorno.getTipo()+ "preparato");
    }
}
