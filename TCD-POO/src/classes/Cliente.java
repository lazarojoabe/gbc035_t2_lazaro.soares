package classes;

import java.util.Date;
import java.util.Scanner;

public class Cliente {
  //Essa classe trata tudo referente às açõs do cliente. Além disso, está associada a ela o
  // Garçom e Cozinheiro designados a atendê-lo. Cada atributo será preenchido com o decorrer do
  // atendimento em classes.Restaurante.
  private Mesa mesa;
  private String nome;
  private Garcom garcom;
  private Cozinheiro cozinheiro;

  private Caixa caixa;

  public Cliente() {
    nome = "";
    mesa = null;
    garcom = null;
  }

  public Cliente(String nome, Garcom garcom, Mesa mesa) {
    this.nome = nome;
    this.garcom = garcom;
    this.mesa = mesa;
  }

  public void menuAcoes() {
    Scanner sc = new Scanner(System.in);
    int opt;
    String temp;
    int opcaoPagamento;
    double pagamento;

    if(mesa.isPedidoRealizado()) {
      do {
        System.out.println("Opções:\n[1] Fazer novo pedido\n[2] Ver cardapio\n[3] Ver descricao " +
                "de um item\n[4] Ver comanda\n[5] Realizar pagamento\n[6] Sair");
        opt = sc.nextInt();
        if (opt > 6 || opt < 1) {
          System.out.println("Opção inválida...");
        }
        if (sc.hasNextLine()) sc.nextLine();
      } while (opt > 6 || opt < 1);

      switch (opt) {
        case 1:
          fazerPedido();
          menuAcoes();
          break;
        case 2:
          verCardapio();
          menuAcoes();
          break;
        case 3:
          System.out.println("Digite o ID do item: ");
          temp = sc.nextLine();
          verDescricaoItem(temp);
          menuAcoes();
          break;
        case 4:
          verComanda();
          menuAcoes();
          break;
        case 5:
          realizarPagamento();
          menuAcoes();
          break;
        case 6:
          System.out.println("Muito obrigado pela presença, volte sempre!\nSaindo do programa...");
        default:
          break;
      }
    } else {
      do {
        System.out.println("Opções:\n[1] Fazer pedido\n[2] Ver cardapio\n[3] Ver descricao de um " +
                "item\n[4] Sair");
        opt = sc.nextInt();
        if (opt > 4 || opt < 1) {
          System.out.println("Opção inválida...");
        }
        if (sc.hasNextLine()) sc.nextLine();
      } while (opt > 4 || opt < 1);

      switch (opt) {
        case 1:
          fazerPedido();
          menuAcoes();
          break;
        case 2:
          verCardapio();
          menuAcoes();
          break;
        case 3:
          System.out.println("Digite o ID do item: ");
          temp = sc.nextLine();
          verDescricaoItem(temp);
          menuAcoes();
          break;
        case 4:
          System.out.println("Muito obrigado pela presença, volte sempre!\nSaindo do programa...");
        default:
          break;
      }
    }
  }

  public void fazerPedido() {
    garcom.anotarPedido(mesa, cozinheiro);
  }

  public void verCardapio() {
    garcom.mostrarCardapio();
  }

  public void verDescricaoItem(String id) {
    garcom.descreverItem(id);
  }

  public void verComanda() {
    mesa.mostrarComanda();
  }

  public void realizarPagamento(){
    mesa.realizarPagamento();
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setMesa(Mesa mesa) {
    this.mesa = mesa;
  }

  public Mesa getMesa() {
    return mesa;
  }

  public void setGarcom(Garcom garcom) {
    this.garcom = garcom;
  }

  public Garcom getGarcom() {
    return garcom;
  }

  public void setCozinheiro(Cozinheiro cozinheiro) {
    this.cozinheiro = cozinheiro;
  }

  public Cozinheiro getCozinheiro() {
    return cozinheiro;
  }
}
