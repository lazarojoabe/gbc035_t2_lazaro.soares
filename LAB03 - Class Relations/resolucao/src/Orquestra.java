public class Orquestra {
    private int qtd_musico;
    private int qtd_naipe;
    private String maestro;
    private String[] naipe = new String[qtd_naipe];
    private Musico[] musicos = new Musico[qtd_musico];

    public Orquestra(int qtd_musico, int qtd_naipe){
        this.qtd_musico = qtd_musico;
        this.qtd_naipe = qtd_naipe;
    }
    public void cadastrarMusicos(){
        for()
    }
    public void getInfo(){
        System.out.println("Qtd de musicos: " + qtd_musico);
        System.out.println("Maestro: " + maestro);
        System.out.println("Musicos: ");
        for (Musico m : musicos) {
            System.out.printf("Nome: %s, Naipe: %s", m.getNome(), m.getNaipe());
        }

    }
    public void setMusicos(Musico[] musicos) {
        this.musicos = musicos;
    }

    public String[] getNaipe() {
        return naipe;
    }

    public void setNaipe(String[] naipe) {
        this.naipe = naipe;
    }
}
