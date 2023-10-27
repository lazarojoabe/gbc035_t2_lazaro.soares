public class Servico implements Classificavel{
    private double preco;
    private String publicoAlvo;
    private double duracao; //horas
    private String nome;

    public Servico(String nome, double preco, String publicoAlvo, double duracao){
        this.nome = nome;
        this.preco = preco;
        this.publicoAlvo = publicoAlvo;
        this.duracao = duracao;
    }

    public boolean eMenorQue(Classificavel obj){
        Servico compara = (Servico) obj;
        return this.preco < compara.preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
