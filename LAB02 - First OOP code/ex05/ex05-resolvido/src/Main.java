public class Main {
    public static void main(String[] args) {
        Selecao brasil = new Selecao("Brasil", "Fernando Diniz");
        Selecao argentina = new Selecao("Argentina", "Lionel Scalone");

        brasil.jogadores[0].setNome("Neymar");
        brasil.jogadores[0].setAltura(1.77f);
        brasil.jogadores[0].setPeso(73.5f);
        brasil.jogadores[0].setData_nasc("05/02/1992");
        brasil.jogadores[0].setPosicao("Ponta-Esquerda");
        //.
        //.
        //.
        brasil.jogadores[10].setNome("Vinicius Junior");
        brasil.jogadores[10].setAltura(1.80f);
        brasil.jogadores[10].setPeso(65.5f);
        brasil.jogadores[10].setData_nasc("23/09/1998");
        brasil.jogadores[10].setPosicao("Ponta-Direita");
        brasil.getInfo();


        argentina.jogadores[0].setNome("Lionel Messi");
        argentina.jogadores[0].setAltura(1.67f);
        argentina.jogadores[0].setPeso(70.6f);
        argentina.jogadores[0].setData_nasc("28/06/1984");
        argentina.jogadores[0].setPosicao("Meia-Armador");
        //.
        //.
        //.
        argentina.jogadores[10].setNome("Julia Alvarez");
        argentina.jogadores[10].setAltura(1.84f);
        argentina.jogadores[10].setPeso(78.5f);
        argentina.jogadores[10].setData_nasc("18/03/2000");
        argentina.jogadores[10].setPosicao("Centro-Avante");
        argentina.getInfo();
    }
}
