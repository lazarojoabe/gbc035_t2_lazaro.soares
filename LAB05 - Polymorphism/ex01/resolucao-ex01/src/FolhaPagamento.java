public class FolhaPagamento {

    public static void mostrarFolha(Funcionario[] vet){
        for(Funcionario f: vet){
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salario: " + f.calcSalario());
        }
    }
}
