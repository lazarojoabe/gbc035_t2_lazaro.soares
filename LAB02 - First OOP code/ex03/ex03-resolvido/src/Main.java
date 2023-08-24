import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figurinha[] vet = new Figurinha[3];
        vet[0] = new Figurinha();
        vet[1] = new Figurinha();
        vet[2] = new Figurinha();
        int i;

        for(i = 0; i < 3; i++){
            sc.nextLine();//-> lidar com o problema do buffer
            System.out.println("Insira o nome do jogador " + (i+1));
            vet[i].setNome(sc.nextLine());
            System.out.println("Insira posicao do jogador " + (i+1));
            vet[i].setPosicao(sc.nextLine());
            System.out.println("Insira o peso do jogador " + (i+1));
            vet[i].setPeso(sc.nextFloat());
            System.out.println("Insira a altura do jogador " + (i+1));
            vet[i].setAltura(sc.nextFloat());
            sc.nextLine();
            System.out.println("Insira a data de nasciemnto do jogador " + (i+1));
            vet[i].setData_nasc(sc.nextLine());
            System.out.println("Insira o país do jogador " + (i+1));
            vet[i].setPais(sc.nextLine());
        }
        for(i = 0; i < 3; i++){
            System.out.println("Informações do jogador " + (i+1));
            vet[i].mostrarInfo();
        }
    }
}
