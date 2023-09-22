public class C2 extends C1{
    private String AtributoA;
    public String AtributoB;
    protected String AtributoC;

    public C2(){
        System.out.println("Classe C2: Chamada do construtor sem parametros");
    }
    public C2(String AtributoA, String AtributoB, String AtributoC, String AtributoC1A,
              String AtributoC1B,  String AtributoC1C) {
        super(AtributoC1A, AtributoC1B, AtributoC1C);
        System.out.println("Classe C2: Chamada do construtor com parametros");
        this.AtributoA = AtributoA;
        this.AtributoB = AtributoB;
        this.AtributoC = AtributoC;
    }

    public void mostrarAtributosC2(){
        mostrarAtributos();
        System.out.println("Atributo A: "+ AtributoA);
        System.out.println("Atributo B: "+ AtributoB);
        System.out.println("Atributo C: "+ AtributoC);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributos();
        System.out.println("Atributo A: "+ AtributoA);
        System.out.println("Atributo B: "+ AtributoB);
        System.out.println("Atributo C: "+ AtributoC);
    }
}