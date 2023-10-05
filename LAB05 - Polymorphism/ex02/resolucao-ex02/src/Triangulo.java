public class Triangulo extends FormaBidimensional{
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return base * altura;
    }

    @Override
    public void getInfo() {
        System.out.println("O objeto é um Triangulo");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
