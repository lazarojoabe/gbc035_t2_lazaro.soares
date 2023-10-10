public abstract class Contato {
    private String apelido;
    private String nome;
    private String email;
    private String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario){
        this.aniversario = aniversario;
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
    }

    public void imprimirBasico(){
        System.out.println("Nome: " + nome);
        System.out.println("Apelido: " + apelido);
        System.out.println("Email: " + email);
        System.out.println("Aniversario: " + aniversario);
    }

    public abstract void imprimirContato();
}
