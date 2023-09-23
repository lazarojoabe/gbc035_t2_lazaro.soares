public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior(double valor, String localizacao) {
        super(valor);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do Camarote Inferior: " + localizacao);
    }
}