public class Figurinha {
    protected String nome;
    protected String data_nasc;
    protected float peso;
    protected float altura;
    protected String pais;
    protected String posicao;

    public  Figurinha(){
        nome = " ";
        pais = " ";
        posicao = " ";
        altura = 0.00f;
        data_nasc = "00/00/0000";
        peso = 0.0f;
    }
    public Figurinha(String nome, String posicao, String pais){
        this.nome = nome;
        this.pais = pais;
        this.posicao = posicao;
        this.altura = 0.00f;
        this.data_nasc = "00/00/0000";
        this.peso = 0.0f;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public String getPais() {
        return pais;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + data_nasc);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
    }
}