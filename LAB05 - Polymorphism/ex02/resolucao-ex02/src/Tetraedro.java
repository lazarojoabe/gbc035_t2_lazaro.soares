import static java.lang.Math.sqrt;

public class Tetraedro extends FormaTridimensional{
    private double lado;
    private double altura;

    public Tetraedro(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return lado * lado * sqrt(3);
    }

    @Override
    public double obterVolume() {
        //como todos os triangulos de um tetraedo são equiláteros, basta calcular
        //a area de qualquer triando e ela será igual à area da base, que também é um triangulo
        double areaBase = obterArea()/4;
        return (double) 1/3 * areaBase * altura;
    }

    @Override
    public void getInfo() {
        System.out.println("O objeto é um Tetraedro");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
