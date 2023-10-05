public class Main {
    public static void main(String[] args) {
        Forma[] vet = new Forma[6];

        vet[0] = new Quadrado(5);
        vet[1] = new Triangulo(4, 3);
        vet[2] = new Circulo(3.5);
        vet[3] = new Cubo(6);
        vet[4] = new Tetraedro(6, 7);
        vet[5] = new Esfera(3.5);

        for(Forma f: vet){
            f.getInfo();
            if(f instanceof FormaBidimensional){
                System.out.println("Area: " + f.obterArea());
            } else {
                System.out.println("Volume: " +((FormaTridimensional) f).obterVolume());
            }
        }

    }
}
