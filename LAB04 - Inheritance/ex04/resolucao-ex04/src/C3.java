public class C3 extends C2{
    private String atributoA;
    public String atributoB;
    protected String atributoC;
    public C3(){
        System.out.println("Classe C1: Chamada do construtor sem parametros");
    }
    public C3(String atributoA, String atributoB, String atributoC, String AtributoC2A,
              String AtributoC2B,  String AtributoC2C, String AtributoC1A,
              String AtributoC1B,  String AtributoC1C){
        super(AtributoC2A, AtributoC2B, AtributoC2C, AtributoC1A, AtributoC1B, AtributoC1C);
        System.out.println("Classe C1: Chamada do construtor com parametros");
        this.atributoA = atributoA;
        this.atributoB = atributoB;
        this.atributoC = atributoC;
    }

    public void mostrarAtributosC3(){
        mostrarAtributosC2();
        System.out.println("Atributo A: "+ atributoA);
        System.out.println("Atributo B: "+ atributoB);
        System.out.println("Atributo C: "+ atributoC);
    }


    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
        System.out.println("Atributo A: "+ atributoA);
        System.out.println("Atributo B: "+ atributoB);
        System.out.println("Atributo C: "+ atributoC);
    }
}