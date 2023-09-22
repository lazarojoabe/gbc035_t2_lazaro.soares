public class Chefe extends Funcionario{

    public Chefe(String nome, String data_nasc, double salario){
        super(nome, data_nasc, salario);
    }

    @Override
    public double calcSalario() {
        return this.getSalario();
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Salario: " + this.getSalario());
    }
}
