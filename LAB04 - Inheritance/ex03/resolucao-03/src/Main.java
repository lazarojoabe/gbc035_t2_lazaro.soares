public class Main {
    public static void main(String[] args) {
        Figurinha fig01 = new Figurinha("Ronaldinho Gaúcho", "Meia-Atacante", "Brasil");
        fig01.setData_nasc("12/07/1974");
        fig01.setPeso(75.4f);
        fig01.setAltura(1.79f);
        fig01.mostrarInfo();

        FigurinhaExtra fig02 = new FigurinhaExtra(fig01, "Legends", "Ouro");
        fig02.mostrarFigurinha();
    }
}
