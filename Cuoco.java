public class Cuoco {
    public static Piatto cucinare(String richiesta){
        if (richiesta.equals("bolognese")||(richiesta.equals("siciliana"))||(richiesta.equals("matriciana"))) {
            Sugo sugo = new Sugo(richiesta);
            sugo.Preparare();
            Pasta pasta = new Pasta(sugo);
            pasta.Preparare();
            return pasta;
        } else if (richiesta.equals("mascarpone")||(richiesta.equals("torta di pinoli"))||(richiesta.equals("torta della nonna"))){
            return new Dolce(richiesta);
        }
        return null;
    }

    public static Piatto cucinare(String richiesta, String contorno_choice) {
        if (richiesta.equals("frittata") || (richiesta.equals("caprese")) || (richiesta.equals("carne alla griglia"))) {
            if (!contorno_choice.isEmpty()) {
                Contorno contorno = new Contorno(contorno_choice);
                contorno.Preparare();
                Secondo secondo = new Secondo(richiesta, contorno);
                secondo.Preparare();
                return secondo;
            } else {
                Secondo secondo = new Secondo(richiesta);
                secondo.Preparare();
                return secondo;
            }
        }
        return null;
    }
}
