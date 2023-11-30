package classes;

import abstractClasses.Item;
import enumClasses.TipoEmbalagem;

public class Bebida extends Item {
  private int tamanhoEmbalagem; //em ml
  private TipoEmbalagem tipoEmbalagem;
  public Bebida(String nome, String id, float precoDeCusto, float precoUnitario,
                       int tamanhoEmbalagem, TipoEmbalagem tipoEmbalagem) {
    super(nome, id, precoDeCusto, precoUnitario);
    this.tipoEmbalagem = tipoEmbalagem;
    this.tamanhoEmbalagem = Math.abs(tamanhoEmbalagem);
  }

  public int getTamanhoEmbalagem() {
    return tamanhoEmbalagem;
  }

  public void setTamanhoEmbalagem(int tamanhoEmbalagem) {
    this.tamanhoEmbalagem = Math.abs(tamanhoEmbalagem);
  }

  public String getTipoEmbalagem() {
    return tipoEmbalagem.getDescricao();
  }

  public void setTipoEmbalagem(TipoEmbalagem tipoEmbalagem) {
    this.tipoEmbalagem = tipoEmbalagem;
  }

  @Override
  public void mostrarItem(){
    System.out.println("-------------\nBEBIDA\n-------------");
    super.mostrarItem();
    System.out.println("Tamanho da Embalagem: " + tamanhoEmbalagem + "\nTipo da Embalagem: " + tipoEmbalagem.getDescricao() + "ml");
  }
}
