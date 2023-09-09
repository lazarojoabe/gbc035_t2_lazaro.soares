import java.util.Scanner;

public class Orquestra {
    private int qtd_musico;
    private Musico maestro;
    private String[] instrumentos;//Assumindo que um musico tocará somente um instrumento
    private Musico[] musicos;

    public Orquestra(int qtd_musico, String maesto){
        this.qtd_musico = qtd_musico;
        maestro = new Musico();
        maestro.setNome(maesto);
        Musico[] musicos = new Musico[qtd_musico];
        String[] instrumentos = new String[qtd_musico];
    }
    public void adcionarMusico(){
        Scanner sc = new Scanner(System.in);
        String nome, instrumento;
        for(int i = 0; i < qtd_musico; i++){
            Musico musico = new Musico();
            String instrumentos = new String();
            sc.nextLine();
            System.out.println("Insira o nome do musico " + (i + 1));
            nome = sc.nextLine();
            musico.setNome(nome);
            System.out.println("Insira o instrumento do musico " + (i + 1));
            instrumento = sc.nextLine();
            musico.setInstrumento(instrumento);
            musicos[i] = musico;
            instrumentos[i] = instrumentos;

        }
    }
    public void mostrarInfo(){
        System.out.println("Qtd de musicos: " + qtd_musico);
        System.out.println("Maestro: " + maestro.getNome());
        System.out.println("Musicos: ");
        for (int i = 0; i < qtd_musico; i++) {
            System.out.printf("Nome: %s, Instrumento: %s", musicos[i].getNome(), instrumentos[i].);
        }

    }
    public void setMusicos(Musico[] musicos) {
        this.musicos = musicos;
    }

    public String[] getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(String[] instrumentos) {
        this.instrumentos = instrumentos;
    }

}
