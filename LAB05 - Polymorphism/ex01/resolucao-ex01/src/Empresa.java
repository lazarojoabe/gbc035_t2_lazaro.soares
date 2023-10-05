import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] vet = new Funcionario[4];

        vet[0] = new Chefe("Joao", "18/09/1980", 7000);
        vet[1] = new Vendedor("Paulo", "23/12/1998", 1000, 6, 100);
        vet[2] = new Operario("Carlos", "23/07/1980", 6, 200);
        vet[3] =  new Horista("Mateus", "08/12/1997", 40, 22);
        FolhaPagamento.mostrarFolha(vet);
    }
}