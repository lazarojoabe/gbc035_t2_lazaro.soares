public class FolhaPagamento {

    public static void mostrarFolha(int numF, Funcionario[] vet){
        for(Funcionario f: vet){
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salario: " + f.calcSalario());
        }
    }
}
