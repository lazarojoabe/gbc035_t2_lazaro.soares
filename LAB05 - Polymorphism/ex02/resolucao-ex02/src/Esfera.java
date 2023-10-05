public class Esfera extends FormaTridimensional{
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double obterVolume() {
        return 4/3 * Math.PI * raio * raio * raio;
    }

    @Override
    public void getInfo() {
        System.out.println("O objeto é uma Esfera");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
