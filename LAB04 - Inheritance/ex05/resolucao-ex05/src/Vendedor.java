public class Vendedor extends Funcionario{

    private int vendas;
    private double comissao;
    public Vendedor(String nome, String data_nasc, double salarioFixo, int vendas, double comissao){
        super(nome, data_nasc, salarioFixo);
        this.setSalario(calcSalario());
        this.comissao = comissao;
        this.vendas = vendas;
    }

    @Override
    public double calcSalario() {
        this.setSalario(this.getSalario() + (comissao * vendas));
        return getSalario();
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Vendas: " + vendas);
        System.out.println("Comissao: " + comissao);
    }
}
