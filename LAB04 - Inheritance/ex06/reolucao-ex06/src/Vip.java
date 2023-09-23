public class Vip extends Ingresso{
    protected double valorAdcional;

    public Vip(double valor){
        this.valor = valor;
        valorAdcional = 0;
    }
    public Vip(double valor, double valorAdcional){
        super(valor);
        this.valorAdcional = valorAdcional;
    }
    public double valorVip(){
        return valor + valorAdcional;
    }

    public double getValorAdcional() {
        return valorAdcional;
    }

    public void setValorAdcional(double valorAdcional) {
        this.valorAdcional = valorAdcional;
    }
}
