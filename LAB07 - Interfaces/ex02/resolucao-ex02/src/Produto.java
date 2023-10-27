public class Produto implements Classificavel {
    private int codigo;
    private String nome;
    private String categoria;

    public Produto(String nome, int codigo, String categoria){
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    public int eMenorQue(Classificavel obj){
        Produto compara = (Produto)  obj;
        if(codigo < compara.codigo){
            return 0;
        } else {
            return 1;
        }
    }

    public String getNome(){
        return nome;
    }

    public int getCodigo(){
        return codigo;
    }
}