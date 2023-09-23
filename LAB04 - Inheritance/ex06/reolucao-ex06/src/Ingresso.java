public class Ingresso {
    protected double valor;

    public Ingresso(){
        valor = 0;
    }

    public Ingresso(double valor){
        this.valor = valor;
    }

    public void escreveValor(){
        System.out.println("Valor: " + valor);
    }
}
