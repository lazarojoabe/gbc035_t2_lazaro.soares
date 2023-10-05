public class Vendedor extends Funcionario{
    private double salarioFixo;
    private int vendas;
    private double comissao;
    public Vendedor(String nome, String data_nasc, double salarioFixo, int vendas, double comissao){
        super(nome, data_nasc);
        this.salarioFixo = salarioFixo;
        this.comissao = comissao;
        this.vendas = vendas;
        setSalario(calcSalario());

    }

    @Override
    public double calcSalario() {
        return salarioFixo  + (comissao * vendas);
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Salario: " + getSalario());
        System.out.println("Vendas: " + vendas);
        System.out.println("Comissao: " + comissao);
    }
}