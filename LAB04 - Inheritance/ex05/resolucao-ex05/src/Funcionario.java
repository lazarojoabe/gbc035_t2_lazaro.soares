

public class Funcionario {
    private String nome;
    private String data_nasc;
    private double salario;

    public Funcionario(){
        nome = " ";
        data_nasc = "00/00/0000";
        salario = 0.0;
    }
    public Funcionario(String nome, String data_nasc, double salario){
        this.data_nasc = data_nasc;
        this.nome = nome;
        this.salario = salario;
    }

    public double calcSalario(){
        return salario;
    }
    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nasc: " + data_nasc);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
