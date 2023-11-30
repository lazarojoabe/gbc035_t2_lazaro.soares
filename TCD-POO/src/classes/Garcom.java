package classes;
import abstractClasses.Funcionario;
import abstractClasses.Item;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Garcom extends Funcionario {
  private double salarioBase;
  private String diaDeFolga;
  private Pedido pedido; //pedido pelo qual o Garçom será responsável por cuidar
  private Mesa mesa; //mesa em que o garçom estará atendendo
  //OBS: nesse programa definimos que cada garçom é responsável por uma mesa e um pedido
  public Garcom(String nome, String cpf, String carteiraDeTrabalho, String dataAdmissao, String numCarteiraTrabalho,
                String diaDeFolga, double salarioBase) {
    super(nome, cpf);
    setDataAdmissao(dataAdmissao);
    setNumCateiraTrabalho(numCarteiraTrabalho);
    this.salarioBase = salarioBase;
    this.diaDeFolga = diaDeFolga;
  }

  public void calcSalario() {
    if(Restaurante.qtdLimitePedidos < Restaurante.qtdTotalPedidos){
      salario = salarioBase + 1000;
      //$1.000 é a bonificação definida caso o restaurante atinja a quantidade limite depedidos
    } else {
      salario = salarioBase;
    }
  }

  public void anotarPedido(Mesa mesa, Cozinheiro cozinheiro) {
    this.mesa = mesa;
    Cardapio cardapio = new Cardapio();
    pedido = new Pedido();
    ArrayList<Item> pratos = new ArrayList<Item>(); //Vai conter todos os id's de pratos pedidos
    Scanner sc = new Scanner(System.in);
    char decisaoCliente; //Decisão se vai pedir mais um prato
    String pratoId;

    do {
      System.out.println("\n\nQual pedido você gostaria de fazer? (Digite o código)");
      pratoId = sc.nextLine().trim().toUpperCase();
      if(cardapio.verificaPrato(pratoId)) {
        pratos.add(cardapio.getItemByID(pratoId));
        if(cardapio.getItemByID(pratoId) instanceof PratoPrincipal){
          cozinheiro.setQtdPratosPrincipaisPreparados(cozinheiro.getQtdPratosPrincipaisPreparados() + 1);
        } else if(cardapio.getItemByID(pratoId) instanceof Sobremesa){
          cozinheiro.setQtdSobremesasPreparadas(cozinheiro.getQtdSobremesasPreparadas() + 1);
        }

        cozinheiro.calcSalario();
        Restaurante.qtdTotalPedidos++;
        calcSalario();
        System.out.println("Gostaria de pedir algo mais? [S/N]");
        decisaoCliente = sc.next().charAt(0);
        if (sc.hasNextLine()) sc.nextLine();
      } else {
        System.out.println("O prato pedido não existe...");
        decisaoCliente = 'S';
      }
    } while (Character.compare(decisaoCliente, 'S') == 0 ||
            Character.compare(decisaoCliente, 's') == 0);

    pedido.fazerPedido(this, cozinheiro, pratos, mesa);
    System.out.println("Assim que estiver tudo pronto venho entregar o seu pedido. Pedido " +
            "finalizado!\n\n");
  }
  public void mostrarCardapio() {
    Cardapio cardapio = new Cardapio();
    cardapio.exibir();
  }

  public void descreverItem(String id){
    Cardapio c = new Cardapio();
    Item i = c.getItemByID(id);
    int tamanhoMinimo = 20;
    String formato = "%-" + tamanhoMinimo + "s";
    String resultado = String.format(formato, i.getNome());

    if(i != null) {
      System.out.println(i.getId() + " - " + resultado + "R$" + i.getPrecoUnitario());
      if(i instanceof PratoPrincipal) {
        System.out.println(((PratoPrincipal) i).getDescricao());
      } else if (i instanceof Sobremesa) {
        System.out.println(((Sobremesa) i).getDescricao());
      }
    }
  }
}
