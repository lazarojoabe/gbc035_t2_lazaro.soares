public class Horista extends Funcionario{
    private double valorPorHora;
    private int totHoras;

    public Horista(String nome, String dataNasc, double valorPorHora, int totHoras){
        super(nome, dataNasc);
        this.totHoras = totHoras;
        this.valorPorHora = valorPorHora;
        setSalario(calcSalario());
    }

    public double calcSalario(){
        return totHoras * valorPorHora;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Salario: " + getSalario());
        System.out.println("Total de horas: " + totHoras);
        System.out.println("Valor por hora: " + valorPorHora);
    }
}
