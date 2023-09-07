public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;
    private Cidade naturalidade = new Cidade();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void getInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Natural de " + naturalidade.getNome());
    }
}
