public class Cliente implements Classificavel{
    private String nome;
    private String cpf;
    private String dataNasc;

    public Cliente(String nome, String cpf, String dadNasc){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dadNasc;
    }

    public int eMenorQue(Classificavel obj){
        Cliente c = (Cliente) obj;
        if(nome.length() < c.nome.length()){
            return 0;
        } else {
            return 1;
        }
        //será ordenado por tamanho de nome
    }

    public String getNome() {
        return nome;
    }
}