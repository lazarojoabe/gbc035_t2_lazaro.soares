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
        System.out.println("Aumentando o preco em 10% do produto 1 e 3");
        altera_preco((float)preco[0], -110);
        altera_preco((float)preco[2], 10);
        System.out.println("Reduzindo o preco em 5% do produto 2");
        if(altera_preco((float)preco[1], -5) == -1){
            System.out.println("Erro! Preco nao alterado. Porcentagem invalida");
        } else {
            System.out.println("\nPreco alterado com sucesso");
        }

        System.out.println("\nAlterando o preco do produto 3");
        if(altera_preco((float)preco[3], -110) == -1){
            System.out.println("Erro! Preco nao alterado. Porcentagem invalida");
        }
        System.out.println("Produtos cadastrados: \n");
        for(int i = 0; i < 4; i++){
            System.out.printf("\nProduto: %s\nPreco: %.2f\nEstoque: %d", nome[i], preco[i], qtd_estoque[i]);
        }
    }
    public static int altera_preco(float preco, float porcentagem){
        float temp;

        if(porcentagem > -100){
            temp = 1 + porcentagem/100;
            preco = preco * porcentagem;
            return 0;
        } else {
            return -1;
        }
    }
}
