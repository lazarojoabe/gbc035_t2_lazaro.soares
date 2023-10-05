public class Cubo extends FormaTridimensional{
    private double lado;
    public Cubo(double lado){
        this.lado = lado;
    }

    @Override
    public double obterArea() {
       return 6 * lado * lado;
    }

    @Override
    public double obterVolume() {
        return lado*lado*lado;
    }

    @Override
    public void getInfo() {
        System.out.println("O objeto é um cubo");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
