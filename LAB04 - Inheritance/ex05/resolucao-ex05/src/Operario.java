public class Operario extends Funcionario{
    private double valorProducao;
    private int qtdProduzida;
    public Operario(String nome, String data_nasc, int qtdProduzida, double valorProducao){
        super(nome, data_nasc);
        this.qtdProduzida = qtdProduzida;
        this.valorProducao = valorProducao;
        setSalario(calcSalario());

    }

    public double calcSalario(){
        return valorProducao * qtdProduzida;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Valor da produção: " + valorProducao);
        System.out.println("Quantidade produzida: " + qtdProduzida);
        System.out.println("Salario: " + getSalario());
    }
}

