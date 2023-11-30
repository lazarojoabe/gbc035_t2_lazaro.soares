package abstractClasses;

public abstract class Item {
  protected String nome;
  protected String id;
  protected float precoUnitario;
  protected float precoDeCusto;

  public Item(String nome, String id, float precoDeCusto, float precoUnitario) {
    this.nome = nome.substring(0,1).toUpperCase().concat(nome.substring(1));
    this.precoUnitario = Math.abs(precoUnitario);
    this.precoDeCusto = Math.abs(precoDeCusto);
    this.id = setConstructorId(id);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getId() {
    return id;
  }

  public float getPrecoUnitario() {
    return precoUnitario;
  }

  public void setPrecoUnitario(float precoUnitario) {
    this.precoUnitario = Math.abs(precoUnitario);
  }

  public float getPrecoDeCusto() {
    return precoDeCusto;
  }

  public void setPrecoDeCusto(float precoDeCusto) {
    this.precoDeCusto = Math.abs(precoDeCusto);
  }

  private String setConstructorId(String id) throws IllegalArgumentException{

    //Faz a verificação se o id foi passado corretamente.
    //Se o id for maior que 5, ele será truncado.
    if(id.length() > 5 || id.length() == 5){
      int countNum = 0;
      int countChar = 0;
      for (int i = 0; i < 5; i++) {
        if(Character.isLetter(id.charAt(i))){
          countChar++;
        } else if (Character.isDigit(id.charAt(i))) {
          countNum++;
        }
      }

      if(countChar == 3 && countNum == 2) {
        return id.substring(0,5);
      } else {
         throw new IllegalArgumentException("O campo ID requer ao menos 3 caracteres e 2 números." +
                 " O valor passado é inválido.");
      }
    } else {
      return id;
    }
  }

  public void mostrarItem(){
    System.out.println("Nome: " + nome + "\nPreço unitário: R$" + precoUnitario + "\nPreço de " +
            "custo: R$" + precoDeCusto + "\nID: #" + id);
  }
}
