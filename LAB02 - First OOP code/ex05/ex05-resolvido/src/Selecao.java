public class Selecao {
    private String nome;
    private  String tecnico;
    private int qtd_mundiais;
    Figurinha[] jogadores = new Figurinha[11];

    public Selecao(String nome, String tecnico){
        this.nome = nome;
        this.tecnico = tecnico;
        jogadores[0] = new Figurinha(nome);
        jogadores[1] = new Figurinha(nome);
        jogadores[2] = new Figurinha(nome);
        jogadores[3] = new Figurinha(nome);
        jogadores[4] = new Figurinha(nome);
        jogadores[5] = new Figurinha(nome);
        jogadores[6] = new Figurinha(nome);
        jogadores[7] = new Figurinha(nome);
        jogadores[8] = new Figurinha(nome);
        jogadores[9] = new Figurinha(nome);
        jogadores[10] = new Figurinha(nome);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void setQtd_mundiais(int qtd_mundiais) {
        this.qtd_mundiais = qtd_mundiais;
    }

    public void getInfo(){
        System.out.println("Seleção da " + nome);
        System.out.println("Tecnico: " + tecnico);
        System.out.printf("Ganhou a Copa do Mundo %d vezes\n", qtd_mundiais);
        System.out.println("Jogadores titulares: ");
        for(int i = 0; i< 11; i++){
            jogadores[i].mostrarInfo();
        }
    }
}
