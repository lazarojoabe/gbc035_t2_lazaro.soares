public class C3 extends C2{
    private String atributoA;
    public String atributoB;
    protected String atributoC;
    public C3(){
        System.out.println("Classe C1: Chamada do construtor sem parametros");
    }
    public C3(String atributoA, String atributoB, String atributoC){
        super(atributoA, atributoB, atributoC);
        System.out.println("Classe C1: Chamada do construtor com parametros");
    }

    public void mostrarAtributos(){
        System.out.println("Atributo A: "+ atributoA);
        System.out.println("Atributo B: "+ atributoB);
        System.out.println("Atributo C: "+ atributoC);
    }
}
