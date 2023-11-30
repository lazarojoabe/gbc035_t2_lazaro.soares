package enumClasses;

public enum TipoEmbalagem {
  LATA("Lata"),
  GARRAFAPLASTICA("Garrafa Plástica"),
  GARRAFAVIDRO("Garrafa de Vidro"),
  OUTROS("Outro");

  private String descricao;

  TipoEmbalagem(String descricao){
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }
}
