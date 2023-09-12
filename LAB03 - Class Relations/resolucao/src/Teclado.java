import java.util.Scanner;

public class Teclado {
    private int qtd_teclas;
    private Tecla[] teclas;

    public Teclado(int qtd_teclas){
        this.qtd_teclas = qtd_teclas;
        teclas = new Tecla[qtd_teclas];
    }

    public void getInfo(){
        System.out.println("Teclas: ");
        for(int i = 0; i < qtd_teclas; i++) System.out.println(teclas[i].getConteudo());
    }
    public void adcionarTeclas(){
        Scanner sc = new Scanner(System.in);
        char tecla;
        for(int i = 0; i < qtd_teclas; i++){
            teclas[i] = new Tecla();
            System.out.println("Insira a tecla " + (i+1));
            tecla = sc.next().charAt(0);
            teclas[i].setConteudo(tecla);
        }
    }
    public int getQtd_teclas() {
        return qtd_teclas;
    }

    public void setQtd_teclas(int qtd_teclas) {
        this.qtd_teclas = qtd_teclas;
    }

    public Tecla[] getTeclas() {
        return teclas;
    }

    public void setTeclas(Tecla[] teclas) {
        this.teclas = teclas;
    }
}
