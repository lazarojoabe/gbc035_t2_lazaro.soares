public class Main {
    public static void main(String[] args) {
        Selecao brasil = new Selecao();
        Selecao argentina = new Selecao();

        for(int i = 0; i < 11; i++){
            brasil.jogadores[i] = new Jogador();
            argentina.jogadores[i] = new Jogador();
        }
        brasil.setNome("Brasil");
        brasil.setTecnico("Fernando Diniz");
        brasil.setQtd_mundiais(5);

        argentina.setNome("Argentina");
        argentina.setTecnico("Lionel Scaloni");
        argentina.setQtd_mundiais(3);

        brasil.jogadores[0].setNome("Alisson");
        brasil.jogadores[0].setAltura(1.87f);
        brasil.jogadores[0].setPeso(81.4f);
        brasil.jogadores[0].setData_nasc("11/06/1990");
        brasil.jogadores[0].setPosicao("Goleiro");
        brasil.jogadores[0].setPais("Brasil");
        //.
        //.
        //.
        brasil.jogadores[10].setNome("Vinicius Junior");
        brasil.jogadores[10].setAltura(1.80f);
        brasil.jogadores[10].setPeso(65.5f);
        brasil.jogadores[10].setData_nasc("23/09/1998");
        brasil.jogadores[10].setPosicao("Ponta-Direita");
        brasil.jogadores[10].setPais("Brasil");
        brasil.getInfo();


        argentina.jogadores[0].setNome("Lionel Messi");
        argentina.jogadores[0].setAltura(1.67f);
        argentina.jogadores[0].setPeso(70.6f);
        argentina.jogadores[0].setData_nasc("28/06/1984");
        argentina.jogadores[0].setPosicao("Meia-Armador");
        argentina.jogadores[0].setPais("Argentina");
        //.
        //.
        //.
        argentina.jogadores[10].setNome("Julia Alvarez");
        argentina.jogadores[10].setAltura(1.84f);
        argentina.jogadores[10].setPeso(78.5f);
        argentina.jogadores[10].setData_nasc("18/03/2000");
        argentina.jogadores[10].setPosicao("Centro-Avante");
        argentina.jogadores[10].setPais("Argentina");
        argentina.getInfo();
    }
}
