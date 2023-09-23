public class Vip extends Ingresso{
    protected double valorAdcional;

    public Vip(double valor, double valorAdcional){
        super(valor);
        this.valorAdcional = valorAdcional;
    }
    public double valorVip(){
        return valor + valorAdcional;
    }
}
