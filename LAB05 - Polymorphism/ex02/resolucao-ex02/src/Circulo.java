

public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return Math.PI*(raio*raio);
    }

    @Override
    public void getInfo() {
        System.out.println("O objeto é um circulo");
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
}
