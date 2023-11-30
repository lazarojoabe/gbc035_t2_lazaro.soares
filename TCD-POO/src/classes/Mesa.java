package classes;

import abstractClasses.Item;

import java.util.ArrayList;

public class Mesa {
  private int numero;
  private boolean pedidoRealizado;
  private Cliente cliente;
  private Pedido pedido; //relação de composicao entre mesa e pedido
  private ArrayList<Item> comandaItens = new ArrayList<Item>();
  private Caixa caixa;

  public Mesa() {
    pedido = new Pedido();
    numero = -1;
    pedidoRealizado = false;
    pedido.setValorTotal(0);
  }
  public Mesa(Cliente cliente, int numero, Caixa caixa) {
    this.cliente = cliente;
    this.numero = numero;
    this.caixa = caixa;
    pedidoRealizado = false;
    pedido.setValorTotal(0);
  }

  public void mostrarComanda() {
    int tamanhoMinimo = 20;

    System.out.println("COMANDA MESA " + numero);
    // Usando String.format()
    String formato = "%-" + tamanhoMinimo + "s";
    String resultado;
    for (Item i: comandaItens) {
      resultado = String.format(formato, i.getNome());
      System.out.println(resultado + "R$" + i.getPrecoUnitario());
    }
    resultado = String.format(formato, "Valor total:");
    System.out.println(resultado + "R$" + pedido.getValorTotal());
  }

  public boolean isPedidoRealizado() {
    return pedidoRealizado;
  }

  public void setPedidoRealizado(boolean isPedidoRealizado) {
    this.pedidoRealizado = isPedidoRealizado;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setValorTotal(float valorTotal) {
    pedido.setValorTotal(valorTotal);
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void setCaixa(Caixa caixa){ this.caixa = caixa;}
  public ArrayList<Item> getComandaItens() {
    return comandaItens;
  }

  public void setComandaItens(ArrayList<Item> comandaItens) {
    this.comandaItens.addAll(comandaItens);
  }

  public void realizarPagamento(){
    caixa.receberPagamento(this, pedido);
  }
}
