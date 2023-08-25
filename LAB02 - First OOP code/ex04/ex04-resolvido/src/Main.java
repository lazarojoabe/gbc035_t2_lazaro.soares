public class Main {
    public static void main(String[] args) {
        Selecao a = new Selecao();
        Selecao b = new Selecao();
        a.setNome("Brasil");
        a.setTecnico("Fernando Diniz");
        a.setQtd_mundiais(5);
        a.jogadores[0].setNome("Alisson");
        a.jogadores[0].setAltura(1.87f);
        a.jogadores[0].setPeso(81.4f);
        a.jogadores[0].setData_nasc("11/06/1990");
        a.jogadores[0].setPosicao("Goleiro");
        a.jogadores[0].setPais("Brasil");
        //resta somente instanciar
    }
}
