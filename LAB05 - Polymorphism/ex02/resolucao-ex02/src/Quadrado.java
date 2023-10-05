public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return lado * lado;
    }

    @Override
    public void getInfo() {
        System.out.println("O objeto é um Quadrado");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
