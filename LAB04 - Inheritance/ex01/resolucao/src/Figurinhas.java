public class Figurinhas {
    private String nome;
    private String data_nasc;
    private float peso;
    private float altura;
    private String pais;
    private String posicao;

    public Figurinhas(String nome, String posicao, String pais, String data_nasc, float peso,
                      float altura){
        this.nome = nome;
        this.pais = pais;
        this.posicao = posicao;
        this.altura = altura;
        this.data_nasc = data_nasc;
        this.peso = peso;
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

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
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

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + data_nasc);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
    }
}