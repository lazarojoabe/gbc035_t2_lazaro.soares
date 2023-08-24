public class Main {
    public static void main(String[] args) {
        Figurinha a = new Figurinha();
        Figurinha b = new Figurinha();
        Figurinha c = new Figurinha();

        a.setNome("Lionel Messi");
        a.setAltura(1.67f);
        a.setPais("Argentina");
        a.setPosicao("Meia-armador");
        a.setPeso(70.5f);
        a.setData_nasc("28/06/1985");
        a.mostrarIfo();

        b.setNome("Hulk");
        b.setAltura(1.75f);
        b.setPais("Brasil");
        b.setPosicao("Centro-Avante");
        b.setPeso(95.6f);
        b.setData_nasc("17/08/1983");
        b.mostrarIfo();

        c.setNome("Van Dijk");
        c.setAltura(1.95f);
        c.setPais("Holanda");
        c.setPosicao("Zagueiro");
        c.setPeso(83.7f);
        c.setData_nasc("07/10/1990");
        c.mostrarIfo();
    }
}
