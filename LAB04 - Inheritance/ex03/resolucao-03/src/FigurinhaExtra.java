public class FigurinhaExtra extends Figurinha {
    private String categoria;
    private String cor;

    public FigurinhaExtra(Figurinha jogador, String categoria, String cor){
        super(jogador.getNome(), jogador.getPosicao(), jogador.getPais());
        this.setPeso(jogador.getPeso());
        this.setAltura(jogador.getAltura());
        this.setData_nasc(jogador.getData_nasc());
        this.categoria = categoria;
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void mostrarFigurinha(){
        super.mostrarInfo();
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }
}
