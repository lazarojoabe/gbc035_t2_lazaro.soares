import java.util.Scanner;

import static java.lang.Math.sqrt;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int i;
        for(i = 0; i < 6; i++){
            System.out.println("Insira um valor para a posicao "+ i);
            vet[i] = sc.nextInt();
        }
        System.out.println("Exibindo os elementos na ordem inversa: ");
        for(i--; i > -1; i--){
            System.out.print(" " + vet[i]);
        }
    }
    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        for (int i = 0; i < 6; i++){
            System.out.println("Entre com um numero na posicao: " + i);
            vet[i] = sc.nextInt();
            if(vet[i] % 2 != 0){
                System.out.println("Erro! Valor invalido!");
                i--;
            }
        }
        System.out.println("Os numeros digitados foram: ");
        for(int i = 0; i < 6; i++){
            System.out.print(" " + vet[i]);
        }
    }
    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int soma, maior, menor;
        soma = 0;
        maior = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Insira um valor para a posicao "+ i);
            vet[i] = sc.nextInt();
        }
        menor = vet[0];
        for(int i = 0; i < 5; i++){
            soma += vet[i];
            if(maior < vet[i]){
                maior = vet[i];
            }
            if(menor > vet[i]){
                menor = vet[i];
            }
        }
        System.out.println("Os valores lidos sao: ");
        for(int i = 0; i < 5; i++){
            System.out.println(" "+ vet[i]);
        }
        System.out.printf("O maior valor eh %d, o menor, %d, e a media, %.2f", maior, menor, (float) soma/5);

    }
    public  static  void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int soma, maior, menor, indice_maior = 0, indice_menor = 0;
        soma = 0;
        maior = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Insira um valor para a posicao "+ i);
            vet[i] = sc.nextInt();
        }
        menor = vet[0];
        for(int i = 0; i < 5; i++){
            soma += vet[i];
            if(maior < vet[i]){
                maior = vet[i];
            }
            if(menor > vet[i]){
                menor = vet[i];
            }
        }
        System.out.println("Os valores lidos sao: ");
        for(int i = 0; i < 5; i++){
            System.out.println(" "+ vet[i]);
        }
        for(int i = 0; i < 5; i++){
            if(vet[i] == menor){
                indice_menor = i;
            }
            if(vet[i] == maior){
                indice_maior = i;
            }
        }
        System.out.printf("O maior valor eh %d e esta localizado na posicao %d," +
                " o menor, %d e esta localizado na posicao %d, e a media," +
                " %.2f", maior, indice_maior, menor, indice_menor, (float) soma/5);

    }
    public  static  void ex07(){
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        int maior = 0;
        for(int i = 0; i < 5; i++){
            System.out.printf("Insira a nota do aluno %d\n", i+ 1);
            notas[i] = sc.nextInt();
            if(maior < notas[i]){
                maior = notas[i];
            }
        }
        System.out.println("Notas normalizadas!");
        for(int i = 0; i < 5; i++){
            if(notas[i] == maior){
                notas[i] = 100;
            }
            System.out.printf("Nota do aluno %d: ", i + 1);
            System.out.printf("%d\n", notas[i]);
        }
    }
    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int soma = 0;
        float media = 0, variancia = 0;
        double desvio_padrao = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Insira um valor para a posicao " +  (i + 1));
            vet[i] = sc.nextInt();
            soma += vet[i];
        }
        media = soma/5;
        for(int i = 0; i < 5; i++){
            variancia += (vet[i] - media)*(vet[i] - media);
        }
        desvio_padrao = Math.sqrt((double) 1/4 * variancia);
        System.out.println("A media eh " + media + " e o desvio padrao " + desvio_padrao);
    }
    public static void ex09(){
        Scanner sc = new Scanner(System.in);
        int qtd_alunos;
        System.out.println("Qual a quantidade de alunos da turma?");
        qtd_alunos = sc.nextInt();

        if(qtd_alunos <= 100){
            int[] notas = new int[qtd_alunos];
            int soma = 0;
            for(int i = 0; i < qtd_alunos; i++){
                System.out.println("Insira a nota do aluno " + (i + 1));
                notas[i] = sc.nextInt();
                soma += notas[i];
            }
            for(int i = 0; i < qtd_alunos; i++){
                System.out.println("Nota do aluno " + (i+1) + ": " + notas[i]);
            }
            System.out.printf("A media das notas de %d alunos eh: %.2f", qtd_alunos, (float) soma/qtd_alunos);
        } else {
            System.out.println("ERRO! o maximo de alunos permito eh 100!");
        }
    }
    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de A: ", i +1);
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de B: ", i +1);
            B[i] = sc.nextInt();
        }
        System.out.print("O vetor C, definido como A - B: ");
        for(int i = 0; i < 3; i++){
            C[i] = A[i] - B[i];
            System.out.printf("%d ", C[i]);
        }
    }
    public static void ex11(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int[] pares = new int[5];
        int[] impares = new int[5];
        int qtd_par = 0, qtd_impar = 0;
        int i = 0, j = 0, k = 0;
        for( i = 0; i < 5; i++){
            System.out.println("Insira um valor para a posicao " + (i + 1));
            vet[i] = sc.nextInt();
            if(vet[i] % 2 == 0){
                pares[k] = vet[i];
                k++;
            } else {
                impares[j] = vet[i];
                j++;
            }
        }
        qtd_par = k;
        qtd_impar = j;
        System.out.print("Impares: ");
        for(j = 0; j < qtd_impar; j++){
            System.out.printf("%d, ", impares[j]);
        }
        System.out.print("Pares: ");
        for(k = 0; k < qtd_par; k++){
            System.out.printf("%d, ", pares[k]);
        }
    }
    public static void ex12(){
        Scanner sc = new Scanner(System.in);
        int[] qtd_bolinhas = new int[4];
        //Posicao -> cor de bolinhas
        //0 -> Amarelo
        //1 -> Azul
        //2 -> Verde
        //3 -> Vermelho
        int qtd_total = 0;
        float[] prob = new float[4];
        //Posicao -> probabilidade de bolinhas
        //0 -> Amarelo
        //1 -> Azul
        //2 -> Verde
        //3 -> Vermelho

        float maior_prob = 0;

        System.out.println("Digite a quantidade de bolinhas: ");
        System.out.println("Verde: ");
        qtd_bolinhas[2] = sc.nextInt();
        System.out.println("Amarela: ");
        qtd_bolinhas[0] = sc.nextInt();
        System.out.println("Azul: ");
        qtd_bolinhas[1]  = sc.nextInt();
        System.out.println("Vermelha: ");
        qtd_bolinhas[3] = sc.nextInt();

        for(int i = 0; i < 4; i++){
            qtd_total += qtd_bolinhas[i];
        }

        for(int i = 0; i<4; i++){
            prob[i] = (float) qtd_bolinhas[i]/qtd_total;
            if(maior_prob < prob[i]){
                maior_prob = prob[i];
            }
        }
        System.out.println("Probabilidades");
        System.out.printf("Amarelo: %.2f%%\n", 100 * prob[0]);
        System.out.printf("Azul: %.2f%%\n", prob[1] * 100);
        System.out.printf("Verde: %.2f%%\n", prob[2] * 100);
        System.out.printf("Vermelho: %.2f%%\n", prob[3] * 100);
        System.out.printf("Maior probabilidade: %.2f%%", 100 * maior_prob);
    }
    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Entre com um numero: " + (i+1));
            vet[i] = sc.nextInt();
            if(vet[i] < 0){
                vet[i] = 0;
            }
        }
        System.out.println("Zerando negativos: ");
        for(int i = 0; i < 5; i++){
            System.out.printf("%d, ", vet[i]);
        }
    }
    public static void ex14(){
        Scanner sc = new Scanner(System.in);
        int qtd_aluno;
        System.out.println("Quantos alunos serao cadastrados?");
        qtd_aluno = sc.nextInt();

        if(qtd_aluno <= 10000){
            String[] nome = new String[qtd_aluno];
            String[] classe = new String[qtd_aluno];
            float[] cra = new float[qtd_aluno];

            System.out.println("CADASTRANDO ALUNOS: ");
            for(int i = 0; i < qtd_aluno; i++){
                System.out.println("Insira o nome do aluno " + (i+1));
                sc.nextLine();
                nome[i] = sc.nextLine();
                System.out.println("Insira a classe do aluno" + (i+1));
                classe[i] = sc.nextLine();
                System.out.println("Insira o CRA do aluno" + (i+1));
                cra[i] = sc.nextFloat();
            }
            System.out.println("MOSTRANDO DADOS: ");
            for(int i = 0; i < qtd_aluno; i++){
                System.out.println("Nome: " + nome[i]);
                System.out.println("Classe: " + classe[i]);
                System.out.println("CRA: " + cra[i]);
            }
        } else {
            System.out.println("ERRO! O maximo de cadastros eh 10000");
        }
    }
    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] repetidos = new int[8];
        int j = 0;
        for(int i = 0; i < 8; i++){
            System.out.println("Entre com um numero " + (i+1));
            vet[i] = sc.nextInt();
        }
        for(int i = 0; i < 8; i++){
            if(contaRepeticaoDeNum(vet, vet[i]) > 1 && !contem(repetidos, vet[i])){
                repetidos[j] = vet[i];
                j++;
            }
        }
        System.out.print("Valores repetidos: ");
        for(int i = 0; i < j; i++){
            System.out.print(" ," + repetidos[i]);
        }

    }
    public static boolean contem(int[] vet, int num){
        for(int i = 0; i < 8; i++){
            if(vet[i] == num){
                return true;
            }
        }
        return false;
    }
    public static int contaRepeticaoDeNum(int[] vet, int num){
        int qtd_repeticao = 0;
        for(int i = 0; i < 8; i++){
            if(vet[i] == num){
                qtd_repeticao++;
            }
        }
        return qtd_repeticao;
    }

    public static void ex16(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] repetidos = new int[8];
        int[] aparicoes_repetidos = new int[8];
        int j = 0;
        for(int i = 0; i < 8; i++){
            System.out.println("Entre com um numero " + (i+1));
            vet[i] = sc.nextInt();
        }

        for(int i = 0; i < 8; i++){
            if(contaRepeticaoDeNum(vet, vet[i]) > 1 && !contem(repetidos, vet[i])){
                repetidos[j] = vet[i];
                aparicoes_repetidos[j] = contaRepeticaoDeNum(vet, repetidos[j]);
                j++;
            }
        }
        System.out.println("Valores repetidos: ");
        for (int i = 0; i < j; i++){
            System.out.printf("%d, aparece %d vezes\n", repetidos[i], aparicoes_repetidos[i]);
        }
    }
    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        ex16();
    }


}
