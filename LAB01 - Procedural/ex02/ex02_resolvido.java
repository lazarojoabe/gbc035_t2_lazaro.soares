import  java.util.Scanner;
public class ex02_resolvido {
    public static void main(String[] args) {
        String nome[] = new String[4];
        double preco[] = new double[4];
        int qtd_estoque[] = new int[4];
        Scanner leitura = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            System.out.println("Informe o nome, o preco e a quantidade\n");
            nome[i] = leitura.next();
            preco[i] = leitura.nextDouble();
            qtd_estoque[i] = leitura.nextInt();
        }
    }
    public static int altera_preco(float preco, float porcentagem){
        float temp;

        if(porcentagem > -100){
            temp = 1 + porcentagem/100;
            preco = preco * porcentagem;
            return 0;
        } else {
            return  -1;
        }


    }
}
