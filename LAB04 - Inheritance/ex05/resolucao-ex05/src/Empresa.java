import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chefe[] chefe = new Chefe[2];

        Vendedor[] vendedor = new Vendedor[2];

        Operario[] operario = new Operario[2];

        Horista[] horista = new Horista[2];

        chefe[0] = new Chefe("Joao", "18/09/1980", 7000);
        chefe[0].calcSalario();
        chefe[0].mostrarInfo();
        chefe[1] = new Chefe("Lucas", "10/11/1989", 5000);
        chefe[1].calcSalario();
        chefe[1].mostrarInfo();

        vendedor[0] = new Vendedor("Paulo", "23/12/1998", 1000, 6, 100);
        vendedor[0].calcSalario();
        vendedor[0].mostrarInfo();
        vendedor[1] = new Vendedor("Julio", "07/06/1991", 1200, 5, 150);
        vendedor[1].calcSalario();
        vendedor[1].mostrarInfo();

        operario[0] = new Operario("Carlos", "23/07/1980", 6, 200);
        operario[0].calcSalario();
        operario[0].mostrarInfo();
        operario[1] = new Operario("Renato", "18/11/1976", 7, 150);
        operario[1].calcSalario();
        operario[1].mostrarInfo();

        horista[0] = new Horista("Marcos", "16/02/1995", 50, 20);
        horista[0].calcSalario();
        horista[0].mostrarInfo();
        horista[1] = new Horista("Mateus", "08/12/1997", 40, 22);
        horista[1].calcSalario();
        horista[1].mostrarInfo();

    }
}
