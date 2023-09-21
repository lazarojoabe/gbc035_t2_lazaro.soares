public class Main {
    public static void main(String[] args) {
        Figurinha fig01 = new Figurinha("Ronaldinho Gaúcho", "Meia-Atacante", "Brasil");
        fig01.setData_nasc("12/07/1974");
        fig01.setPeso(75.4f);
        fig01.setAltura(1.79f);
        fig01.mostrarInfo();

        FigurinhaExtra fig02 = new FigurinhaExtra("Legends", "Ouro");
        fig02.setNome("Robert Lewandowski");
        fig02.setPosicao("Centro-Avante");
        fig02.setPais("Polônia");
        fig02.setAltura(1.92f);
        fig02.setPeso(86.3f);
        fig02.setData_nasc("21/08/1988");
        fig02.mostrarFigurinha();
    }
}
