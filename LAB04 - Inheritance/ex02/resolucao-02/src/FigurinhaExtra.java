public class FigurinhaExtra extends Figurinha {
    private String categoria;
    private String cor;

    public FigurinhaExtra(String categoria, String cor){
        super();
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
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + data_nasc);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }
}
