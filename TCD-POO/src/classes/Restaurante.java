package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Restaurante {
  public static int qtdLimitePedidos = 100;
  public static int qtdTotalPedidos = 0;

  public Restaurante() {
    atualizaQtdPedidosPagos();
  }

  public void atualizaQtdPedidosPagos() {
    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader("pagamentos.txt"));

      int numberOfLines = 0;

      while (bufferedReader.readLine() != null) {
        numberOfLines++;
      }
      bufferedReader.close();
      qtdTotalPedidos = numberOfLines;
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {

    Restaurante r = new Restaurante();
    Caixa caixa = new Caixa();
    Cardapio cardapio = new Cardapio();
    ArrayList<Integer> mesasOcupadas = new ArrayList<Integer>();
    //Entidades do classes.Restaurante
    Garcom gr = new Garcom("Fábio", "83337585337", "123", "09/10", "12", "12", 70f);
    Cozinheiro cozinheiro = new Cozinheiro("Felipe", "83337585337", cardapio.getCardapio(), "256", "12/11", "32");

    //Cliente
    Cliente cliente = new Cliente();
    Scanner sc = new Scanner(System.in);
    Mesa mesa = new Mesa();
    int temp;

    //Apresentação (Balconista)
    System.out.println("'BALCONISTA': Olá, seja bem vindo ao Restaurante JAVAli!");
    System.out.println("Qual o seu nome? ");
    cliente.setNome(sc.nextLine().trim());
    do {
      do{
        System.out.println("Qual mesa você gostaria de se sentar? (1 ao 30)");
        temp = sc.nextInt();
        if(temp < 1 || temp > 30){
          System.out.println("Por favor, escolha uma mesa válida!");
        }
      } while(temp < 1 || temp > 30);
      if (mesasOcupadas.contains(temp)) {
        System.out.println("Essa mesa já está ocupada...");
        temp = -1;
      } else {
        mesa.setNumero(temp);
        mesa.setCliente(cliente);
        mesa.setCaixa(caixa);
        cliente.setMesa(mesa);
        System.out.println("Pode se sentar, fique à vontade, o garçom já vem atender você.");
      }

    } while (temp < 1);
    System.out.println("\n\n\n'GARÇOM': Olá, seja bem vindo! Menu nome é " + gr.getNome() + ", " +
            "estarei cuidando da sua mesa hoje. Deixe-me apresentar o nosso cardápio.");
    cliente.setGarcom(gr);
    cliente.setCozinheiro(cozinheiro);
    gr.mostrarCardapio();
    cliente.menuAcoes();

  }

}
