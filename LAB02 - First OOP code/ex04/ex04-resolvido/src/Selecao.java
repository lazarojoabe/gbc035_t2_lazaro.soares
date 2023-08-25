import java.sql.SQLOutput;

public class Selecao {
    private String nome;
    private  String tecnico;
    private int qtd_mundiais;
    Jogador[] jogadores = new Jogador[11];

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
        for(int i = 0; i < 11; i++){
            jogadores[i].mostrarInfo();
        }
    }
}
