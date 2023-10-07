public class Estudante {
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void print() {
        System.out.print("Estudante{" +
                "nome='" + nome + '\'' +
                "; endereco='" + endereco + '\'' +
                '}');
    }

    public void print(boolean mesmaLinha){
        if(mesmaLinha){
            print();
        } else {
            System.out.println("Estudande");
            System.out.println("Nome: " + nome);
            System.out.println("Endereco: " + endereco);
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}
