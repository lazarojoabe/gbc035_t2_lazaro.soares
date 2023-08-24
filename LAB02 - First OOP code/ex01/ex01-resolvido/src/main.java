public class main {
    public static void main(String[] args) {
        figurinha a = new figurinha();
        figurinha b = new figurinha();
        figurinha c = new figurinha();

        a.nome = "Lionel Messi";
        a.altura = 1.67f;
        a.posicao = "Meia-Armador";
        a.data_nasc = "28/06/1985";
        a.pais = "Argentina";
        a.peso = 70.6f;
        a.mostrarIfo();

        b.nome = "Hulk";
        b.altura = 1.75f;
        b.posicao = "Centro-Avante";
        b.data_nasc = "17/08/1983";
        b.pais = "Brasil";
        b.peso = 95.6f;
        b.mostrarIfo();

        c.nome = "Van Dijk";
        c.altura = 1.92f;
        c.posicao = "Zagueiro";
        c.data_nasc = "07/10/1990";
        c.pais = "Holanda";
        c.peso = 83.7f;
        c.mostrarIfo();
    }
}
