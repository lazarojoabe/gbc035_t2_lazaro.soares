public class Main {
    public static void main(String[] args) {
        Figurinhas fig = new Figurinhas("Cristiano Ronaldo", "Centro-Avante", "Portugal", "06/02/1981", 87.3f, 1.87f);
        fig.mostrarInfo();

        FigurinhasExtras figExt = new FigurinhasExtras("Lionel Messi",
                "Meia-Armador", "Argentina", "Legends", "Ouro",
                1.67f, "26/06/1983", 76.3f);
        figExt.mostrarFigurinha();
    }
}
