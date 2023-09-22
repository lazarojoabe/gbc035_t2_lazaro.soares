public class C1 {
    private String atributoA;
    public String atributoB;
    protected String atributoC;
    public C1(){
        System.out.println("Classe C1: Chamada do construtor sem parametros");
    }
    public C1(String atributoA, String atributoB, String atributoC){
        System.out.println("Classe C1: Chamada do construtor com parametros");
        this.atributoA = atributoA;
        this.atributoB = atributoB;
        this.atributoC = atributoC;
    }

    public void mostrarAtributos(){
        System.out.println("Atributo A: "+ atributoA);
        System.out.println("Atributo B: "+ atributoB);
        System.out.println("Atributo C: "+ atributoC);
    }

    public String getAtributoA() {
        return atributoA;
    }

    public void setAtributoA(String atributoA) {
        this.atributoA = atributoA;
    }
}
