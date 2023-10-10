public class Amigos extends Contato{
    private int grau;

    public Amigos(String apelido, String nome, String email, String aniversario, int grau){
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public void imprimirContato(){
        imprimirBasico();
        String grauAmizade = " ";
        switch (grau){
            case 1:
                grauAmizade = "melhor amigo";
            case 2:
                grauAmizade = "amigo";
            case 3:
                grauAmizade = "conhecido";
        }
        System.out.println("Grau de amizade: " + grauAmizade);
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
}
