public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private double tetoSalarial;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        tetoSalarial = 40000;
    }

    public void aumentarSalario(double porcentagem){
        if(porcentagem < 0){
            throw new Excecao("Valor negativo");
        } else if(salario*(1 + porcentagem) > tetoSalarial) {
            throw new Excecao("Excede o teto");
        } else{
            salario = salario * (1+porcentagem);
        }
    }
    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public double getSalario() {
        return salario;
    }
}
