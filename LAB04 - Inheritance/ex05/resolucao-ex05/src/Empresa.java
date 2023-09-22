public class Empresa {
    public static void main(String[] args) {
        Chefe chefe = new Chefe("Carlos", "09/05/1981", 5560.5);
        chefe.mostrarInfo();

        Vendedor vendedor = new Vendedor("Felipe", "11/08/1998", 1000, 10, 200);
        vendedor.mostrarInfo();
    }
}
