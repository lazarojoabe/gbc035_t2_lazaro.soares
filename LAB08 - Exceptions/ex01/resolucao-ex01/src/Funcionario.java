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

    }
    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }
}
