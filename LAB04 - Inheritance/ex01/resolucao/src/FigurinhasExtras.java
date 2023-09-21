public class FigurinhasExtras {
    private Figurinhas dados_basicos;
    private String categoria;
    private String cor;

    public FigurinhasExtras(String nome, String posicao, String pais, String categoria,
                            String cor, float altura, String Data_nasc, float peso){
        dados_basicos = new Figurinhas(nome, posicao, pais);
        dados_basicos.setData_nasc(Data_nasc);
        dados_basicos.setAltura(altura);
        dados_basicos.setPeso(peso);
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
        System.out.println("Nome: " + dados_basicos.getNome());
        System.out.println("Posicao: " + dados_basicos.getPosicao());
        System.out.println("País: " + dados_basicos.getPais());
        System.out.println("Data de nasc: " + dados_basicos.getData_nasc());
        System.out.println("Peso: " + dados_basicos.getPeso());
        System.out.println("Altura: " + dados_basicos.getAltura());
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }
}
