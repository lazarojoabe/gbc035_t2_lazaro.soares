package classes;

import abstractClasses.Item;

import java.util.ArrayList;
import java.util.List;

public class PratoPrincipal extends Item {
  private List<String> ingredientes;
  private String descricao;
  private int tempoDePreparo; //em minutos
  public PratoPrincipal(String nome, String id, float precoDeCusto, float precoUnitario,
                        List<String> ingredientes, String descricao, int tempoDePreparo) {
    super(nome, id, precoDeCusto, precoUnitario);
    this.ingredientes = ingredientes;
    this.descricao = descricao;
    this.tempoDePreparo = Math.abs(tempoDePreparo);
  }

  public List<String> getIngredientes() {
    return ingredientes;
  }

  public void setIngredientes(ArrayList<String> ingredientes) {
    this.ingredientes = ingredientes;
  }

  public void addIngrediente(String ingrediente) {
    ingredientes.add(ingrediente);
  }

  public void removeIngrediente(String ingrediente){
    int index = ingredientes.indexOf(ingrediente);
    if(index != -1) {
      ingredientes.remove(index);
    } else {
      System.out.println("A lista de ingredientes não possui o item " + ingrediente);
    }
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getTempoDePreparo() {
    return tempoDePreparo;
  }

  public void setTempoDePreparo(int tempoDePreparo) {
    this.tempoDePreparo = tempoDePreparo;
  }

  public void mostrarIngredientes(){
    System.out.println("Ingredientes:");
    for (String ingrediente: ingredientes) {
      System.out.println("   " + ingrediente);
    }
  }

  @Override
  public void mostrarItem(){
    System.out.println("-------------\nPRATO PRINCIPAL\n-------------");
    super.mostrarItem();
    mostrarIngredientes();
    System.out.println("Descricao: " + descricao + "\nTempo de preparo: " + tempoDePreparo);
  }
}
