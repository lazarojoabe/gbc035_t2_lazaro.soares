public class Produto implements Classificavel {
    private int codigo;
    private String nome;
    private String categoria;

    public Produto(String nome, int codigo, String categoria){
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    public boolean eMenorQue(Classificavel obj){
        Produto compara = (Produto)  obj;
        return this.codigo < compara.codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigo(){
        return codigo;
    }
}
