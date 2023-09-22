public class C2 extends C1{
    private String AtributoA;
    public String AtributoB;
    protected String AtributoC;

    public C2(){
        System.out.println("Classe C2: Chamada do construtor sem parametros");
    }
    public C2(String atributoA, String atributoB, String atributoC){
        System.out.println("Classe C2: Chamada do construtor com parametros");
        this.AtributoA = atributoA;
        this.AtributoB = atributoB;
        this.AtributoC = atributoC;
    }

    @Override
    public void mostrarAtributos(){
        System.out.println("Atributo C1.A: " + getAtributoA());
        System.out.println("Atributo C1.B: " + atributoB);
        System.out.println("Atributo C1.C: " + atributoC);
        System.out.println("Atributo A: "+ AtributoA);
        System.out.println("Atributo B: "+ AtributoB);
        System.out.println("Atributo C: "+ AtributoC);
    }
}
